class ExamplesLec {
    
    //weeklyPay: takes a number of hours worked and an hourly
    //rate, and returns the pay with overtime (over 40 hours)
    //counting as double the rate
    //Assume: hours and rate are both positive
    double weeklyPay(int hours, double rate) {
        double baseRate = (hours * rate);

        if (hours > 40) {
            double overTimeRate = ((hours - 40) * rate);
            return baseRate + overTimeRate;
        }
        else {
            return baseRate;
        }
    }

    double wp1 = this.weeklyPay(45, 10); //400+100 = 500
    double wp2 = this.weeklyPay(35, 10); //350
    double wp3 = this.weeklyPay(-9, 10);
}
