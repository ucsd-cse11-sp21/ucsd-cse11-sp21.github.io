class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class Equality {

    Point p = new Point(4, 5);
    Point p2 = new Point(4, 5);

    boolean pAndP2EqualsByOperator = p == p2;
    boolean pAndP2Equals = p.equals(p2);    //Calling the .equals method on built-in Object class





    public static void main(String[] args) {
        String appleVar1 = "apple";
        String appleVar2 = "apple";

        System.out.println("appleVar1 == appleVar2: " + (appleVar1 == appleVar2));
        System.out.println("appleVar1 == args[0]: " + (appleVar1 == args[0]));
        System.out.println(appleVar1 + " == " + args[0]);
        System.out.println(appleVar1.length() + " == " + args[0].length());

        System.out.println("appleVar1.equals(args[0]): " + (appleVar1.equals(args[0])));
    }
}
