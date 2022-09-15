## **Description**


The application design is as follows: 

The user creates a user profile where they are instructed to setup a personalized portfolio (i.e. recommended stocks, starting money). From here they have access to search all stocks and other options and begin buying selling options, the data fom which comes form a stock API.

### Classes:

**stockHandler**: Handles getting stock data and displays the price history on a graph (live price, 1 Month, 1 Year, 5 Years).

**userHandler**: Handles user data: Creates new users and stores user info, retrieves user info upon login (needs authentication).

**portfolioHandler**: Handles user data and stock data to display to a users portfolio page.

