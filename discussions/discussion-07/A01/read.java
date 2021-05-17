import java.nio.file.Files;

/*
read file

*/
import java.nio.file.*;
import java.io.IOException;



class FileHelper {

    static String[] getlines(String path){
        try {
            return Files.readAllLines(Paths.get(path)).toArray(String[]::new);//lambda function - returns new String[size]
        }
        catch(IOException e){
            // System.err.println("Error reading file " + path +": " +e);
            return new String[]{"Error reading file " + path +": " +e}; 
        }

    }
}

class read{

    public static void main (String [] args){
        if(args.length < 1){
            System.out.println("Please provide path");
        }
        else {
            String filepath = args[0];
            String[] lines = FileHelper.getlines(filepath);

            for(String line: lines){
                System.out.println(line);
            }
        }
    }
}