class A {
    protected int count;
    protected int x;

    A(int x){
        this.x = x;
        this.count  =0;
    }

    public int getX(){
        this.count += 1;
        return this.x;
    }

    public void setX(int x){
        this.count +=1;
        this.x = x;
    }

    

}
class B extends A{
    int y;

    B(int x, int y){
        super(x);
        this.y = y;
    }

    public int getX(){
        return this.x;

    }

}

class C extends B{
    int z ;
    C(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public int getX(){
        return this.x;


}   
public int getY(){
    return this.y;


}
// class C extends B{
//     int y;

//     C(int x, int y){
//         super(x);
//         this.y = y;
//     }
}


public class Example{
    // A a = new A();
    // B b = new B();
    // C c = new C();

    // boolean ainstA = a instanceof A;
    // boolean binstA = b instanceof A;
    // // boolean cinstB = c instanceof B;

    // A a = new B(1);

    // // int temp = a.x;
 
    // B b = (B) a ;

    // int temp2 = b.x;
    // A a2 = new C(2,3);


    // int cX = ((B) a2).x;
    // int cY = ((C) a2).y;

    public static void main(String args[]){
        A a = new A(5);

        int temp = a.x;
        int currentval = a.getX();
        a.setX(a.getX() + 3);
        int newValue = a.getX();
        System.out.println(temp);
        System.out.println(newValue);
        C c = new C(1,2,3);
        int temp2 = c.getX();
        int err = c.x;
        System.out.println(err);




    }


}