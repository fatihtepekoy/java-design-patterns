# Flyweight pattern

Purpose : - to support large numbers of fine-grained objects to the application to use system memory efficiently.

PS:
 - objects are immutable. Client give the parameter as input but can not update it.
 - It's often best to implement State and Strategy objects as flyweights.
 - Create a factory class and keep the objects after created. Try to reuse as much objects as possible by sharing them

