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

}
