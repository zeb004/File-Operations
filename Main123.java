import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;





public class Main123 {
    public static void main(String[] args) {
	Scanner name=new Scanner (System.in);
	System.out.println("How many names?");
	    int a = name.nextInt();
	    System.out.println("Enter the " + a + " names: ");

	    String [] names = new String[a];
	    String [] sort=new String[a];
	    String [] PT2= new String[a];
	    int g=0;
	    String [] PT3= new String[a];
	    int h=0;
	    for (int b = 0; b <names.length; b++){
	        names[b] = name.next();
	        }

	    for (String i : names){
	        System.out.println(i);
	        }

	    name.close();

 String[] t = new String[names.length];
	    for (int p= 0; p < names.length; p++) {
	      t[p]= new StringBuilder(names[p]).reverse().toString();
}




try{
    PrintWriter writer = new PrintWriter("Zflie1.txt");
    for(int z=0;z<t.length;z++) {
    writer.println(t[z]);
}
    writer.close();
} catch (IOException e) {
    e.printStackTrace();
}

  try (Scanner input = new Scanner(new File("Zflie1.txt"))) {
    		while(input.hasNextLine()) {
   		    PT2[g] = input.nextLine();
   		    g++;
}

} catch (IOException e) {
    e.printStackTrace();
}
try (Scanner input2 = new Scanner(new File("Zflie2.txt"))) {
    		while(input2.hasNextLine()) {
   		    PT3[h] = input2.nextLine();
   		    h++;
}

} catch (IOException e) {
    e.printStackTrace();
}
String[] l = new String[PT2.length];
	    for (int x= 0; x < PT2.length; x++) {
	      l[x]= new StringBuilder(PT2[x]).reverse().toString();
}

try{
    PrintWriter writer1 = new PrintWriter("Zflie2.txt");
    for(int o=0;o<l.length;o++) {
    writer1.println(l[o]);
}
    writer1.close();
} catch (IOException e) {
    e.printStackTrace();
}

String[] s = new String[PT3.length];
	    for (int w= 0; w < PT3.length; w++) {
	      s[w]= new StringBuilder(PT3[w]).reverse().toString();
}
try{
    PrintWriter writer2 = new PrintWriter("Zflie3.txt");
    for(int q=0;q<s.length;q++) {
		sort[q]=s[q];
	}
		Arrays.sort(sort);
		for(int d=0;d<sort.length;d++) {

   writer2.println(sort[d]);

}
    writer2.close();
} catch (IOException e) {
    e.printStackTrace();
}
	}
	}