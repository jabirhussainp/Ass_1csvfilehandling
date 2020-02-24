package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataController {
	
	private final String FILE_LOCATION = "data/titanic.csv";
	

	
	
	public ArrayList<Person> readData() throws FileNotFoundException
	{
		ArrayList<Person> listPerson = new ArrayList<Person>();
		//String line="";
		
		BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION));
		
		
		
		try {
			String line = br.readLine();
			
			while(line!=null) {
				
				Person person = new Person();
				listPerson.add(person);
				line = br.readLine();
				
				
				//Person person = createPerson(attributes);
				//listPerson.add(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listPerson;
		
	}

}
