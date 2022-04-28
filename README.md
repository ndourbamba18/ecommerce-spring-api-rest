# E-Commerce Backend App Api Rest using Spring Boot & JWT Authentication with Spring Security & Spring Data JPA & Contact Form

## Backend Authentication

> [Spring Boot + JWT Authentication](https://bezkoder.com/spring-boot-vue-js-authentication-jwt-spring-security/)

## Backend CRUD App

> [Spring Boot + MySQL/PostgreSQL example](https://bezkoder.com/spring-boot-vue-js-crud-example/)

> [Spring Boot + MySQL example](https://bezkoder.com/angular-spring-boot-crud/)

> [Spring Boot + PostgreSQL example](https://bezkoder.com/angular-spring-boot-postgresql/)

> [Spring Boot + MySQL example](https://bezkoder.com/angular-10-spring-boot-crud/)

## Microservices:
> [Spring Boot + MySQL + Rest Client](https://bezkoder.com/integrate-angular-spring-boot/)
 
> [Spring Boot + MySQL + Open Feign](https://bezkoder.com/integrate-angular-spring-boot/)

> [Spring Boot + MySQL + Rest Client](https://bezkoder.com/integrate-angular-spring-boot/)

More Practice:
> [Spring Boot File upload example with Multipart File](https://bezkoder.com/spring-boot-file-upload/)

## Dependency
– If you want to use PostgreSQL:
```xml
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
```
– or MySQL:
```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <scope>runtime</scope>
</dependency>
```
- JWT
```
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.1</version>
		</dependency>
    ```
- Faker for github
```
		<!-- https://mvnrepository.com/artifact/com.github.javafaker/javafaker -->
		<dependency>
			<groupId>com.github.javafaker</groupId>
			<artifactId>javafaker</artifactId>
			<version>1.0.1</version>
		</dependency>
    ```
- mindrot
```
		<!-- https://mvnrepository.com/artifact/org.mindrot/jbcrypt -->
		<dependency>
			<groupId>org.mindrot</groupId>
			<artifactId>jbcrypt</artifactId>
			<version>0.3m</version>
		</dependency>
    ```
## Configure Spring Datasource, JPA, App properties
Open `src/main/resources/application.properties`
- For PostgreSQL:
```
spring.datasource.url= jdbc:postgresql://localhost:5432/ecommercedb
spring.datasource.username= postgres
spring.datasource.password= your password

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update

spring.jackson.serialization.fail-on-empty-beans=false
spring.main.allow-circular-references=true

## Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587

### Configure gmail specific username and password
spring.mail.username='Your email_address (example : ndourcodeur@gmail.com)'
spring.mail.password='Your password (example : hello@2021)'
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.connectiontimeout=5000
spring.mail.properties.mail.smtp.timeout=5000
spring.mail.properties.mail.smtp.writetimeout=5000

# App Properties
jwt.secret=secret
```
- For MySQL
```
#Server Configuration
server.port=8080
jwt.secret=secret

#spring.profile=dev
spring.datasource.url = jdbc:mysql://localhost:3306/ecommercedb?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username = username
spring.datasource.password = your Password
spring.datasource.platform=mysql
spring.datasource.initialization-mode=always
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto = update
spring.jackson.serialization.fail-on-empty-beans=false
spring.main.allow-circular-references=true

## Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587

### Configure gmail specific username and password
spring.mail.username='Your email_address (example : ndourcodeur@gmail.com)'
spring.mail.password='Your password (example : hello@2021)'
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.connectiontimeout=5000
spring.mail.properties.mail.smtp.timeout=5000
spring.mail.properties.mail.smtp.writetimeout=5000

```

## Download All Package :
```
mvn package
```
## Run Spring Boot application
```
mvn spring-boot:run
```

## Run following SQL insert statements
```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```