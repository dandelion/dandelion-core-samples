core-thymeleaf-versioning-fixed
=================================================================

A sample application which shows how to configure a fixed versioning using Maven filtering.

## Technology stack

 - Thymeleaf 2.1.4.RELEASE
 - Dandelion 1.1.0
 - Spring 3.2.10.RELEASE

## Features
		
 - Fixed versioning (String)

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/core-tml-fixed

You can then access the sample here: [http://localhost:9090/core-thymeleaf-versioning-fixed](http://localhost:9090/core-thymeleaf-versioning-fixed)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-core-samples/issues](https://github.com/dandelion/dandelion-core-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).