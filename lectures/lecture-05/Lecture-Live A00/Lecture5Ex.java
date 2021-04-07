class Lecture5Ex {
    boolean b1 = 4 < 5;
    boolean b2 = 5 < 4;

    boolean b3 = 4 == 4;
    boolean b4 = 4 == 5;

    boolean b5 = 5 > 4;
    boolean b6 = 5 >= 4;

    //boolean stringComp = "a" < "b";
    boolean stringComp = "a" == "a";
    boolean stringComp2 = "a" == "b";

    boolean b7 = 4 != 4;
    boolean b8 = 4 != 5;

    boolean and1 = true && true;
    boolean and2 = true && false;
    boolean and3 = false && true;
    boolean and4 = false && false;
    
    boolean or1 = true || true;
    boolean or2 = true || false;
    boolean or3 = false || true;
    boolean or4 = false || false;
    
    //write a method that takes a number and returns
    //true if it's in the region for number line 1
    boolean numberLine1(int number) {
        return number >= 2;
    }

    boolean example1 = this.numberLine1(2);
    boolean example2 = this.numberLine1(5);
    boolean example3 = this.numberLine1(-1);

    boolean numberLine2(int number) {
        return ((number > 5) && (number < 7) ) || 
                (number < 2);
    }
    
    boolean nl2a = this.numberLine2(6);


    //Write the method to calculate absolute value that takes a number and returns 
    //the negation if it’s less than 0, or that number otherwise
    int absolute(int number) {
        if (number < 0)  {
            return -1 * number;     //then branch
        }
        else {
            return number;          //else branch (optional)
        }
    }

    int abs1 = this.absolute(-2);	//should  produce 2
    int abs2 = this.absolute(4);	//should produce 4

}
