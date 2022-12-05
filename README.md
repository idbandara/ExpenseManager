# ExpenseManager

<b>MySQL database configuration </b>

Server : localhost <br />
Port: 3306 <br />
create database expensemng <br />
\u expensemng <br />
CREATE TABLE `personal_expense` ( <br />
  `id` int(11) NOT NULL AUTO_INCREMENT, <br />
  `expense_reason` varchar(100) NOT NULL, <br />
  `expense_amount` float(10,2) NOT NULL, <br />
  `expense_vat` float(10,2) NOT NULL, <br />
  `expense_date` date DEFAULT NULL, <br />
  PRIMARY KEY (`id`) <br />
); 
<br /><br />
grant all privileges on expensemng.* to 'indrajith'@'%' identified by 'bandara'
<br /><br /><br />
Post <br />
http://localhost:4200/app/expenses <br />
Sample request <br />
{ "expenseReason":"Food", "expenseAmount":"20", "expenseVat":"4", "expenseDate":"2022-12-05"
}
<br /><br />
GET <br />
http://localhost:4200/app/expenses
