// Base Class
class Parent {
    void show()
    {
        System.out.println("Parent's class");
    }
}
  // Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show()
    {
        System.out.println("Child's class");
    }
}

class A {}
class B extends A {int x;}
class C extends A {}


class DiscussionExamples{

  // public static void main(String[] args){
  //   Parent p = new Parent();
  //   Child c = new Child();
  //   p.show();
  //   c.show();
  // }
  

  A a = new A();
  B b = new B();
  C c = new C();
  
  A a2 = new B();
  //int x = a2.x;

  B b2 = (B) a2;
  int x2 = b2.x; // 0
  
  B b3 = (B) a;
  boolean isAAnInstanceOfA = a instanceof A; // true
  boolean isAAnInstanceOfB = a instanceof B; // false
  boolean isBAnInstanceOfA = b instanceof A; // true
  boolean isBAnInstanceOfB = b instanceof B; // true
  boolean isA2AnInstanceOfA = a2 instanceof A; // true
  boolean isA2AnInstanceOfB = a2 instanceof B; // true
}