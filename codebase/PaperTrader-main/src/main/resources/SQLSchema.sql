/*
This schema is the entire database structure for the web application

tables:
users
user_portfolio
user_investment
*/
DROP SCHEMA IF EXISTS public CASCADE;
create schema if not exists public
authorization postgres;

GRANT ALL ON SCHEMA public TO PUBLIC;
GRANT ALL ON SCHEMA public TO postgres;

drop table if exists public.users;
CREATE TABLE public.users (
    id serial primary key,
    username character varying(1000),
    user_password character varying(1000)
);

drop table if exists public.user_portfolio;
create table public.user_portfolio(
    portfolio_id serial primary key,
    user_id serial,
    balance int,
    constraint fk_user
        foreign key(user_id)
            references users(id)
);

drop table if exists public.user_investment;
create table public.user_investment(
    investment_id serial primary key,
    user_id serial,
    investment char varying(1000),
    quantity int,
    constraint fk_user
        foreign key(user_id)
            references users(id)
);
commit;
