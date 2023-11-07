# toolchain
Test compile a project in JDK17 with multiple modules, each one with a distinct java version (java 8, java 11 and jdk17)

[toolchain]

## Prerequisites

To run the application locally, you need to ensure that the following prerequisites are met:
Install JDK17
[Eclipse Adoptium jdk17][jdk17-download]
Install java 11
[jdk-11.0.12.7][java11-download]
Install java 8
[jdk1.8.0_202][java8-download]

[Apache Maven][maven]

[git][git]


## Installation
Create a toolchains.xml file in your .m2 folder.

![image](https://github.com/pablo-gago/toolchain/assets/85281751/5f1a6a94-9c2c-4dbe-b670-49056fdc0e0a)

## Execute
clean install 

Running all test you can see that each module is compiled and executed with a distinct java version

[git]: https://git-scm.com/

[sboot]: https://projects.spring.io/spring-boot/

[maven]: https://maven.apache.org/download.cgi

[jdk17-download]: https://adoptium.net/es/temurin/releases/

[java11-download]: https://www.oracle.com/mx/java/technologies/javase/jdk11-archive-downloads.html

[java8-download]: https://www.oracle.com/es/java/technologies/javase/javase8-archive-downloads.html

[toolchain]: https://maven.apache.org/guides/mini/guide-using-toolchains.html




