Semantic-enhanced CoAP framework
===================

_semantic-coap_ proposes a complete framework for [RFC 7252 Constrained Application Protocol](https://tools.ietf.org/html/rfc7252) (CoAP) to publish and discover semantic-enhanced resources.

Modules
-------------

_semantic-coap_ consists of the following sub-projects:

- _semantic-coap-core_: basic Java-based framework implementation extending the [Californium CoAP](https://github.com/eclipse/californium) library;
- _semantic-coap-android_: simple project using _semantic-coap-core_ on Android platform;
- _ssn-framework_: reference gateway and sink implementation used to setup a Semantic Sensor Network (SSN);

The following module is also required as local Maven dependencies:

- [FemtoZip](https://github.com/gtoubassi/femtozip) compression library.


Usage with Eclipse and Maven
-------------

Each module can be imported as Maven project in Eclipse. Make sure to have the following plugins before importing _semantic-coap_ projects:

- [Eclipse EGit](http://www.eclipse.org/egit/)
- [M2Eclipse - Maven Integration for Eclipse](http://www.eclipse.org/m2e/)

License
-------------

All _semantic-coap_ modules are distributed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

Contribute
-------------
The main purpose of this repository is to share and continue to improve the _semantic-coap_ framework, making it easier to use. If you're interested in helping us any feedback you have about using _semantic-coap_ would be greatly appreciated. 