create database if not exists dataBase1;
use dataBase1;

CREATE TABLE User (
                     id INT NOT NULL auto_increment ,
                     name VARCHAR(60) not null,
                     age VARCHAR(5) not null,
                     sex VARCHAR(5) not null ,
                     primary key (id)
);

insert into User(name, age, sex)
values
    ('Yura','20','man'),
    ('Oleg','21','man'),
    ('Vanya','21','man'),
    ('Nastya','21','woman');

CREATE TABLE Car (
                     id INT NOT NULL AUTO_INCREMENT,
                     manufacturer_model VARCHAR(60),
                     color VARCHAR(15),
                     model_year INT,
                     price DECIMAL(7 , 2 ),
                     PRIMARY KEY (id)
);

insert into Car( manufacturer_model, color, model_year, price)
VALUES
    ('BMW m5','Blue',2011,25000),
    ('Fiat Doblo','Blue',2010,2000);

