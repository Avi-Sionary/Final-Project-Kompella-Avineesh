# Final Project - Video game store web service

## Deployment link
http://capstone-env.eba-kdwu332n.us-west-2.elasticbeanstalk.com/

The endpoints are:
/games
/console
/tshirt
/invoice


## Team Members
- Avineesh Kompella
- Mandresy Andriamasinoro
- Michael Aguadze
- Joshua DeVille 

## Application Overview
This group final project involves the creation of a full-stack application that includes the following:

- A simple back-end REST inventory management web service for a video game store, developed using agile techniques in a group setting. You are responsible for designing and documenting the REST API and implementing the controllers, service, layering, repository, Java data objects, and unit tests for the application based on the provided database structure.
- The use of Agile methodology to plan and track your project, an important skill upon which you will likely be evaluated by hiring managers.

## Back-End Structure
Your back-end solution must have the following structural elements:

- Your project must be built using Spring Boot and Spring MVC. Initialize your project using Spring Initializr Links to an external site.
- Your solution must include the use of JPA (Java Persistence API) to interact with the back-end database.
- You must implement ControllerAdvice to handle exceptions and return proper HTTP status codes and data when exceptions occur. This includes handling all violations of business rules.

## Methodology
- You must manage your work in Jira including the use of stories and epics.
- You must estimate your work using story points.
- You must use a test-driven development approach (including Red/Green/Refactor) for your code.
- You must use JUnit for unit and integration tests.
- Your design must include a service layer.
- Your unit test suite should use mock objects where appropriate.
- You should use JSR303 for input validation.

## API Features
This system must manage the inventory of video games, game consoles, and T-shirts.

Your REST API must allow the end user to do the following in each category:

### Games:

- Perform standard CRUD operations for games.
- Search for games by studio.
- Search for games by ESRB rating.
= Search for games by title.
- NOTE: You must create a separate repository for games.

### Consoles:
- Perform standard CRUD operations for consoles.
- Search for consoles by manufacturer.
- NOTE: You must create a separate repository for consoles.

### T-shirts:
- Perform standard CRUD operations for T-shirts.
- Search for T-shirts by color.
- Search for T-shirts by size.
- NOTE: You must create a separate repository for T-shirts.

### Invoices:
Create an invoice by supplying the following information to the endpoint:
- Name
- Street
- City
- State
- Zip
- Item type
- Item ID
- Quantity

Note that an invoice/purchase is particular to a single item type/ID. As an example, an invoice might include a specified quantity of Item type "Game" and Item ID 244.

The endpoint returns invoice data based on the provided invoice table.

All invoice calculations must be done in the service layer.

- NOTE: You must create a repository for both taxes and processing fees.

You must use the following database structure:
- See schema.md

## User Stories
Your application must complete the following user stories:
- As a user, I would like to be able to create, read, update and delete game information.
- As a user, I would like to be able to search for games by studio, ESRB rating and title.
- As a user, I would like to be able to create, read, update and delete console information.
- As a user, I would like to be able to search for consoles by manufacturer.
- As a user, I would like to be able to create, read, update and delete T-shirt information.
- As a user, I would like to be able to search for games by color and size.
- As a user, I would like to be able to purchase a specified quantity of products (games, consoles, T-shirts).

## Test Requirements

You must test all routes using MockMVC. 
- This includes testing for both expected return values and expected controller failures (4xx and 5xx status codes).

Test all service layer methods.
- You should have 100% code coverage of the service layer.
- These should be unit tests—in other words, they should employ mocking.

You must have integration tests for all repositories.
- These should test the basic CRUD operations.
- These should also test any custom methods you've defined (such as findByCategory).

Business Rules
- Sales tax applies only to the cost of the items.
- Sales tax does not apply to any processing fees for an invoice.
- The processing fee is applied only once per order, regardless of the number of items in the order, unless the number of items in the order is greater than 10, in which case an additional processing fee of $15.49 is applied to the order.
- The order-processing logic must properly update the quantity available for the item in the order.
- Order quantity must be greater than zero.
- Order quantity must be less than or equal to the number of items available in inventory.
- The order must contain a valid state code.
- The REST API must properly handle and report all violations of business rules.

