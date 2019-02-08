package chap11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Noah 2/7/2019

public class WhatsWrong2{
	private ArrayList<String> names = null;
	private File file = null;
	
	public WhatsWrong2(){
		names = new ArrayList<String>();
		file = new File("myfile.txt");
	}
	
	public void getNames(){
    try{
		  BufferedReader in = new BufferedReader(new FileReader(file));
			
		  String line = in.readLine();
			
		  while(line != null){
				String name = line;
				this.names.add(name);

				line = in.readLine();
      }
      
      in.close();
		}catch(FileNotFoundException fe){
			System.out.println("File not found");
		}catch(IOException ioe){
			System.out.println("IO Exception occured");
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}
