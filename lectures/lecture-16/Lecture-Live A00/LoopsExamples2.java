import tester.*;

class LoopsExamples2 {

    //sumEveryOther: adds up the elements at the even indices
    //in an array of int and returns the result
    int sumEveryOther(int[] nums) {
        int total = 0;

        for (int index = 0; index < nums.length; index += 2) {
            total += nums[index];
        }

        return total;
    }

    int[] array1 = { 1, 2, 4, 5 };
    int[] array2 = { 1, 2, 4, 5, 100 };

    void testSumEveryOther(Tester t) {
        t.checkExpect(this.sumEveryOther(array1), 5);
        t.checkExpect(this.sumEveryOther(array2), 105);
    }



    public static void main(String[] args) {

        for (int num = 0; num < 7; num = num + 1) {
            System.out.println("num is: " + num);
        }

    }
}
