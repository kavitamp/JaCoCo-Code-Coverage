# JaCoCoCodeCoverage

---
Struggled to get the combined code coverage report with multiple project constraints?
This project will help you to get the combined(test & androidTest) test case code coverage report with the help of JaCoCo Android plugin

## Supported functionalities:
1. Get combined test case coverage of `test` & `androidTest` folder.
2. Get the coverage report of multi-flavored, multi-moduled app.
3. Exclude perticular package/folder from the coverage report.
4. Define the specific folder for the coverage report.

## Command:
./gradlew clean 'defineYourProductFlavourName'CoverageReport

For example:
1. ./gradlew clean devDebugCoverageReport
2. ./gradlew clean qaDebugCoverageReport
(dev & qa are my project flavors)

Note: I will recommend to use `clean` in your command as it will clean the previous build data.

## Reference:
1. https://stackoverflow.com/a/41512327/6532155
2. https://medium.com/swlh/multi-module-multi-flavored-test-coverage-with-jacoco-in-android-bc4fb4d135a3
