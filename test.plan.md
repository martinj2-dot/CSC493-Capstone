### Summary

The main testing framework utilized in the project is JUnit 5, a popular Java backend testing framework. The intention is to integrate unit testing for each method implimented within the application. JUnit provides some very usefull tools including: dynamic testing which declares and runs test cases at runtime. A frontend smokescreen test suite is to be determined.


### Key Test Cases

- 1 Test Database Schema
  - Tests that the database is setup correctly and data is appropriately     stored.
  - Preconditions: N/A
  - Steps: Ensures database schema is setup with correct tables using assertions.
  - Results: Database schema is setup and appropriate tables are there. All fields are as asserted according to the model setup in the backend.


- 2 Test User creation
  - Tests the creation of a user profile, the correct data is entered into    the appropriate tables and the user is now a part of a session.
  - Preconditions: database schema finished
  - Steps: Asserts that when a user is created the information exists, is the information entered, and is hashed.
  - Desired Results: The user information is in the user table, is correct and is hashed.


- 3 Test investment buying
  - Tests the functionality of buying an investment, the correct amount and price at which it was bought at is stored in the userPortfolio table, asserts that the information exists and is correct.
  - Preconditions: userPortfolio table is setup.
  - Steps: Using a transaction input test data, assert that it is correct or incorrect to test the functionailty.
  - Desired results: The correct investment is stored with all correct information (stockName, buyPrice, sellPrice, transactionBalance{positive or negative} etc.,)
