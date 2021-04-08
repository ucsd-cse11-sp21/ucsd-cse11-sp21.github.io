class Rectangle{
    int width;
    int height;

    int computeArea(){
        return this.width * this.height;
    }

    boolean isValid(){
        if (this.width > 0 && this.height > 0){
            return true;
        }
        else{
            return false;
        }
        //return (this.width > 0 && this.height > 0);
    }
    

    // "Width: <width>, height: <height>"
    String toText(){
        return "Width: " + String.valueOf(this.width) + ", height: " + String.valueOf(this.height);
    }

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    Rectangle(){
        this.width = 1;
        this.height = 1;
    }
}

class DiscussionExample{
    Rectangle myRectangle = new Rectangle(1, 2);
    boolean valid = myRectangle.isValid();
    int area = myRectangle.computeArea();

    Rectangle yetAnotherRectangle = new Rectangle(-1, 2);
    boolean anotherValid = yetAnotherRectangle.isValid();

    Rectangle anotherRectangle = new Rectangle();
}