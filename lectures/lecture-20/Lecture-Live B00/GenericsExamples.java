import tester.*;

class Point {
  int x;
  int y;
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  double distance(Point other) {
    return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
  }
}

class TextTweet {
  String author, content;
  TextTweet(String author, String content) {
    this.author = author;
    this.content = content;
  }
}

class GenericsExamples {
  TextTweet t1 = new TextTweet("gregmiranda", "#welcome to CSE11, incoming students!");
  TextTweet t2 = new TextTweet("jacobsschool", "#welcome to #engineering at #ucsd ");
  TextTweet t3 = new TextTweet("ucsd", "#welcome to UCSD!");
  TextTweet t4 = new TextTweet("warrencollegeucsd", "You're going to love #ucsd new students!");

  int countNear0(Point[] pts) {
    int count = 0;
    for (Point pt: pts) {
      if (pt.distance(new Point(0,0)) < 5) {
        count += 1;
      }
    }
    return count;
  }

  Point[] pts1 = { new Point(10, 10), new Point(1, 1), new Point(2, 3) };
  int result1 = this.countNear0(pts1);

  int countInQudrant1(Point[] pts) {
    int count = 0;
    for (Point pt: pts) {
      if (pt.x > 0 && pt.y > 0) {
        count += 1;
      }
    }
    return count;
  }

  Point[] pts2 = { new Point(-1, 10), new Point(1, -1), new Point(2, 3) };
  int result2 = this.countInQudrant1(pts2);

}
