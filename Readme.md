# Running Spring Boot Redis Cache Application
## Spring web service of a CRUD of bookmarker using Spring JPA, Spring MVC and Spring Boot, including GET, PUT, POST and DELETE operations for a bookmarker entity.

 Spring have now devised a simple to use caching system based around a couple of annotations
 
 
# Core package for integrating Redis with Spring concepts REF:
 
 https://docs.spring.io/spring-data/redis/docs/current/api/org/springframework/data/redis/core/package-summary.html

## Explore Rest APIs

The app defines following CRUD APIs.

## 1. POST http://localhost:8080/api/bookmarker
Create data
###sample Request
{
	"id":"1",
	"title":"Git-Hub",
	"content":"www.github.com/HarishForJava"
}


## 2.GET http://localhost:8080/api/bookmarkers

## 3.GET http://localhost:8080/api/bookmarker/{id}

## 4.PUT http://localhost:8080/api/bookmarkers/{id}
update data
### sample Request
{
	"title":"Git-Hub",
	"content":"www.github.com/"
}

## 5.DELETE http://localhost:8080/api/bookmarkers/{id}

You can test them using postman or any other rest client.
