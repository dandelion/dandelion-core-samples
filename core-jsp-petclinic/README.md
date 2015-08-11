core-jsp-petclinic
=================================================================

A sample application which shows how to use several features of Dandelion in the famous Spring Petclinic application.

The original sample application live here: https://github.com/spring-projects/spring-petclinic

## Technology stack

 - Dandelion 1.1.1
 - Spring 4.1.6.RELEASE
 - Spring Data JPA 1.8.0.RELEASE
 - Hibernate 4.3.8.Final
 - Bootstrap webjar 2.3.0
 - jQuery UI webjar 1.10.3
 - jQuery webjar 1.11.3
 - DataTables webjar 1.10.7
 
## Features

 - Webjars
 - Dandelion-Datatables as a standalone component
 - Dandelion JSP taglib
 - Debugger

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/core-jsp-petclinic

You can then access the sample here: [http://localhost:9090/core-jsp-petclinic](http://localhost:9090/core-jsp-petclinic)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-core-samples/issues](https://github.com/dandelion/dandelion-core-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).