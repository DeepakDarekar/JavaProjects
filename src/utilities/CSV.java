package utilities;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.LinkedList;

public class CSV {
	// This function will read the data from CSV file and return a list
	public static List read(String file){
		LinkedList<String> data =	new LinkedList<String>();
		String dataRow;
		
		try {
			
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while((dataRow = br.readLine())!=null);{	
			String[] dataRecord = dataRow.split(",");
			data.addAll(dataRecord);
		}
		} catch (FileNotFoundException e) {
			System.out.println("Could not found file");
			e.printStackTrace();
		}catch (IOException e) {
		System.out.println("Could Not read file");
		e.printStackTrace();
		}
		
		
	}

}
