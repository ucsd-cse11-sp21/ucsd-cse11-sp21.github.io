class A { }
class B extends A { }
class C extends A { }

class JavaFun {

    C c = new C();
    B b = new B();
    A a = new A();
    A aTypedVariableHoldingAC = new C();

    boolean aInstanceOfA = a instanceof A;
    boolean bInstanceOfB = b instanceof B;
    boolean cInstanceOfC = c instanceof C;

    boolean cInstanceOfA = c instanceof A;
    //Java won't let us run the next line
    //boolean cInstanceOfB = c instanceof B;
    boolean aInstanceOfC = a instanceof C;
    boolean cInAVarInstanceofC = aTypedVariableHoldingAC instanceof C;
    boolean cInstanceOfObject = c instanceof Object;






    int x = 2147483647;
    int y = -2147483648;

    long n = 214748364887834734L;
    long maxLong = Long.MAX_VALUE;

    float f = 1.0F;

    float max = Float.MAX_VALUE;
    float min = Float.MIN_VALUE;

    String apple = "apple";
    char ch = apple.charAt(0);

    String s = ch + "bc";
}
