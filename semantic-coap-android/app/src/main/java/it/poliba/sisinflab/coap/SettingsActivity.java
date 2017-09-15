package it.poliba.sisinflab.coap;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.MenuItem;

import org.eclipse.californium.core.coap.MediaTypeRegistry;

import java.util.Set;

import it.poliba.sisinflab.owleditor.OWLBuilderFragment;
import it.poliba.sisinflab.owleditor.OWLEditorActivity;

/**
 * A {@link PreferenceActivity} that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 * <p>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */
public class SettingsActivity extends AppCompatPreferenceActivity {
    /**
     * A preference value change listener that updates the preference's summary
     * to reflect its new value.
     */
    private static Preference.OnPreferenceChangeListener sBindPreferenceSummaryToValueListener = new Preference.OnPreferenceChangeListener() {
        @Override
        public boolean onPreferenceChange(Preference preference, Object value) {
            String stringValue = value.toString();

            if (preference instanceof ListPreference) {
                // For list preferences, look up the correct display value in
                // the preference's 'entries' list.
                ListPreference listPreference = (ListPreference) preference;
                int index = listPreference.findIndexOfValue(stringValue);

                // Set the summary to reflect the new value.
                preference.setSummary(
                        index >= 0
                                ? listPreference.getEntries()[index]
                                : null);

            } else {
                // For all other preferences, set the summary to the value's
                // simple string representation.
                preference.setSummary(stringValue);
            }
            return true;
        }
    };

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new CoapSemanticPreferenceFragment()).commit();
    }

    /**
     * Helper method to determine if the device has an extra-large screen. For
     * example, 10" tablets are extra-large.
     */
    private static boolean isXLargeTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_XLARGE;
    }

    /**
     * Binds a preference's summary to its value. More specifically, when the
     * preference's value is changed, its summary (line of text below the
     * preference title) is updated to reflect the value. The summary is also
     * immediately updated upon calling this method. The exact display format is
     * dependent on the type of preference.
     *
     * @see #sBindPreferenceSummaryToValueListener
     */
    private static void bindPreferenceSummaryToValue(Preference preference) {
        // Set the listener to watch for value changes.
        preference.setOnPreferenceChangeListener(sBindPreferenceSummaryToValueListener);

        // Trigger the listener immediately with the preference's
        // current value.
        sBindPreferenceSummaryToValueListener.onPreferenceChange(preference,
                PreferenceManager
                        .getDefaultSharedPreferences(preference.getContext())
                        .getString(preference.getKey(), ""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean onIsMultiPane() {
        return isXLargeTablet(this);
    }

    /**
     * This method stops fragment injection in malicious applications.
     * Make sure to deny any unknown fragments here.
     */
    protected boolean isValidFragment(String fragmentName) {
        return PreferenceFragment.class.getName().equals(fragmentName)
                || CoapSemanticPreferenceFragment.class.getName().equals(fragmentName);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static class CoapSemanticPreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.pref_coap_semantic);

            loadMediaType();

            bindPreferenceSummaryToValue(findPreference("ct_key"));

            bindPreferenceSummaryToValue(findPreference("ro_key"));
            bindPreferenceSummaryToValue(findPreference("st_key"));
            bindPreferenceSummaryToValue(findPreference("sr_key"));
            bindPreferenceSummaryToValue(findPreference("sd_key"));
            bindPreferenceSummaryToValue(findPreference("at_key"));

            bindPreferenceSummaryToValue(findPreference("lat_key"));
            bindPreferenceSummaryToValue(findPreference("lon_key"));
            bindPreferenceSummaryToValue(findPreference("md_key"));

            Preference buildSD = (Preference) findPreference("sd_key");
            buildSD.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                @Override
                public boolean onPreferenceClick(Preference preference) {
                    new AlertDialog.Builder(getActivity())
                    .setTitle(getString(R.string.pref_summary_sem_desc))
                    .setItems(R.array.pref_sem_desc_array, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            switch (i) {
                                case 0: //build new rewquest
                                    Intent intent = new Intent(getActivity(), OWLEditorActivity.class);
                                    intent.putExtra(getString(R.string.app_style_key), R.style.AppTheme_AppBarOverlay);
                                    intent.putExtra(getString(R.string.owl_string_key), MainTabActivity.onto_as_string);
                                    intent.putExtra(getString(R.string.owl_fragment_key), OWLBuilderFragment.class.getSimpleName());
                                    startActivity(intent);
                                    break;
                                case 1: //select from folder
                                    SharedPreferences.Editor prefs = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                                    prefs.putString("sd_key", getString(R.string.pref_default_sem_desc));
                                    prefs.commit();
                                    break;
                            }
                        }
                    })
                    .create().show();

                    return true;
                }
            });
        }

        private void loadMediaType() {
            Set<Integer> types = MediaTypeRegistry.getAllMediaTypes();
            CharSequence[] entries = new CharSequence[types.size()];
            CharSequence[] entryValues = new CharSequence[types.size()];

            int i=0;
            for (int value : types) {
                entryValues[i] = String.valueOf(value);
                entries[i] = MediaTypeRegistry.toString(value);
                i++;
            }

            ListPreference pref = (ListPreference) findPreference("at_key");
            pref.setEntries(entries);
            pref.setEntryValues(entryValues);

            ListPreference ct_pref = (ListPreference) findPreference("ct_key");
            ct_pref.setEntries(entries);
            ct_pref.setEntryValues(entryValues);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            if (id == android.R.id.home) {
                startActivity(new Intent(getActivity(), SettingsActivity.class));
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }
}
