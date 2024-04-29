# 1530-Final-project
Personal Finance Management App
Introduction
System Requirements
1. Java JDK 11 or higher
2. Maven(if needed for testing)


If you need to clone the repo then here is how to do it:
1. Open your terminal.
2. Run the following command to clone the repository: git clone https://github.com/yourorganization/finance-app.git
3. Navigate into the cloned directory by running: cd finance-app

Dependencies
1. Run mvn clean install

Running the application
1. compile the code using:javac
2. Run the app using:java Main.java

Testing

Expense Tracking
Test Case: testAddExpenseUpdatesUI
Purpose: Ensures that adding an expense updates the UI appropriately.
How to Run:
Navigate to the src/test/java directory.
Run the following command to execute the test: mvn test -Dtest=ExpenseTrackerTest

Budget Creation
Test Case: testFlexibleBudgetAdjustsLimits
Purpose: Checks if the flexible budget strategy adjusts budget limits based on past spending.
How to Run:
Navigate to the src/test/java directory.
Run the following command to execute the test: mvn test -Dtest=BudgetCreationTest
