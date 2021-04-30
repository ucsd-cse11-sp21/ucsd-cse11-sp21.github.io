import tester.*;

class ArrayExamples{
    int[] nums1 = { 4, 2, 7 };
    // int[] nums5 = {4, 4, 4, 4} // Would work!
    int[] nums2 = {};
    int[] nums3 = new int[5];  // 5 is the size
    int[] nums4 = nums1;       // Be EXTRA careful!!!!
    String[] strs1 = {"Hello", "CSE11"};
    int nums1Length = nums1.length;
    int firstElem  = nums1[0];  // 4
    int secondElem = nums1[1];  // 2
    int thirdElem  = nums1[2];  // 7
    // int fourthElem = nums1[3];  // Index 3 out of bounds for length 3

    boolean testModifyElement(Tester t){
        this.nums1[2] += 1;
        return t.checkExpect(this.nums1[2], 8) && t.checkExpect(this.nums4[2], 8);
    }
}