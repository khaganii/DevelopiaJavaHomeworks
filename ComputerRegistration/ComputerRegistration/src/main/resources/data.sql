create table computers (
id int primary key not null auto_increment,
name varchar(20),
sort varchar(20),
ram int,
memory int,
ram_type varchar(5)
);

insert into computers (name, sort, ram, memory, ram_type) values
('Acer', 'Notebook', 6, 256, 'SSD'),
('HP', 'Notebook', 8, 128, 'HDD'),
('Dell', 'Notebook', 4, 1024, 'HDD'),
('Sony', 'Notebook', 6, 512, 'SSD'),
('Acer', 'Laptop', 16, 256, 'SSD'),
('Acer', 'PC', 8, 512, 'HDD'),
('HP', 'PC', 8, 1024, 'SSD'),
('LG', 'PC', 4, 256, 'HDD');