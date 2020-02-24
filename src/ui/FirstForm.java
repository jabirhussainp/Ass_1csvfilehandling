package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import data.Person;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FirstForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String[] columnNames = {"ID","Name","Age","Sex","P.Class","Survived","Fare"};
	private Object[][] data = new Object[][]{};
	private JButton btnImport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm frame = new FirstForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnImport = new JButton("Import");
		btnImport.setBounds(252, 31, 117, 29);
		contentPane.add(btnImport);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 83, 541, 273);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel( new DefaultTableModel(data,  columnNames));
		scrollPane.setViewportView(table);
	}
	
	public JButton getButton() {
		return btnImport;
	}
	
	public void populateTable(ArrayList<Person> dataArrayList)
	{
		
		for(Person line: dataArrayList)
			
		{
		
			//Person p = new Person();
			
			
				StringTokenizer tokenizer = new StringTokenizer(","); 
				
				
				String data1 = tokenizer.nextToken();
				String data2 = tokenizer.nextToken();
				String data3 = tokenizer.nextToken();
				String data4 = tokenizer.nextToken();
				String data5 = tokenizer.nextToken();
				String data6 = tokenizer.nextToken();
				String data7 = tokenizer.nextToken();
				Object[] row = { data1, data2, data3, data4, data5, data6,data7};
				
				
				DefaultTableModel model = (DefaultTableModel) this.table.getModel();
				
				model.addRow(row);
				
		
		}
}
}

