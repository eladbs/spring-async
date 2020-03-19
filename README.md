# Spring Async Example
This is an example Spring Boot project to show how to run tasks asynchronously.

This example intended to show how to build up a RESTful backend that when making a 
call will return immediately to the user but continue processing the request asynchronously.
 
### To run this project
1. Clone the repo.
2. Open your IDE and run or using the CLI:
    ```mvnw package && java -jar target\spring-async-0.0.1-SNAPSHOT.jar```
3. Make an HTTP GET call to http://localhost:8080/api/async
4. Watch the logs... :)

### Notes
Watch the code for //TODO comments. They are numbered for easy following.