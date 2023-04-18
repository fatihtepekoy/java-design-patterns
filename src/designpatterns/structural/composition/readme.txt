# Adapter design pattern

Purpose : to provide a bunch of objects in a composite object
          to allow especially same treating individual objects and compositions of objects


PS:
 - The problem is dealing with uniform objects(single or collection).
 - The composite object also has a same kind object itself(like a node-tree data structure)
 - Think about a method can accept single object or a collection of the object, it should not matter to the method. (both objects are same type( due to inheritance or interface))
 - Client can add, remove objects and access any of them.
 - If you pass the composite object to the method, the method "test(Animal animal)" , the method accepts it, because it is an Animal type and has all the methods animal has
