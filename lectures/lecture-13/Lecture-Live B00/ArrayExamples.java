import tester.*;

class ArrayExamples {

    //Returns true if the array has no elements,
    //otherwise it returns false
    boolean isEmpty(int[] array) {
        return array.length == 0;
    }

    int[] nums = { 4, 2, 7 };
    int[] emptyNums = {};
    int[] nums2 = nums;

    boolean testEmpty(Tester t) {
        //this.nums[0] = 10;
        //System.out.println(this.nums[0]);

        return t.checkExpect(this.isEmpty(nums), false) &&
               t.checkExpect(this.isEmpty(emptyNums), true);
    }

    //int firstNumber = nums[0];
    //int secondNumber = nums[1];
    //int thirdNumber = nums[2];
    //int fourthNumber = nums[3];

    String[] strs = { "a", "b", "z", "y" };
    //String[] nAndS = { 2, "b", "z" };

    int countStrs = strs.length;
}
