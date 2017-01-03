clienttools Project
=======================

#### Description
This project contains standalone tools for working with the hpccsystems platform.

#### Build
This project is to be built using Maven. To build the projects using Maven, navigate to the base directory of the project and issue the following command:

`mvn install`

Developers who want to do a deployment must insure they have their credentials set in settings.xml under their maven configuration folder.  The following command will execute a clean build of the jar, jar-with-dependencies, javadoc, and source packages.  It will also attempt to sign the packages before uploading them to the sonatype repository for staging.

`mvn clean deploy -P release`

Maintainers can then release the artifacts from staging if the artifacts pass muster.

For more information on how to use Maven see http://maven.apache.org

#### Changelog
###### 1.0.0
- Migration from internal maven repository to external maven repository
- javadoc generation included in project

#### Contributions

All contributions must follow the JAVA source format described in the HPCC-JAVA-Formatter.xml file which can be found in /eclipse.
This formatter can be used by the Eclipse IDE to automatically format JAVA source code.

- From eclipse, choose Window->Preferences->Java->Code Stype->Formatter...

- Import the HPCC-JAVA-Formatter.xml file and set it as the Active profile.

- From the JAVA editor, choose Source->Format