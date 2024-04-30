# Solvei8-Backend-assignment
This project provides a RESTful API for managing training centers. It is built using Java Spring Boot and MongoDB.
## Prerequisites
Before you begin, ensure you have the following installed on your local machine:

* Java Development Kit (JDK) version 8 or later
* MongoDB

## Setup Instructions
To set up the project locally, follow these steps:

* ### Clone the repository
  `git clone https://github.com/GauravDhoot2608/Solvei8-Backend-assignment.git`
* ### Navigate to the project directory
   `cd Solvei8-Backend-assignment`
* ### Configure MongoDB connection
   Open the application.properties file located in the src/main/resources directory, and configure the MongoDB connection settings
  
   * `spring.data.mongodb.host=localhost`
   * `spring.data.mongodb.port=27017`
   * `spring.data.mongodb.database=centerDB`  
* ### Build the project:
  `./mvnw clean package`
* ### Run the application:
  `java -jar target/Solvei8-Backend-assignment-0.0.1-SNAPSHOT.jar`

The server should now be running locally. You can access the API at `http://localhost:8080/api/training-centers`

## API Documentation
* Create a new Training Center:
  **POST /api/training-centers/add**
  ```json{
  "centerName": "Center Name",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "123 Street, Apt 101",
    "city": "City",
    "state": "State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course 1", "Course 2"],
  "contactEmail": "example@email.com",
  "contactPhone": "1234567890"
  }

* Get list of all Training Centers:
  **GET /api/training-centers/all**
  ```json
  [{
    "id": "6631028c973d40388d9a6563",
    "centerName": "Center Name",
    "centerCode": "ABC123456789",
    "address": {
      "detailedAddress": "123 Street, Apt 101",
      "city": "City",
      "state": "State",
      "pincode": "123456"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Course 1", "Course 2"],
    "createdOn": 1645685378000,
    "contactEmail": "example@email.com",
    "contactPhone": "1234567890"
   }]

Api which filter the training center by city or state:

* Get list of all Training Centers By City:
  **GET /api/training-centers/all?city=cityName**

* Get list of all Training Centers By State:
  **GET /api/training-centers/all?state=stateName**
  

  
