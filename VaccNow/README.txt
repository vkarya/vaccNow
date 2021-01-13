Hi,

Created Attached Spring boot application with three modules for Availability/Vaccination/Reporting.

Used below Technology stack:

1. Spring-Boot
2. Maven
3. JDBCTemplate for ORM
4. H2 In-Memory Database to Persist data
5. Swagger UI to test Rest services
6. Tomcat server
7. STS for Dev purpose

When application is initiated, it creates few DB tables into IN-Memory h2 DB and insert some data. These SQL are available in 'data.sql' and 'schema.sql' files. That data is used on below APIs.

DB Structure: Created below DB tables (schema.sql):

branch
vaccine
branch_vaccine
branch_timeslots
applied_vaccination


Below Are the URLs:

Swagger UI:

http://localhost:8761/swagger-ui.html#


Availablity REST API:

http://localhost:8761/vaccnow/branches

http://localhost:8761/vaccnow/branches/102/vaccines

http://localhost:8761/vaccnow/branches/101/availabletimeslot


Reporting REST API:

http://localhost:8761/vaccnow/branches/101/appliedvaccination

http://localhost:8761/vaccnow/appliedvaccinationperday/2021-01-09

http://localhost:8761/vaccnow/listallconfirmedvaccination/2021-01-08/2021-01-11


Vaccination Rest API:

curl -X POST "http://localhost:8761/vaccnow/schedulevaccination" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"user_id\": 102, \"branch_id\": 102, \"timeslot\": \"10:00AM-10:15AM\", \"vaccine_id\": 1}"

http://localhost:8761/vaccnow/choosepayment?user_id=115

curl -X POST "http://localhost:8761/vaccnow/scheduleconfirmationemail" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"user_id\": 110}"


To Run Application, two ways can be followed:
1. The application can be run by executing below command through console (if maven is installed):
  mvn spring-boot:run
2. Or Through STS, by right clicking over application and run as 'Spring-Boot' application.
