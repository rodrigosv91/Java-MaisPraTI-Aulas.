
package aula06_exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Aula06_Exercicio1 {
    
        /*
        // Exercise: Modify the following cat method so that it will compile:   
        public static void cat(File file) {
            RandomAccessFile input = null;
            String line = null;

            try {
                input = new RandomAccessFile(file, "r");
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
                return;
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        } */
        // Answer 
        public static void cat(File file) {
            RandomAccessFile input = null;
            String line = null;

            try {
                input = new RandomAccessFile(file, "r");    //add FileNotFoundException catch to RandomAccessFile
                while ((line = input.readLine()) != null) { //add IOException catch to input.readLine
                    System.out.println(line);
                }
                return;
            } catch(FileNotFoundException fnf) {        // catch to RandomAccessFile
                System.err.format("File: %s not found%n", file);
            } catch(IOException e) {
                System.err.println(e.toString());
            }finally {
                if (input != null) {
                  try {                 //add try catch to input close
                        input.close();
                    } catch(IOException io) {   
                    }
                }
            }
        }

        
    public static void main(String[] args) {
       
        //ListOfNumbers listofnumbers =  new ListOfNumbers();
        //listofnumbers.writeList();
        
        ListOfNumbers2 listofnumbers2 =  new ListOfNumbers2();
        //listofnumbers2.readList("infile.txt");
        //listofnumbers2.writeList();
        
    }
    
}
