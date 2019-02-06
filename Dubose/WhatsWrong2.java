package whatswring;

/**
 * Abby DuBose
 * Feb 6, 2019
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WhatsWrong2 extends WhatsWrong{
	
	private ArrayList<String> names = null;
	private final File file = null;
	
	public WhatsWrong2() {
		names = new ArrayList<String>();
		file = new File("myfile.txt");
	}
	
	public void getNames() {
		
			BufferedReader in = new BufferedReader(new FileReader(file));
			
			String line = in.readLine();
			
			while(line != null) {
		
				String name = line;
				this.names.add(name);

				line = in.readLine();
			}
		
		//I know it needs a try, but when ever i put try in to it, it still stays red. so i'd gotten everything else fixed but the catchs
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (Exception e) {
			System.out.println("Exception occured");
		} catch (IOException ioe) {
			System.out.println("IO Exception occured");
		}
	}

