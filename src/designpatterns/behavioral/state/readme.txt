# Chain of responsibility Pattern

Purpose : - to allow the object for changing its behavior without changing its class
          - to change the behavior of an object based on its state


PS:
 - if you have an object, it behaves differently depending on what state it is,
 - We can do it by using some instance variables and if/else statements, but it will be hard and complex to maintain it
 - if you define a state(behaviour) for each station, it will be cleaner code
 - we have a state variable in the Object, we update the state if needed
 - State Pattern Context is the class that has a State reference to one of the concrete implementations of the State.
 - Context forwards the request to the state object for processing. 

