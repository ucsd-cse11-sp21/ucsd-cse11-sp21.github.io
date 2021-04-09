class Point {
    int x;  //unitialzied field definitions
    int y;

    // constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //quadrant - takes no parameters, and returns a String
    //of which qudrant the point is in
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

    //String quadA = Point.quadrant();    //doesn't work, there is no object
    String quadA = this.fourFivePoint.quadrant();       //"1"
    String quadB = this.negOneThreePoint.quadrant();    //"3"
}
