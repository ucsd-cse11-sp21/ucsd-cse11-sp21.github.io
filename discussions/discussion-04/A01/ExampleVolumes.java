/*
interface called `Volume` with the following methods:

1. A method named `toCups` that returns the volume of the current object in US Cups.
2. A method named `add` that returns a `Volume` and accepts one `Volume` parameter.
   This should return the sum of the current volume, and the volume of the parameter.

# class named `Cup` that represents volume measured in cups using `Volume` interface

# class named `Tablespoon` that represents volume measure in tablespoons (16 tbps = 1 cup)

# `abstract` out of the `Cup` and `Tablespoon` classes? 

# create tests using tester
   */


import tester.*;


interface Volume {

   public double toCups();

   public Volume add (Volume v);

}

abstract class AVolume implements Volume{
   public Volume add (Volume v){
      return new Cup(this.toCups() + v.toCups());
  }
}

class Cup extends AVolume{
   double cups;

   Cup(double cups){
      this.cups = cups;
   }

   public double toCups(){
      return this.cups;
   }

}

class Tablespoon extends AVolume {
   double tbsp;
   Tablespoon(double tbsp){
      this.tbsp = tbsp;
   }

   public double toCups(){
      return this.tbsp/16.0;
   }

}

class ExampleVolumes {
   Volume oneCup = new Cup(1.0);
   Volume twoCups = new Cup(2.0);
   Volume threeCups = oneCup.add(twoCups);

   Volume sixteentbsp = new Tablespoon(16.0);
   Volume thirtytwotbsp = new Tablespoon(32.0);
   Volume fortyeighttbsp = sixteentbsp.add(thirtytwotbsp);

   Volume alsotwoCups = oneCup.add(sixteentbsp);//2
   Volume fourCups = sixteentbsp.add(oneCup);//2


   boolean testCups(Tester t){
      return t.checkExpect(1.0, oneCup.toCups()) && t.checkExpect(2.0, twoCups.toCups());


   }

   boolean testTablespoon(Tester t){
      return t.checkExpect(16.0/16.0, sixteentbsp.toCups())&& t.checkExpect(48.0/16.0, fortyeighttbsp.toCups());


      }

   boolean testcupstbsp(Tester t){
      return t.checkExpect(2.0, alsotwoCups.toCups())&& t.checkExpect(2.0, fourCups.toCups());

   }







}




