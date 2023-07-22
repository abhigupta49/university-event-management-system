<h1 align="center"> University Event Management</h1>

>### Framework
* [SpringBoot](javatpoint.com/spring-boot-tutorial)

>### Language
* [Java](https://www.java.com/en/download/help/whatis_java.html)
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer maintains the h2-database things on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Data Structure used in my project
This document outlines the steps to create a student model and an event model (Id,name,department,branch,location,description,startTime,endTime,date)
Student model will have-
* StudentId
* firstName
* lastName
* age
* department

Event Model will have
* eventId
* eventName
* eventLocation
* date
* startTime
* endTime

>## Project Summary

The above project implements a University Event Management project in which the endpoints provided are:-

* Add student
* update student
* department
* delete student
* Get all students
* Get student by Id
* Add event
* Update event
* Delete event
* Get All events by date
