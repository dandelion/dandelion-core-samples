core-thymeleaf-starter
=================================================================

A sample application which shows the key concepts around Dandelion: assets, asset bundles, asset locators, interacting with the bundle graph and the debugger.

## Technology stack

 - Thymeleaf 2.1.4.RELEASE
 - Dandelion 1.0.1-SNAPSHOT
 - Spring 3.2.10.RELEASE

## Features
		
 - Asset bundles (vendor & user)
 - Asset locators
 - Debugger

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/core-tml-starter

You can then access the sample here: [http://localhost:9090/core-thymeleaf-starter](http://localhost:9090/core-thymeleaf-starter)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-core-samples/issues](https://github.com/dandelion/dandelion-core-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).