# Discussion 4: Volumes
In this discussion, we are going to use the concepts we learned this week to create multiple classes that represent Volumes, and see how we can use them together in code without needing to rewrite code.

But first, some review:

### Classes that share _behaviour_!

This week, we saw how when programming, we can come across classes that very similar behaviour, and can be used in a similar way.

For instance, we saw that we can have various `Region`s (`Circle`, `Square`, etc.) which can all tell if a given point is contained within them. And, while the nitty-gritty details of how each of them figured this out was different, the method headers looked very similar:

```java
boolean contains(Point p) { ... }
```

We then saw that we can represent this commonality between our different `Region`s through an `interface`:

```java
interface Region {
    public boolean contains(Point p);
}
```

And we learned that this interface allowed us to treat multiple classes as a shared type, and use it to create `Union`s and `Intersect`ions of regions without worrying about what the underlying `Region` type actually was!

### Classes that share _implementation_!

The other new feature of Java that we learned about was `abstract class`es. We saw that sometimes, classes not only share behaviour (method signatures) but even fields and method bodies!

For instance, we saw that both the `UnionRegion` and `IntersectRegion` had exactly two `Region` fields, and their constructor bodies looked identical! So we were able to extract this shared code into an `abstract class`:

```java
abstract class ComboRegion implements Region {
    Region r1;
    Region r2;

    ComboRegion(Region r1, Region r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
}
```

And we saw that we can make use of this abstract class by having both `UnionRegion` and `IntersectRegion` `extend` this abstract class:

```java
class UnionRegion extends ComboRegion {
    UnionRegion(Region r1, Region r2) {
        super(r1, r2);
    }

    public boolean contains(Point p) {         
        return this.r1.contains(p) || this.r2.contains(p);
    }
}
```

Notice how in the construtor for `UnionRegion`, we call the constructor we defined in `ComboRegion` using the `super` keyword, and how we then had access to the `r1` and `r2` fields in the `contains` method.

### Summary
In summary, we saw two ways of representing shared behavior in Java. The first were `interface`s that shared method signatures, let us treat multiple classes as a shared type, and had the following syntax:

```java
interface /* Interface Name */ {
    /* Method Signature */;
    /* Method Signature */;
    /* ... */
}
```

The second where abstract classes that shared fields and method implementations, let us not need to repeat code, and had the following syntax:

```java
abstract class /* Class Name */ {
    /* Shared code */
}
```

Finally, we saw that classes and abstract classes can `implement` interfaces with the following syntax:

```java
class /* Class Name */ implements /* Interface Name */ { 
    /* ... */
}
```

and classes can `extend` abstract classes with the following syntax:

```java
class /* Class Name */ extends /* Abstract Class Name */ { 
    /* ... */
}
```

And with that, we are ready to solve this discussion's problems:

## Problem 1:
In the file `Discussion04.java`, write an `interface` called `Volume` with the following methods:

1. A method named `toCups` that returns a `double` and accepts no parameters. 
   This method returns the volume of the current object in US Cups.
2. A method named `add` that returns a `Volume` and accepts one `Volume` parameter.
   This method returns a new `Volume` which should be the sum of the current volume, and the volume of the parameter.

## Problem 2:
Write a class named `Cup` that represents volume measured in cups. It should implement the `Volume` interface, and have one field `cups` which is a double. Implement the `Volume` interface methods in `Cup`. 

## Problem 3:
Write a class named `Tablespoon` that represents volume measure in tablespoons. It should implement the `Volume` interface, and have one field `tbsp` which is a double. Implement the `Volume` interface methods in `Tablespoon`.

## Problem 4:
Besides the method signatures, is there any code that we could `abstract` out of the `Cup` and `Tablespoon` classes? Create a new abstract class named `AVolume` (A is short for abstract!) which implements `Volume`, and have both `Cup` and `Tablespoon` extend `AVolume`.

## Problem 5:
Create a new class named `ExampleVolumes` for testing the code you've written so far, and call the tester library methods at least 4 times to check that adding Cups to Cups, Tablespoons to Tablespoons, Cups to Tablespoons, and Tablespoons to Cups all work correctly.

(Reminder: To use the tester library, your method should return a `boolean`, start with the word `test` and accept one parameter of type `Tester`.)

## Problem 6: [Extra problem for the curious]
How could you redesign the problems above such that the `add` method in `Tablespoon` always returned a new `Tablespoon` object, and the `add` method in `Cup` always returned a new `Cup` object? Would you need to add a new method? What parts of the code would need to change?

## Problem 7: [Bonus problem for the adventurous]
Without changing any method signatures, or adding new methods, to our answers up to problem 3, rewrite the `add` method for `Tablespoon` such that if the `Volume` parameter is of type `Tablespoon`, it returns a new `Tablespoon` instance, and if it's of type `Cup`, it returns a `Cup` as usual.

(*Note*: This is an optional problem requiring Java features we haven't learned about. It is not in scope for the class, so don't worry if you can't answer it!)