# Vertica plugin for Gephi

This project provide a plugin for Gephi to load graphic data processed by Vertica database.

[Gephi](http://gephi.org) is a **fast**, **simple** and **modular** open-source tool for visualizing and manipulating large graphs. It runs on Windows, Mac OS X and Linux.

![Gephi](https://camo.githubusercontent.com/a1d3d2f7353786ffa3ff23ff92ac60d0eee28b2c20cc46cd4a9670a172988afb/687474703a2f2f67657068692e6769746875622e696f2f6373732f696d616765732f696c6c757374726174696f6e732f686f6d655f73637265656e73686f742e6a7067)


## Get Started

### Installation

  You can [download](../../releases) the latest version of binary, or build it from the source code, than install it in Gephi.

#### Requirements

- Java 1.8

- [Optional] [Apache Maven](http://maven.apache.org/) version 3.2.2 or later for build from source code.

- [Optional] Vertica JDBC driver in maven repository for build from source code.

  ``` BASH
  $ wget -O /tmp/vertica-jdbc-10.0.0-0.jar https://www.vertica.com/client_drivers/10.0.x/10.0.0-0/vertica-jdbc-10.0.0-0.jar
   
  $ mvn install:install-file -DgroupId=com.vertica -DartifactId=vertica-jdbc -Dversion=10.0.0-0 -Dpackaging=jar -DgeneratePom=true -Dfile=/tmp/vertica-jdbc-10.0.0-0.jar
  
  $ rm /tmp/vertica-jdbc-10.0.0-0.jar
  ```

#### [Optional] Build from source code

You will get binary under [target/] after correctly running following commands under top of souce code tree.

``` BASH
$ git clone https://github.com/dingqiangliu/vertica4gephi.git

$ cd vertica4gephi/

$ mvn clean package

$ ls -l target/*.nbm
```

#### Install this plugin

1. open Gephi application.
2. open menu "Tools - Plugins",  choose table "Downloaded".
3. click button "Add Plugins", choose the binary file download or built from source code, and click "Ok" for flowing wizard.
4. open menu "File - Import Database - Edge List...",  choose "Vertica Database" for driver, input properties and SQLs to connect and retrive nodes/edges. 

