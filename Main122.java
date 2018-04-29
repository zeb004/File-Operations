import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;




public class Main122 {
    public static void main(String[] args) {

           Scanner name=new Scanner (System.in);
           Scanner nameFN=new Scanner (System.in);
          char c;
          int fd;
          boolean append=true;
          char[] filename;
          String FN;
          System.out.println("Enter the file name");
           FN=nameFN.nextLine();
          try (Scanner input = new Scanner(new File(FN))) {
   		while(input.hasNextLine()) {
   		    String data = input.nextLine();
              System.out.println(data);

			        	    FileWriter writer = new FileWriter(FN,append);
			        	    writer.write("\nThe first line");
			        	    writer.write("\nThe second line");
			        	    writer.close();

          }
          }  catch (IOException e) {
   	   e.printStackTrace();
   		}



   }
   }





