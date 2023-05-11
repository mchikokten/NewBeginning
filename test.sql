create database vahe;

use vahe;

drop table if exists city;
drop table if exists country;

create table city (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar (40),
    country varchar (40),
    population int
);

insert into city (name, country, population) values ('Kyiv', 'Ukraine', 3500000);
insert into city (name, country, population) values ('New York', 'USA', 8500000);
insert into city (name, country, population) values ('Tokio', 'Japan', 13500000);

create table country (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar (40),
    continent varchar (40),
    population int
);

insert into country (name, continent, population) values ('Ukraine', 'Europe', 40000000);
insert into country (name, continent, population) values ('USA', 'North America', 331000000);
insert into country (name, continent, population) values ('Japan', 'Asia', 125000000);

alter table city
add column country_id int,
drop column country,
ADD FOREIGN KEY (country_id) REFERENCES country(id);

update city set country_id = 1 where id = 1;
update city set country_id = 2 where id = 2;
update city set country_id = 3 where id = 3;

select * from city;
select * from country;