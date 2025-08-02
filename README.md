Import & Run the Project using STS (Spring Tool Suite 4.3)
If you'd like to run this project using Spring Tool Suite (STS) 4.3, follow the steps below. This guide assumes you've used Maven for dependency management and project setup.

 Required Tools
Spring Tool Suite 4.3+
Download STS
Java 17+
MySQL Server
Database Name:- assign

 Steps to Import & Run

 
1. Clone the Repository
First, clone the repository from GitHub to your local machine:

git clone https://github.com/abhishek975/Assignment.git



2. Open STS and Import as Maven Project
Open Spring Tool Suite 4.3

Go to File → Import

Select:
Maven -> Existing Maven Projects → Click Next
Browse to the root folder of the cloned repository.
STS will automatically detect the pom.xml. Select it and click Finish.
Wait for STS to build the workspace and resolve dependencies via Maven.



3. Set Up MySQL Database
Make sure MySQL is running locally on port 3306

Create the database manually (if not already created):

sql
CREATE DATABASE assign;
Ensure your credentials match those in application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/assign
spring.datasource.username=root
spring.datasource.password=root
You can modify these values based on your local MySQL setup.



4. Run the Project
In STS, right-click the main class:
ProductAppApplication.java

Click Run As → Spring Boot App

The application will start on http://localhost:8080

 Test the Application using Swagger
After running the application:

Open your browser and navigate to:
http://localhost:8080/swagger-ui/index.html

Test endpoints like:
http://localhost:8080/swagger-ui/index.html#/product-controller/allProducts

Use "Try it out" to run GET, POST, PUT, DELETE requests directly in Swagger UI.
