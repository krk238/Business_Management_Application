															
															
							Java API Project


 Java Project - Business Management Application (MicroServices, Spring Boot, RESTful APIs).
 
 Application that displays on a web browser (On Different Ports): 
 
 These are all models. 
 
 - Employee 
	- Employee ID
	- Name
	- Role 
	- Salary
	- Boss
	- Project they are working on
	- Start Date
	- End Date - Null if they are still working
	
 - Project
	- Project ID 
	- Name
	- Profit (Payment made by client) 
	- Client Project it is for. 
	- Description
	- Starting Date
	- Completion Date - null if is still active
	- Project Manager
	
 - Customer
	- Customer ID
	- Name
	- Project they are associated with
	- Payment to company for project
	- email 
	- Active Customer or not
	
	
Architecture (Three Microservice that are discovered through Eureka Client)


ProjectService
- Input: ProjectID
- Output: Check project info above

EmployeeService
- Input: EmployeeID
- Output: Check employee info above

CustomerService
- Input: CustomerID
- Output: Check customer info above



