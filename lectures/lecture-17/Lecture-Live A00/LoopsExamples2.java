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


    //factorial: take a number n and return n!
    int factorial(int n) {
        int result = 1;
        for (int current = 1; current <= n; current = current + 1) {
            result = result * current;
        }
        return result;
    }

    int result1 = factorial(4);     // should be 24
    int result2 = factorial(5);     // should be 120
    int result3 = factorial(6);     // should be 720


    //factorial2: take a number n and return n!
    int factorial2(int n) {
        int result = 1;
        for (int current = n; current > 0; current = current - 1) {
            result = result * current;
        }
        return result;
    }

    int result1fact2 = factorial2(4);     // should be 24
    int result2fact2 = factorial2(5);     // should be 120
    int result3fact2 = factorial2(6);     // should be 720    

    String timesTable(int width, int height) {
        String table = "\n";
        for (int row = 1; row <= height; row += 1) {     //outer loop
            for (int col = 1; col <= width; col += 1) {  //inner loop
                table = table + "\t" + (col * row);
            }
            table += "\n";  //newline - carriage return
        }
        return table;
    }

    String tt1 = timesTable(5, 5);
    String tt2 = timesTable(3, 7);
}
