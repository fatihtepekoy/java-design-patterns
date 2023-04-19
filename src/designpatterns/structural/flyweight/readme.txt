# Flyweight pattern

Purpose : Use sharing to support large numbers of fine-grained objects efficiently to save memory. Main target is saving memory, not creating the required objects.
Implementation : Create a factory class and keep the objects after created. Try to reuse as much objects as possible by sharing them

PS:
 - objects are immutable. Client give the parameter as input but can not update it.
 - It's often best to implement State and Strategy objects as flyweights.

