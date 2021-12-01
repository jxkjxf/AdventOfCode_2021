import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DMeasure_2 {
	
	static ArrayList<Integer> depths = new ArrayList<>();
	
	public static void main(String[] args) {
		inputFile("src\\Input.txt");
		
		int a = 0, b = 0, c = 0, total = 0;
		
		System.out.println(depths.size());
		
		for(int i = 1; i < depths.size() - 3; i++) { //I... I don't even know man... It worked tho!
			a = depths.get(i);
			b = depths.get(i + 1);
			c = depths.get(i + 2);
			
			depths.set(i, (a + b + c));
			
			if(depths.get(i) > depths.get(i - 1)) {
				total++;
			}
		}
		
		System.out.println(total);
	}
	
	public static void inputFile(String filepath) {
		try { 
			File _input = new File(filepath); 
			
			Scanner radar = new Scanner(_input);
			while(radar.hasNextLine()) { 
				String data = radar.nextLine(); 
				depths.add(Integer.parseInt(data));
			}
			radar.close();
		} catch(FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
