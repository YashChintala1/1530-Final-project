# 1530-Final-project
Personal Finance Management App
Introduction
System Requirements
1. Java JDK 11 or higher
2. Maven(if needed for testing)



Dependencies
1. Run mvn clean install

Running the application
1. compile the code using:javac
2. Run the app using:java Main.java

Testing

Expense Tracking
Purpose:Ensures that adding an expense updates the UI appropriately.
How to Run:
1. Navigate to the src/test/java directory.
2. Run the following command to execute the test: mvn test -Dtest=ExpenseTrackerTest

Budget Creation
Purpose: Checks if the flexible budget strategy adjusts budget limits based on past spending.
How to Run:
1. Navigate to the src/test/java directory.
2. Run the following command to execute the test: mvn test -Dtest=BudgetCreationTest

As there is only one test case for both, we don't need to specify which test case to run in the command.
