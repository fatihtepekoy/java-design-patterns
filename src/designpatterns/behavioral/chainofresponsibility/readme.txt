# Chain of responsibility Pattern

Purpose : - to decide which chain of objects to process the request
          - to allow passing request along the chain of potential handlers until one of them handles request.




PS:
 - The pattern allows multiple objects to handle the request without coupling sender class to the concrete classes
   of the receivers.  The chain can be composed dynamically at runtime with any handler that follows a standard handler interface
 - The Chain of Responsibility pattern is handy for:
      Decoupling a sender and receiver of a command
      Picking a processing strategy at processing-time


