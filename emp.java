package javalab;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class EmployeeFile 
{
	private static Color black;

	public static void main(String[] args) 
	{
		JFrame frameobj = new JFrame();  //creating frame
		frameobj.setSize(500, 500);  //declaring frame size
		
		GridLayout g1=new GridLayout(5,2);  // layout of the frame
		frameobj.setLayout(g1);				//layout is set to the frame created
		
		JPanel p1=new JPanel();  //creating panels
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		JPanel p8=new JPanel();
		JPanel p9=new JPanel();
		JPanel p10=new JPanel();
		
		JLabel l1=new JLabel("NAME");  //creating labels
		JLabel l2=new JLabel("ID");
		JLabel l3=new JLabel("DOJ");
		JLabel l4=new JLabel("DOB");
		
		JTextField f1=new JTextField();   //create object for text field
		JTextField f2=new JTextField();
		JTextField f3=new JTextField();
		JTextField f4=new JTextField();
		
		f1.setPreferredSize(new Dimension(200,30)); //size of text field
		f2.setPreferredSize(new Dimension(200,30));
		f3.setPreferredSize(new Dimension(200,30));
		f4.setPreferredSize(new Dimension(200,30));
		
		JButton b1=new JButton("SUBMIT");//create submit button
		JButton b2=new JButton("RESET");//create reset button
		
		b1.addActionListener(new ActionListener()//is notified whenever you click on the button or menu item
		{
			
			@Override
			public void actionPerformed(ActionEvent e)//is invoked automatically whenever you click on the registered component
			{
				
				File fileobj=new File("C:\\Users\\Amit\\Desktop\\javalab1\\File.txt");//file path
				try 
				{
					FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
					System.out.println("\n NAME : " +f1.getText()  +"\n"  +"ID : " +f2.getText()  +"\n"  +"DOJ : " +f3.getText()  +"\n"  +"DOB : "+f4.getText() +"\n");//prints details
					fw.write("\n NAME : " +f1.getText()  +"\n"  +"ID : " +f2.getText()  +"\n"  +"DOJ : " +f3.getText()  +"\n"  +"DOB : "+f4.getText() +"\n");//writes details in file
					fw.close();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}	
			}
		});
		
		b2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				f1.setText(" ");
				f2.setText(null);
				f3.setText(null);
				f4.setText(null);
			}
		});
		
		p1.add(l1);   //add labels to panels where labels=name,id,doj,dob
		p3.add(l2);
		p5.add(l3);
		p7.add(l4);
		
		p2.add(f1);   //add text field to panels where text field is user defined
		p4.add(f2);
		p6.add(f3);
		p8.add(f4);
		
		p9.add(b1);    //add buttons to panel
		p10.add(b2);
		
		//l1.setBorder(BorderFactory.createLineBorder(Color.black));
		l1.setBorder(BorderFactory.createLineBorder(black,10));
		l2.setBorder(BorderFactory.createLineBorder(black,10));
		l3.setBorder(BorderFactory.createLineBorder(black,10));
		l4.setBorder(BorderFactory.createLineBorder(black,10));
		
		frameobj.add(p1);  //add panels to frames
		frameobj.add(p2);
		frameobj.add(p3);
		frameobj.add(p4);
			
		frameobj.add(p5);
		frameobj.add(p6);
		frameobj.add(p7);
		frameobj.add(p8);
		
		frameobj.add(p9);
		frameobj.add(p10);
		
		frameobj.setVisible(true);//shows the window
	}
}
