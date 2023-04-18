# Proxy design pattern

Purpose : to hide the target object and provide same interface to the client
          to control for accessing the original object
          to prevent updating the target object or to decrease the creation cost of the object with a large initial configuration
          to add a layer of security to the original underlying object to provide controlled access based on access rights of the client

PS:
 - Proxy interface is same as the target object
 - Client does not know the object is real or proxy

