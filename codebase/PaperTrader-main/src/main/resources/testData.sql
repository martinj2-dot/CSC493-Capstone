/*
This SQL script adds all the test data for the applicaiton.

Adds 2 users
adds 2 user_portfolios
adds 2 user_investments

*/

TRUNCATE table users, user_portfolio, user_investment;


insert into users(id, username, user_password)
values (1, 'test@gmail.com', 'test_password'), (2, 'test2@outlook.com', 'test_password');

insert into user_portfolio(portfolio_id, user_id, balance)
values (1, 1, 10000), (2, 2, 500);

insert into user_investment(investment_id, user_id, investment, quantity)
values(1, 1, 'TSLA', 5), (2, 1, 'MSFT', 10), (3, 2, 'TSLA', 5), (4, 2, 'MSFT', 10);

commit;

