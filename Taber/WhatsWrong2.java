import java.io.IOException

public class WhatsWrong2 implements WhatsWrong{
	
	private ArrayList<String> names = null;
	private final File file = null;
	
	public WhatsWrong2() {
		names = new ArrayList<String>();
		public class Names()
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
		
	} catch (FileNotFoundException fe) {
		System.out.println("File not found");
	} catch (Exception e) {
		System.out.println("Exception occured");
	} catch (IOException ioe) {
		System.out.println("IO Exception occured");
	}
}
}

