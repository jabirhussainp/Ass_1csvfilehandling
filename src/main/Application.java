package main;

import javax.swing.JButton;

import data.DataController;
import events.FirstFormActionListener;
import ui.FirstForm;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstForm ui = new FirstForm();
		ui.setVisible(true);
		DataController dc = new DataController();
		
		FirstFormActionListener al = new FirstFormActionListener(ui, dc);
		
		JButton btnImport = ui.getButton();
		
		btnImport.addActionListener(al);

	}

}
