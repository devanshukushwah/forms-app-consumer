# Forms App

FormsApp is a web-based application that allows users to create, submit, and track forms. It provides functionalities such as form creation, field definition, form submission, and form response tracking, all using RESTful APIs. The application supports user authentication, and forms can be dynamically generated and managed.

## Flow
![flow](https://raw.githubusercontent.com/devanshukushwah/forms-app-backend/refs/heads/main/images/flow.svg)

## Application Repositories
- [Form App Angular UI](https://github.com/devanshukushwah/forms-app-ui)
- [Form App Backend Application](https://github.com/devanshukushwah/forms-app-backend)
- [Form App Kafka Consumer](https://github.com/devanshukushwah/forms-app-consumer)

## Features

- **Form Submission Consumer**: Process submitted form for user.

## Technologies Used

- **Backend**: Java 21, Spring Boot 3
- **Database**: Relational Database (Hibernate + JPA)
- **Testing**: JUnit, Mockito
- **Logging**: Log4J2

## Changelogs

### 1.0.0
- updated to `JDK 21` and `Springboot 3.4.2`

## Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/devanshukushwah/forms-app-consumer.git
   cd forms-app-consumer
   ```
2. Ensure that your database is configured correctly in the application.properties file. You can modify it to match your database settings.

Contributing
------------

Contributions are welcome! If you find a bug or want to add a new feature, feel free to fork the repository and submit a pull request.

License
-------

This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgements
----------------

*   [Spring Boot](https://spring.io/projects/spring-boot) for building the application.
    
*   [JWT](https://jwt.io/) for user authentication.
    
*   [Hibernate](https://hibernate.org/) for ORM (Object-Relational Mapping).
