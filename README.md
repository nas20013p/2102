# 2102 Lab 1

## How to Run Code
---
1. git clone this repository in your terminal in order to obtain all of the necessary files
2. navigate to the appropriate folder to run the following commands (usually running in "Lab-1" folder will work)
3. run the following commands:
   - javac -cp junit-4.13.2.jar "./src/c/TestMe.java" "./src/c/ElectricInterface.java" "./src/c/GasolineInterface.java" "./src/c/Hybrid.java" "./src/c/HybridCar.java" "./src/u/TestMeTests.java"
     - this will compile all the files
   - java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:src" org.junit.runner.JUnitCore u.TestMeTests
     - run this after compiling to execute Junit unit tests 
