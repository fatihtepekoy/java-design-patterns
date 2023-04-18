# Adapter design pattern

Purpose : to provide a simple interface by encapsulating a bunch of complex subsystem behaviors(single point of contact)
          to make subsystems easy to use



PS:
 - For example you have an engine with all subsystems, and it can be quite complex and does require some effort to start the engine correctly
   If you have a start engine facade method which calls all subsystem in right order, it becomes easier to start the engine for the client
 - If a new step is needed and added to the business process, it will be enough to add it to the facade methods
    no need to let the clients know.
 - We can create multiple facade layers to keep them highly cohesive and call them main facade method
 - Better to keep them singleton and stateless
 -
