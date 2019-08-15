# observer

Comparison between Objective-C's and Java's observing mechanisms.

Objective-C uses KVO which automatically subclasses the class to be observed (in this case SecurityGate) and the observing class (SecurityManager)
just implements the observe method as you can see in the code.

Java on the other hand has to define an interface (gateStateChanged in this example) and you need to manuall add and remove observers within your
class as you can see in the code.

