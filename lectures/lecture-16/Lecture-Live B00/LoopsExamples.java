import tester.*;

class LoopsExamples {

    String[] fruit = { "apple", "banana", "cucumber" };
    String[] letters = { "b", "e", "a", "r" };

    //Returns the sum of the lengths of the strings in strs
    //for ANY length array that is given to us.
    int sumOfLength(String[] strs) {
        //We need a way to do the sume for all the elements
        //no matter how many there are
        int sum = 0;
        for (String s: strs) {
            sum = sum + s.length();
        }
        return sum;
    }

    boolean testSumOfLengths(Tester t) {
        return t.checkExpect(this.sumOfLength(fruit), 19) &&
               t.checkExpect(this.sumOfLength(letters), 4);
    }

    //write a method product that takes an array of int and returns
    //the product (multiplicatino) of those numbers
    int product(int[] nums) {
        int total = 1;
        for (int n: nums) {
            total = total * n;
        }
        return total;        
    }

    int[] nums1 = { 2, 4, 6 };  //48
    int[] nums2 = { 5, 3, 1, 2, 1 }; //30

    boolean testProduct(Tester t) {
        return t.checkExpect(this.product(nums1), 48) &&
               t.checkExpect(this.product(nums2), 30);
    }

    //average: take an array of double and return a double
    //representing the average (mean)
    double average(double[] doubles) {
        double total = 0.0;
        //int count = 0;
        for (double d: doubles) {
            total = total + d;
            //count = count + 1;
        }
        //return total / count;
        return total / doubles.length;
    }

    double[] ds1 = { 2.0, 4.0, 1.0 };       //  7 / 3
    double[] ds2 = { 5.0, 1.0, 3.0, 6.0 };  // 15 / 4

    boolean testAverage(Tester t) {
        return t.checkExpect(this.average(ds1), 7.0 / 3.0) &&
               t.checkExpect(this.average(ds2), 15.0 / 4.0);
    }

    //write sumEvens: which takes an array of ints and
    //returns the sum of just the even ones
    //{ 1, 2, 7, 4 } -> 6
    //{ 4, 2, 4, 5 } -> 10
    //{ 0, -2, 7, 4, 8 } -> 10
    int sumEvens(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            if (i % 2 == 0) {
                sum += i;
                //sum = sum + i;
            }
        }
        return sum;
    }

}
