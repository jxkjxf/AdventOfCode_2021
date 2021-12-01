import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;


public class DMeasure {
	public static void main(String[] args) {
		
		LinkedList<Integer> depths = new LinkedList<>(); //linked list
		int x = 0, y = 0, total = 0;
		try { //start of try catch
			File _input = new File("src\\Input.txt"); //new file Input.txt, located in "src"
			
			Scanner radar = new Scanner(_input); //new scanner to scan the input
			while(radar.hasNextLine()) { //while input has stuff in it
				String data = radar.nextLine(); //temp string for data
				depths.add(Integer.parseInt(data));
			}
			radar.close();
		} catch(FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
		for(int i = 0; i < depths.size(); i++) {
			x = depths.get(i);
			
			if(x > y && y != 0) {
				total++;
			}
			
			y = x;
		}
		
		System.out.printf("Total amount of increases = %d\n", total);
	}
}
