package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import data.DataController;
import data.Person;
import ui.FirstForm;
//import ui.SimpleTable;

public class FirstFormActionListener implements ActionListener{
	
	private FirstForm ui;
	private DataController datacn;
	
	

	public FirstFormActionListener(FirstForm ui, DataController datacn) 
	{
		super();
		this.ui = ui;
		this.datacn = datacn;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ui.getButton())
		{
			try {
				ArrayList<Person> dataArrayList = this.datacn.readData();
				FirstForm formui = new FirstForm();
				formui.populateTable(dataArrayList);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