An example invoice, with taxes and processing fees included, would be calculated as follows:

Given the following purchase information:
  {
    "name": "Customer 1",
    "street": "100 Main Street",
    "city": "Clovis",
    "state": "CA",
    "zipcode": "93612",
    "itemType": "Game",
    "itemId": 269,
    "quantity": 12
  }
- The price of Game ID 269 is $12.99. For quantity 12, the subtotal is $155.88.
The sales tax in the state of California is 6 per cent, which in this case would $9.35.
- The processing fee for the first ten purchased Games is $1.49.
- Because the quantity is greater than 10, an additional processing fee of $15.49 is applied.
- The total price is then calculated as $182.21 ($155.88 + $9.35 + $1.49 + $15.49).

## Deployment
- Project code should be synchronized to a GitHub repository.
- Application should be deployed to AWS and should receive requests and respond accordingly.
- Application database should be deployed to Amazon RDS and receive requests and respond accordingly.
- Project code should be deployed to a CircleCI CI/CD pipeline which includes a "build and test" job.

## Data
### Tax Rates
Load the following tax rates into your database:
- See tax_rates.md

### Processing Fees
Load the following processing fees into your database:
- See fees.md

## Explanatory Video
As a final step, record an explanatory video outlining your application and its deployment. While this video itself will not be graded, it will however be used as a tool to evaluate your application as a whole.

## Grading Requirements
In this project, your grade will consist of general setup and format requirements and the quality of your actual code.

### General Structure: 10%
- All code must reside in one folder called Final-Project-Lastname-Firstname.
- The project is built using Spring Boot and Spring MVC and initialized using start.spring.io.
- The project uses JPA and follows the pattern shown in this module.

### Game API: 15%
- Code is clean and follows general patterns as presented in class.
- API routes are implemented for Create, Update and Delete operations
- The repository supports the following functionality:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Studio
  - By ESRB
  - By Title
- Repository test cases cover the following functionality:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Studio
  - By ESRB
  - By Title
- REST API endpoints and OpenAPI documentation are present for each of the following:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Studio
  - By ESRB
  - By Title

### T-Shirt API: 15%
- Code is clean and follows general patterns as presented in class.
- API routes are implemented for Create, Update and Delete operations
- The repository supports the following functionality:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Color
  - By Size
- Repository test cases cover the following functionality:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Color
  - By Size
- REST API endpoints and OpenAPI documentation are present for each of the following:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Color
  - By Size

### Console API: 15%
- Code is clean and follows general patterns as presented in class.
- API routes are implemented for Create, Update and Delete operations
- The repository supports the following functionality:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Manufacturer
- Repository test cases cover the following functionality:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Manufacturer
- REST API endpoints and OpenAPI documentation are present for each of the following:
  - Create
  - Read
  - Read All
  - Update
  - Delete
  - By Manufacturer

### Invoice API: 15%
- Code is clean and follows general patterns as presented in class.
- API routes are implemented for Create, Update and Delete operations
- The repository supports the following functionality:
  - Create
  - Read
  - Read All
  - By Customer Name
- Repository test cases cover the following functionality:
  - Create
  - Read
  - Read All
  - By Customer Name
- REST API endpoints and OpenAPI documentation are present for each of the following:
  - Create
  - Read
  - Read All
  - By Customer Name

### Controller Advice and Validation: 15%
- Code is clean and follows general patterns as presented in class.
- JSR 303 validations match database constraints and messages are clear and concise
- Implementation utilizes the ResponseEntity pattern presented in class
- Controller Advice returns 404/422 status codes where appropriate
- Controller Advice handles all possible exceptions thrown by Controller, Repository, and Service Layer code

### Deployment: 15%
- Project code has been synced to a GitHub repository.
- Application has been deployed to AWS and is receiving requests and responding accordingly.
- Application database has been deployed to Amazon RDS and is receiving requests and responding accordingly.
- Project code has been deployed to a CircleCI CI/CD pipeline which includes a "build and test" job.

