/*
It should return a String containing a visualization of circular Region in a view from xmin to xmax and ymin to ymax
using abstract classes and interface

total 40x40 and circle centre at 20,20 
should print the following to the terminal:

________________________________________
________________________________________
________________________________________
________________________________________
________________________________________
______________##############____________
____________##################__________
__________######################________
__________######################________
__________######################________
__________######################________
__________######################________
__________######################________
__________######################________
____________##################__________
______________##############____________
________________________________________
________________________________________
________________________________________
________________________________________
*/

class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }
}

interface Region {
    boolean contains(Point p);
    String visualize(int xmin, int xmax, int ymin, int ymax);
}

abstract class ARegion implements Region {
    public String visualize(int xmin, int xmax, int ymin, int ymax){
        String result = "";

        for (int y = ymin; y<=ymax ; y++){
            for (int x = xmin; x<=xmax; x++){
                if(this.contains(new Point(x,y))){
                    result += "##";
                }
                else{
                    result += "__";
                }
            
            }
            result += "\n";
        }
        return result;
    }
}

class CircRegion extends ARegion{
    Point center;
    int radius;
    CircRegion(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public boolean contains(Point p){
        return this.center.distance(p) <this.radius;
    }
}

class Discussion06{

    public static void main(String[] args ){
        CircRegion c1 = new CircRegion(new Point(10,10), 5);

        System.out.println(c1.visualize(0, 20, 0, 20));
    }
}