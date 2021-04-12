class Point {
    int x;
    int y;
    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    // Write a method called add that takes another point
    // and returns a new point with two x coordinates added
    // and the two y coordinates added as its x and y field
    Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

}

class Line {
    int slope;
    int yIntercept;

    Line(int slope, int yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    // Write a method calcY that calculates the y value for a given x
    int calcY(int x) {
        return (x * this.slope) + this.yIntercept;
    }
}

class ExamplesLec {
    //Points
    Point p1 = new Point(2, 3);
    Point p2 = new Point(-1, 1);

    Point pointAdded1 = this.p1.add(p2);    //1, 4
    //Point pointAdded2 = this.p2.add(p1);    //1, 4

    //Lines
    Line line1 = new Line(1, 5);
    Line line2 = new Line(3, -5);

    int calcY1 = this.line1.calcY(5);   //10
    int calcY2 = this.line2.calcY(3);   //4

    //doubles
    int n = 15 / 2;
    double m = 15.0 / 2.0;

    double oneThird = 1.0 / 3.0;
    double twoThirds = 2.0 / 3.0;
    
    double anotherOne = (0.1 + 0.2) + 0.3;
    double yetAnother = 0.1 + (0.2 + 0.3);

    double divided = 15 / 2;
    double dividedAgain = n / 2.0;

}
