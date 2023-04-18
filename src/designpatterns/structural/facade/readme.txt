# Adapter design pattern

Purpose : to provide a simple interface by encapsulating a bunch of complex subsystem behaviors
          to make subsystems easy to use


PS:
 - For example you have an engine with all subsystems, and it can be quite complex and does require some effort to start the engine correctly
   If you have a start engine facade method which calls all subsystem in right order, it becomes easier to start the engine for the client