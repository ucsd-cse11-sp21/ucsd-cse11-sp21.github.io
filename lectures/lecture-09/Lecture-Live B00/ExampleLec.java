import tester.*;

class ExampleLec {
    
    double average(double n1, double n2) {

        double sum = n1 + n2;   //sum is local variable
        return sum / 2.0;

        //return (n1 + n2) / 2.0;
    }

    boolean testAverage(Tester t) {
        ExampleLec ex = new ExampleLec();   //ex is a local variable (a reference to a new ExampleLec object)
        return t.checkExpect(ex.average(1, 2), 1.5);
    }
}
