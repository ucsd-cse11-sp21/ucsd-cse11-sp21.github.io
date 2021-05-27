import java.util.Arrays;
import java.nio.file.*;
import java.io.IOException;

class FileHelper {
  /*
    Takes a path to a file and returns all of the lines in the file as an
    array of strings, printing an error if it failed.
  */
  static String[] getLines(String path) throws IOException{
    return Files.readAllLines(Paths.get(path)).toArray(String[]::new);
  }
}

class DiscussionExamples{
    // public static void main(String[] args){
    //     try{
    //         String[] arr = FileHelper.getLines("exam.txt");
    //         for (String s : arr){
    //             System.out.println(s);
    //         }
    //     } catch(IOException e){
    //         System.out.println("File does not exist");
    //     }
    // }
    // String a = "hello";
    // String b = "hhello".substring(1);
    // boolean c = a.equals(b);

    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    boolean c = a.equals(b);
    boolean d = Arrays.equals(a, b);
}