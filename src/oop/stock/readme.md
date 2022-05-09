### Implementation Rules

 - A stock must have a name, a list of products and a unique identifier.
 - The only stock variable that the user will be able to freely access and modify will be the name.
 - The unique identifier is created at the time of the stock instance, it is not user defined and can only be read.
 - The user must also not be able to access the product list directly, only through methods.
 - A product must have a name, a session, a type, an in-stock quantity, a brand and a unique identifier.
 - The unique identifier of the product must also be created together with the product and must not be defined by the user, after which it can only be read.
 - User must be able to flow **CRUD** *(create, read, update, delete)* of a product by stock.
 - A user must be able to list products from a stock.
 - A user must be able to read a product's data from inventory.
 - A user must be able to edit a product's inventory data (with the exception of its unique identifier).
 - A user must be able to delete a specific product from stock.
 - When trying to insert a product in the stock, if there is another one with the same name and the same brand, he must modify the original product in the stock, increasing the amount of products that would be inserted instead of creating a new one.
 - The user must not have access to any method that does not perform one of the listed functionalities.

## Final Tips

 - Although the user cannot have access, use support methods within the classes to facilitate your work, cleaning and maintenance of your code!
 - Create as many classes, variables and methods as you need to perform the exercise.
 - Try to be declarative about the names of methods, classes and variables.
 - Do not keep the doubts to yourself, share them with the teachers and the class, sometimes more colleagues have the same problem, or it is an issue that was not initially thought of by the teachers.
 - Take advantage of the exercise to fix the concepts taught in class.