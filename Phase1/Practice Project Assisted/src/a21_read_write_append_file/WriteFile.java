package a21_read_write_append_file;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {
  public static void main(String args[]) {

    String data = "This is the data in the output file";
    
    try {
      // Step 1: Creates a Writer using FileWriter
      FileWriter output = new FileWriter("C:\\Users\\hp\\Desktop\\RGU3.txt");
      
      // Step 2: Writes string to the file
      output.write(data);
      System.out.println("Data is written to the file.");

      // Step 3: Closes the writer
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}