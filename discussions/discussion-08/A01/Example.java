/*
Recall the lookup method from PA5. This method accepts two arrays, a String array named keys and an int array named 
values, and a String parameter key that it looks up in the "keys" to return the corresponding "value".

In file named Dictionary.java, write a class named DictionaryExamples and in it define a method named lookup
 that accepts two Lists named keys and values and a key, and returns the value corresponding to the key.
  If the key does not exist, it should return null. This method should be generic over two types,
   a type K for keys, and a type V for values.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import tester.*;

class Dictionary<K, V> {

   List<K> keys;
   List<V> values;


   Dictionary(){
      this.keys = new ArrayList<>();
      this.values = new ArrayList<>();
   }

   void put(K key, V value){
      for (int i = 0; i < keys.size(); ++i){
         if(this.keys.get(i).equals(key)){
            this.values.set(i, value);
            return ;
         }
      }

      this.keys.add(key);
      this.values.add(value);


   }

   V get(K key){

      for(int i = 0 ; i<keys.size();++i){
         if(this.keys.get(i).equals(keys)){
            return this.values.get(i);
         }
      }
      return null;
   }

}


class Example{


   <K, V> V lookup (List<K> keys, List<V> values, K key){

      for (int i = 0; i< keys.size();++i){
         if(keys.get(i).equals(key)){
            return  values.get(i);
         }
      }
      return null;
   } 
   boolean testLookup(Tester t){
      List<Integer> intkeys = Arrays.asList(1,2,3);
      List<String> strvalues = Arrays.asList("a", "b", "c");

      return t.checkExpect(this.lookup(intkeys, strvalues, 2),"b") && t.checkExpect(this.lookup(intkeys, strvalues, 5),null);

   }


}