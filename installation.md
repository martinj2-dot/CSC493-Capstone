### Installation:

- Clone repository


- **To deploy website locally:**


  - In a Unix based environment install PostgreSQL Version 15 and run it on port 5432.
  - Download and install IntelliJ IDEA and configure application to run on port 8080.

- **To begin developing and running the application:** 


  - Within IntelliJ IDE run SQLschema.sql file on PostgreSQL database running on port 5432 to configure database schema.
  - Run testData.sql on PostgreSQL database running on port 5432 to load in test data.
  - Navigate to localhost port 8080 to use web application.
  - Create a branch if you desire to issue a pull request.


### Use Cases:

The intended use case for the web application is to create an account and set up a portfolio for the user. The user will start with a liquid cash amount of $10,000 to use for buying stocks. Each account can buy and sell stocks in order to obtain a profit. The application utilizes a reactive graph library and realtime API's to allow users to simulate the stock market experience. The ability to learn manage a portfolio without risk is the primary goal of the application.
