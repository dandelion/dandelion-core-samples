core-thymeleaf-bower
=================================================================

A sample application that uses the BowerPreLoader to pre-load vendor bundles. All Bower components are saved in the `src/main/webapp/bower_components` folder.

## Technology stack

 - Thymeleaf 2.1.4.RELEASE
 - Dandelion 1.1.0-SNAPSHOT
 - Spring 3.2.10.RELEASE

## Features
		
 - Asset bundles (vendor & user)
 - BowerPreLoader

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/core-tml-bower

You can then access the sample here: [http://localhost:9090/core-thymeleaf-bower](http://localhost:9090/core-thymeleaf-bower)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-core-samples/issues](https://github.com/dandelion/dandelion-core-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).