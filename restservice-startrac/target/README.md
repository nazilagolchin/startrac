## Description

This is a simple Java rest web service that handling trucks data.
It issues direct HTTP requests to call and return all the drives what contains shipments with a specific unit of measure
and all the drives what contains shipments what is in a specific category as JSON.


### Dependencies
*  In the latest test, the version is Eclipse  spring-tool-suite-3.9.7.RELEASE-e4.10.0 .

## Running locally

1. change the application.properties to the right oracle connection and user
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=

2. Build the project with Maven

3. Run project as  java application

 * The table's database create and basic master data import to database from the import.sql file

4. call web service Get for test 

 * All the drives what contains shipments with a specific unit of measure

```
    http://localhost:8080/allDrivesWithUnit?unitId={Id}
```

 * All the drives what contains shipments what is in a specific category

```
    http://localhost:8080/allDrivesWithCategory?categoryId={Id}
```

 * All the drives what contains shipments with a specific unit of measure filter by unit description

```
    http://localhost:8080/allDrivesWithUnitDesc?unitDesc={Desc}
```

 * All the drives what contains shipments what is in a specific category filter by category description

```
   http://localhost:8080/allDrivesWithCategoryDesc?categoryDesc={Desc}
```

## Authors

- Nazila Golchin
- Version 1.0.0 

