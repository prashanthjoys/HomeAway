# HomeAway

To get right up and started, you can checkout the project from github. 
## HA: HomeAway Automation Exercise part 1

# Prerequisites
 - jUnit 4
 - Java
 - WebDriver (Firefox)

Firefox driver IS actually packaged with the Selenium jar.
Launch your IDE, and under HA/src/test/ you'll find a file under the functional package. Right click the file and Run As -> jUnit Test.
This project is built utilizing page object design pattern. Each UI page is treated as a page object and have java class associated with it. 

## Fuel-project-soapui-project.xml: HomeAway Automation Exercise part 2
Description : Attached project does validation on GAS station name ,Street address and station id  by sending location from properties step of soap ui test suite . Initially it pull gas station network based on charge point network and location .These values are parameterized. From response pulling station id and passing it second method which returns address

Steps to execute
1) unzip project
2) import on soap ui
3) expand test suite with name fuel1
4) double click to open testrunner for Nearest.json test case
5) click on Run button
