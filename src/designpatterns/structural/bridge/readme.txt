# Proxy pattern

Purpose : to protect child class from changes in parent class by putting a layer between child and parent class

PS:
 - In using of the inheritance, all public and protected methods causes coupling if child class does not override them, properties as well.
 - Decreases coupling by converting is-a-relations to has-a-relations
 - Coupling coming from only interfaces not from the implementations, interfaces are not changed often.

