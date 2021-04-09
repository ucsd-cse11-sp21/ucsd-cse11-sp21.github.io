class Point {
    int x;  //uninitialzied field definitions
    int y;

    // constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //quadrant - takes no parameters, returns a String
    //of which qudrant the Point is in
    String quadrant() {
        if (this.x > 0 && this.y > 0) { return "1"; }
        else if (this.x < 0 && this.y > 0) { return "2"; }
        else if (this.x < 0 && this.y < 0) { return "3"; }
        else if (this.x > 0 && this.y < 0) { return "4"; }
        else {
            return "On axis";
        }
    }
}

class ExamplesLec {

    int examplesOfNum = 4 + 5;

    Point fourFivePoint = new Point(4, 5);
    Point negOneThreePoint = new Point(-1, -3);
    Point fourFivePointAgain = this.fourFivePoint;

    //String quadA = this.Point.quadrant(); //does not work - no Point field in this class
    String quadA = this.fourFivePoint.quadrant();       //"1"
    String quadB = this.negOneThreePoint.quadrant();    //"3"

}
