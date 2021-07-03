# Food-Boooking-System
A food booking system having login/sign up and food ordering facilities. It is created using java as front end and mysql as back end.
## Overview
This project has been made for booking food online with a very user friendly interface. It has two phases
<br>1 - admin:
 <br>the owner can look for the orders which needs to be fullfilled with their designation
<br>2 – customer:
 <br>anyone can book food from a large number of food choices online 
<br>For convenience of users, they have to sign in only once, then onwards the data of the users would be taken from the users automatcally.
## Windows present
1-USER WINDOW:
<br>![image](https://user-images.githubusercontent.com/86741118/124347419-5770fd00-dc02-11eb-89f3-d84d938ad08c.png)
<br>1-ADMIN PAGE:
<br>![image](https://user-images.githubusercontent.com/86741118/124347468-9dc65c00-dc02-11eb-8d91-5d3ba8798090.png)
<br>1-LOGIN PAGE:
<br>![image](https://user-images.githubusercontent.com/86741118/124347478-a880f100-dc02-11eb-94eb-56f696adbd3c.png)
<br>1-SIGN UP PAGE:
<br>![image](https://user-images.githubusercontent.com/86741118/124347506-be8eb180-dc02-11eb-905d-d850a4ab3a75.png)
<br>1-FOOD BOOKING:
<br>![image](https://user-images.githubusercontent.com/86741118/124347529-d7976280-dc02-11eb-9dce-87ee15ef8d03.png)
<br>![image](https://user-images.githubusercontent.com/86741118/124347564-f0a01380-dc02-11eb-85d2-ea87f9b7d25a.png)
<br>![image](https://user-images.githubusercontent.com/86741118/124347573-f85fb800-dc02-11eb-9798-97479843b8ac.png)
<br>![image](https://user-images.githubusercontent.com/86741118/124347576-fd246c00-dc02-11eb-9c4e-6eb390c78bba.png)
## Initializing database
In the mysql database with the following tables:
<br><br>pass:create table pass (sr_no  int(5),name  varchar(30),userid varchar(30), password  varchar(30), number  double, address varchar(30), city  varchar(30),pincode  varchar(30));
<br><br>order:create table order(or_no  int(5),sr_no  int(5),number  double, address varchar(30), city  varchar(30),pincode  varchar(30),order_detail varchar(50),total_charge int(10),dilivery_charge int(10),grand_total int(10))
