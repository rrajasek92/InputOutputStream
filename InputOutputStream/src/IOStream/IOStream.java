package IOStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
public class IOStream {
	  //How to write to a file and read from a file
	 //don't forget to include Exception handling
	 //import these libraries from the java api
	 
	public static void main(String[] args){
	 //get a filename
	 String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");

	 //write to a file
	 PrintWriter writer = null;
	 try{
	 writer = new PrintWriter(new File(filename));
	 }
	 catch(FileNotFoundException e){
		 System.out.println(e.getMessage());
	 }
	 writer.println("this is a string");
	 writer.close();

	 
//	 BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + File.separatorChar +"mybooks.txt"));
//	 String line = reader.readLine();
//	 System.out.println(line);
//	 reader.close();
	}
}
