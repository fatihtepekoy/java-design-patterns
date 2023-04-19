# Factory pattern

create a factory class to make it easy to create complex or high cost objects
PS:
 - Complex object means there are a lot of variable in the constructor method, or you need create much more object before you call the constructor
 - High cost object means object creation consumes high resources or takes some time

* Factory methods should not have too much input variables, add more methods to create more types of objects
* Factory methods can provide the object in three ways
  - Creating a brand-new instance
  - Cloning a object from a prototype object
  - Retrieving existing object(singleton) or an available object from a pool (object can be cleaned before it is returned)