#Test Project with Page Object Model and lint checks

**Important note :** 

* The tests were written on MAC OSX with chromedriver version compatible with browser version. 
* If the tests do not run, update the chromedriver version and the browser version to the latest.
* Chromedriver executable is available in src/test/resources


##Installation
**Pre-requisites** 

JDK 1.8

##Tech stack 
1. **Build management** : Gradle
2. **Unit testing** : TestNG
3. **Language** : Java
4. **Lint checks** : Spotbugs, Checkstyle
5. **UI Testing Framework** : Selenium Webdriver


**COMMANDS :** 
* To run the tests

Setup the selenium server ( Executable available in src/test/resources/ )

```
java -jar selenium-server-4.1.1.jar standalone
```
```
./gradlew clean test
```

* To run the lint checks

```
./gradlew clean check -x test
```

**Checkstyles Reports**

The report will be generated under build/reports/checkstyle

**SpotBug Reports**
The report will be generated under build/reports/spotbugs

