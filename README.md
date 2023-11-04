# JobListing Backend

The **JobListing** backend is a Spring Boot application that manages job postings, allowing users to create, retrieve, and search for available jobs. It utilizes MongoDB for database management.

## Installation

To run the application, ensure that you have the following prerequisites installed:

- Java Development Kit (JDK) - version 11 or higher
- Apache Maven
- MongoDB

Clone the repository:

```bash
git clone <repository_url>
```

Navigate to the project directory:

```bash
cd job-listing

```
## Configuration
### MongoDB Setup

Make sure MongoDB is installed and running. The application assumes the default MongoDB connection settings.

You can configure the MongoDB connection in application.properties or application.yml if non-default configurations are used.

### IDE Configuration
For development, import the project into your favorite IDE as a Maven project.

# Running the Application
You can run the application using Maven:
```bash
mvn spring-boot:run
```
The application will start on the default port 8080.

# Usage
### Endpoints

- GET /allPosts: Retrieve all available job postings.
- GET /posts/{text}: Search for jobs based on specific keywords.
- POST /post: Post a new job, including details such as tech stacks, role, and years of experience.

# Contributing
If you would like to contribute to this project, feel free to fork the repository and create a pull request with your changes.
