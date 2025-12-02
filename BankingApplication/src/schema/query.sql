-- Admin Table Structure

Create table Admin (
account_no varchar(30) primary key not null, 
name varchar(50), 
address varchar(100), 
mobile_no varchar(30), 
email varchar(50), 
acc_type varchar(30),
intial_balance int,
dob varchar(30),
id_proof varchar(30));

-- Customer table structure

Create table Customer (
account_no varchar(30),
customer_password varchar(50),
balance int,
Foreign Key(account_no) references Admin(account_no));

-- Transaction Table

Create table Transaction (account_no varchar(30),
transaction_type varchar(30),
before_balance int,
after_balance int,
total_balance int,
Foreign Key(account_no) references Admin(account_no));


