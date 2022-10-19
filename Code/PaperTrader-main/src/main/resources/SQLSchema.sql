create schema public
authorization postgres;

CREATE TABLE public.users (
    id serial primary key,
    username character varying(1000)
);

