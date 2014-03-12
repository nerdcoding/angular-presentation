### Description

Simple Spring application with AngularJS web frontend. The application uses:

* An embedded H2 database which is initialized during deployment.
* JPA2 with Hibernate as persistence layer.
* Spring Data for domain access.
* Spring for dependency injection and transaction handling.
* Jersey as JAX-RS implementation for REST services.
* AngularJS as browser based javascript web framework.

The application uses a embedded H2 database which is initialized during deployment. Anymore the REST service could be
invoked by the URL `http://127.0.0.1:8080/angular/rest/grocery`

### Build

The application build is done via Gradle with a simple

```
gradle build
```

After the build ends successfully there should be an `angular.war` in the `build/libs` directory.

### Deployment

This application was tested on the Apache Tomcat 7.0.50. Therefor you need to download and install the
[Tomcat](http://tomcat.apache.org/download-70.cgi). Than start Tomcat in debug mode with the script
`TOMCAT_HOME/bin/catalina.sh jpda run` and copy the `angular.war` into the directory `TOMCAT_HOME/webapps/`.

### Use Application

Open a web browser and use the application with the url `http://127.0.0.1:8080/angular/app/example.html`.

Anymore the REST service could be invoked with a HTTP GET request on the URL `http://127.0.0.1:8080/angular/rest/grocery`. 
