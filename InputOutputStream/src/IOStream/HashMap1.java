package IOStream;

	import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

	public class HashMap1 {
		public static ArrayList<Integer> intList=new ArrayList<Integer>();
		public static ArrayList<String> stringList=new ArrayList<String>();
		public static String filename = (System.getProperty("user.dir") + File.separatorChar +"NewHashEntries.txt");
		public static void main(String[] args){
			String p="y";
			
			PrintWriter writer = null;
			 try{
			 writer = new PrintWriter(new File(filename));
			 }
			 catch(FileNotFoundException e){
				 System.out.println(e.getMessage());
			 }
			 
			Scanner keyboard= new Scanner(System.in);
			HashMap<Integer, String> myMap = new HashMap<Integer, String>();
			myMap.put(10, "ten"); myMap.put(9, "nine"); myMap.put(8, "eight"); myMap.put(7, "seven"); myMap.put(6, "six"); myMap.put(5, "five"); myMap.put(4, "four"); myMap.put(3, "three"); myMap.put(2, "two"); myMap.put(1, "one"); myMap.put(0, "zero");
			while(p.equals("y")){
			int a=Validator.getInt(keyboard, "Enter a number: ");
			String b=myMap.get(a);
			if(!myMap.containsKey(a)){
				b=Validator.getString(keyboard, "Not found in database. Enter value: ");
				intList.add(a);
				stringList.add(b);
				myMap.put(a, b);
				writer.println(a+"\t"+b);
			}
			System.out.println("You entered "+b+".");
			p=Validator.getString(keyboard,"Another one?(y/n) ");
			}
			System.out.println("\n-----------------\nNew Entries: ");
			writer.close();
			Display();
			System.out.println("-----------------\n\nClosing program....");
			
		}
		public static void Display() {
			 BufferedReader reader = null; 
			try {
				reader = new BufferedReader(new FileReader(filename));
				String line = reader.readLine();
				while (line != null){
				
				System.out.println(line);	
				line = reader.readLine();
			
				
				}
				reader.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}

	}


