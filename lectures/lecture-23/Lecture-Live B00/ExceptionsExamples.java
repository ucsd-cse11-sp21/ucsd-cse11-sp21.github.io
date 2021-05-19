import java.util.ArrayList;;

public class ExceptionsExamples {

    Exception e = new IllegalArgumentException("this exception isn't being thrown");


    /**
     * ASSUME that elements is nonempty: throws IllegalArgument Exception
     * if elements is empty
     * @param elements
     * @return
     */
    static Integer max(ArrayList<Integer> elements) {
        if (elements.size() == 0) {
            throw new IllegalArgumentException("max got an empty list");
        }
        Integer maxValue = elements.get(0);
        for (Integer i: elements) {
            if (maxValue < i) { //i > maxValue
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-5);
        al.add(-10);
        al.add(-7);
        System.out.println(max(al));

        ArrayList<Integer> al2 = new ArrayList<>();
        //System.out.println(max(al2));

        Exception e1 = new IllegalArgumentException("this is not being thrown from main");
        System.out.println(e1);
        System.out.println("The program kept running");
    }    
}
