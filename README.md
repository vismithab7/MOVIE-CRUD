# 🎬 Movie CRUD Application

A simple **Spring Boot + Thymeleaf + Hibernate** CRUD web application built using **Eclipse IDE**.  
This project allows users to **Add, View, Update, and Delete Movie Records** from a database.

---

## 🚀 Features
- ➕ Add new movies  
- 📋 View all movies  
- ✏️ Edit existing movies  
- ❌ Delete movies  
- 💾 Connected to MySQL database  
- 🧱 Built with MVC architecture  

---

## 🧰 Tech Stack
| Category       | Technologies                    |
| -------------- | ------------------------------- |
| **Frontend**   | Thymeleaf, HTML, CSS, Bootstrap |
| **Backend**    | Java, Spring Boot / Spring MVC  |
| **Database**   | MySQL                           |
| **ORM**        | Hibernate / JPA                 |
| **IDE**        | Eclipse                         |
| **Build Tool** | Maven                           |
| **Server**     | Apache Tomcat                   |


---

## 🗂️ Project Structure

movie-crud/
├── src/main/java/com/A6/moviecrud/
│ ├── controller/ # Controllers for handling web requests
│ ├── entity/ # JPA Entity classes (e.g., Movie.java)
│
├── src/main/resources/
│ ├── application.properties # DB configuration
│ └── templates/ 
│
├── pom.xml # Maven dependencies
└── README.md


---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
Make sure you have installed:
- **JDK 17 or above**
- **Eclipse IDE for Enterprise Java**
- **MySQL Server**
- **Apache Tomcat** (if not using embedded server)
- **Maven**

---

### 2️⃣ Database Setup
1. Open MySQL and create a database:
   ```sql
   CREATE DATABASE movie_db;
2.Update your application.properties (or persistence.xml):
spring.datasource.url=jdbc:mysql://localhost:3306/movie_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Import Project into Eclipse
Open Eclipse
Go to File → Import → Existing Maven Project
Browse to the folder movie-crud
Click Finish

4️⃣ Run the Application
Right-click on your main class (with @SpringBootApplication)
Select Run As → Spring Boot App
OR run on Tomcat using Run on Server
Then open in browser:
http://localhost:8080/


🧩 Example URL Usage
Action	                        Example URL                  	 Method
View home page	           http://localhost:8080/               GET
Add movie form          	 http://localhost:8080/insert         GET
Submit new movie	         http://localhost:8080/inser      	  POST
View all movies          	 http://localhost:8080/fetch          GET
Delete a movie (id=3)	     http://localhost:8080/delet?id=3   	GET
Update movie (id=5)        http://localhost:8080/update?id=5   	GET
Save updated movie	       http://localhost:8080/update         POST
