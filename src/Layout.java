import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout extends JFrame {
	private JLabel title, questions, source;
	public JButton Class1, Class2, Class3, Class4,Class5, exitB, Reset;
	private JTextField Directors, Clerks, Year, Days, Max;
	private JLabel directors, clerks, year, days, max;
	private JTextField ClerkVacation, DirectorVacation, ClerkSalary, DirectorSalary,SalaryIncrease;
	private JLabel clerkVacation, directorVacation, clerkSalary, directorSalary, salaryIncrease;
	public JButton Calculate;
	private JLabel announce1, announce2, announce3;
	
	public Layout(){		
	setTitle("Assignment # 5");
	
	title	 = new JLabel("Rubesh pvt. ltd");
	Font currentFont = title.getFont();
    title.setFont(new Font(currentFont.getFontName(), currentFont.getStyle(), 24));
   
	questions=new JLabel("  Questions");
	source	 = new JLabel("Source codes");
	announce1 = new JLabel("Note :- These values in the input  field are set ");
	announce2 = new JLabel("according to the question requirements. You");
	announce3 = new JLabel("can change them anytime to test your values");

	Directors = new JTextField(10);
	Directors.setText("3");
	Directors.setBackground(Color.green);
	Clerks = new JTextField(10);
	Clerks.setText("17");
	Clerks.setBackground(Color.green);
	Year = new JTextField(10);
	Year.setText("40");
	Year.setBackground(Color.green);
	Days = new JTextField(10);
	Days.setText("100");;
	Days.setBackground(Color.green);
	Max = new JTextField(10);
	Max.setText("100");
	Max.setBackground(Color.green);
	
	directors = new JLabel("Directors");
	clerks	= new JLabel("Clerks");
	year = new JLabel("Year");
	days = new JLabel("Days");
	max = new JLabel("Max");
	
	ClerkVacation  = new JTextField(10);
	ClerkVacation.setText("5");
	DirectorVacation  = new JTextField(10);
	DirectorVacation.setText("10");
	ClerkSalary = new JTextField(10);
	ClerkSalary.setText("50");
	DirectorSalary  = new JTextField(10);
	DirectorSalary.setText("100");
	SalaryIncrease = new JTextField(10);
	SalaryIncrease.setText("0.15");
	
	clerkVacation = new JLabel("Clerk Vacation");
	directorVacation = new JLabel("Director Vacation");
	clerkSalary = new JLabel("Clerk Salary");
	directorSalary = new JLabel("Director Salary");
	salaryIncrease = new JLabel("Salary Increase");
		

	JButton Class1 = new JButton("Class 1");
	Class1ButtonHandler class1Handler = new Class1ButtonHandler();
	Class1.addActionListener(class1Handler);
	
	JButton Class2 = new JButton("Class 2");
	Class2ButtonHandler class2Handler = new Class2ButtonHandler();
	Class2.addActionListener(class2Handler);
	
	JButton Class3 = new JButton("Class 3");
	Class3ButtonHandler class3Handler = new Class3ButtonHandler();
	Class3.addActionListener(class3Handler);
	
	JButton Class4 = new JButton("Class 4");
	Class4ButtonHandler class4Handler = new Class4ButtonHandler();
	Class4.addActionListener(class4Handler);
	
	JButton Class5 = new JButton("Class 5");
	Class5ButtonHandler class5Handler = new Class5ButtonHandler();
	Class5.addActionListener(class5Handler);
	
	exitB = new JButton("Exit");
	ExitButtonHandler exitHandler = new ExitButtonHandler();
	exitB.addActionListener(exitHandler);
	
	JButton Reset = new JButton("Reset");
	ResetButtonHandler ResetHandler = new ResetButtonHandler();
	Reset.addActionListener(ResetHandler);
	
	JButton Calculate = new JButton("Calculate");
	CalculateButtonHandler CalculateHandler = new CalculateButtonHandler();
	Calculate.addActionListener(CalculateHandler);
		
	Container pane = getContentPane();
	pane.setLayout(null);
	pane.setBackground(Color.white);
	
	pane.add(title);
	pane.add(questions);
	pane.add(source);
	pane.add(announce1);
	pane.add(announce2);
	pane.add(announce3);
	
	pane.add(Directors);
	pane.add(Clerks);
	pane.add(Year);
	pane.add(Days);
	pane.add(Max);
	
	pane.add(directors);
	pane.add(clerks);
	pane.add(year);
	pane.add(days);
	pane.add(max);
	
	pane.add(ClerkVacation);
	pane.add(DirectorVacation);
	pane.add(ClerkSalary);
	pane.add(DirectorSalary);
	pane.add(SalaryIncrease);
	
	pane.add(clerkVacation);
	pane.add(directorVacation);
	pane.add(clerkSalary);
	pane.add(directorSalary);
	pane.add(salaryIncrease);
	
	pane.add(Class1);
	pane.add(Class2);
	pane.add(Class3);
	pane.add(Class4);
	pane.add(Class5);
	
	pane.add(exitB);
	pane.add(Reset);
	pane.add(Calculate);
	
	Insets position = pane.getInsets();	
	Dimension size = title.getPreferredSize();
	
	title.setBounds(200+position.left, 10+position.top, size.width, size.height);
	size=questions.getPreferredSize();
	questions.setBounds(500+position.left, 100+position.top, size.width, size.height);
	size=announce1.getPreferredSize();
	announce1.setBounds(20+position.left, 50+position.top, size.width, size.height);
	size=announce2.getPreferredSize();
	announce2.setBounds(20+position.left, 65+position.top, size.width, size.height);
	size=announce3.getPreferredSize();
	announce3.setBounds(20+position.left, 80+position.top, size.width, size.height);
	
	/*JLabels for the JTextFields*/
	size=directors.getPreferredSize();
	directors.setBounds(20+position.right, 115+position.top, size.width, size.height);
	size=clerks.getPreferredSize();
	clerks.setBounds(20+position.right, 165+position.top, size.width, size.height);
	size=year.getPreferredSize();
	year.setBounds(20+position.right, 215+position.top, size.width, size.height);
	size=days.getPreferredSize();
	days.setBounds(20+position.right, 265+position.top, size.width, size.height);
	size=max.getPreferredSize();
	max.setBounds(20+position.right, 315+position.top, size.width, size.height);
	
	/*JLabels for the JTextFields*/
	size=directorVacation.getPreferredSize();
	directorVacation.setBounds(170+position.right, 115+position.top, size.width, size.height);
	size=clerkVacation.getPreferredSize();
	clerkVacation.setBounds(170+position.right, 165+position.top, size.width, size.height);
	size=directorSalary.getPreferredSize();
	directorSalary.setBounds(170+position.right, 215+position.top, size.width, size.height);
	size=clerkSalary.getPreferredSize();
	clerkSalary.setBounds(170+position.right, 265+position.top, size.width, size.height);
	size=salaryIncrease.getPreferredSize();
	salaryIncrease.setBounds(170+position.right, 315+position.top, size.width, size.height);

	/*JTextFields where The user can change values*/
	size=Directors.getPreferredSize();
	Directors.setBounds(20+position.right, 130+position.top, size.width, size.height);
	size=Clerks.getPreferredSize();
	Clerks.setBounds(20+position.right, 180+position.top, size.width, size.height);
	size=Year.getPreferredSize();
	Year.setBounds(20+position.right, 230+position.top, size.width, size.height);
	size=Days.getPreferredSize();
	Days.setBounds(20+position.right, 280+position.top, size.width, size.height);
	size=Max.getPreferredSize();
	Max.setBounds(20+position.right, 330+position.top, size.width, size.height);
	
	/*JTextFields so that user can change the values*/
	size=DirectorVacation.getPreferredSize();
	DirectorVacation.setBounds(170+position.right, 130+position.top, size.width, size.height);
	size=ClerkVacation.getPreferredSize();
	ClerkVacation.setBounds(170+position.right, 180+position.top, size.width, size.height);
	size=DirectorSalary.getPreferredSize();
	DirectorSalary.setBounds(170+position.right, 230+position.top, size.width, size.height);
	size=ClerkSalary.getPreferredSize();
	ClerkSalary.setBounds(170+position.right, 280+position.top, size.width, size.height);
	size=SalaryIncrease.getPreferredSize();
	SalaryIncrease.setBounds(170+position.right, 330+position.top, size.width, size.height);
	
	/*The Buttons to view the Questions*/
	size=Class1.getPreferredSize();
	Class1.setBounds(500+position.right, 115+position.top, size.width, size.height);
	size=Class2.getPreferredSize();
	Class2.setBounds(500+position.right, 145+position.top, size.width, size.height);
	size=Class3.getPreferredSize();
	Class3.setBounds(500+position.right, 175+position.top, size.width, size.height);
	size=Class4.getPreferredSize();
	Class4.setBounds(500+position.right, 205+position.top, size.width, size.height);
	size=Class5.getPreferredSize();
	Class5.setBounds(500+position.right, 235+position.top, size.width, size.height);
	
	/* The Action Buttons*/
	size=exitB.getPreferredSize();
	exitB.setBounds(520+position.right, 320+position.top, size.width, size.height);	
	size=Reset.getPreferredSize();
	Reset.setBounds(450+position.right,320+position.top, size.width, size.height);
	size=Calculate.getPreferredSize();
	Calculate.setBounds(360+position.right,320+position.top, size.width, size.height);
		
	setSize(600,400);
	setVisible(true);	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	/*end of that class*/
	
	private class Class1ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String x="one";
			FileReader Read = new FileReader(x);
			Read.UserFrame();
		}
	}
	private class Class2ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String x="two";
			FileReader Read = new FileReader(x);
			Read.UserFrame();
		}
	}	
	private class Class3ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String x="three";
			FileReader Read = new FileReader(x);
			Read.UserFrame();
		}
	}	
	private class Class4ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String x="four";
			FileReader Read = new FileReader(x);
			Read.UserFrame();
		}
	}	
	private class Class5ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String x="five";
			FileReader Read = new FileReader(x);
			Read.UserFrame();
		}
	}
	
	private class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(1000);
		}
	}
	
	private class ResetButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Directors.setText("3");
			Clerks.setText("17");
			Year.setText("40");
			Days.setText("100");
			Max.setText("100");
			
			 ClerkVacation.setText("5");
			 DirectorVacation.setText("10");
			 ClerkSalary.setText("50");
			 DirectorSalary.setText("100");
			 SalaryIncrease.setText("0.15");
		}
	}
	
	private class CalculateButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int ReadDirectors, ReadClerks, ReadYear, ReadDays, ReadMax;
			int ReadClerkVacation, ReadDirectorVacation, ReadClerkSalary, ReadDirectorSalary;
			double ReadSalaryIncrease;
			
			 ReadDirectors=Integer.parseInt(Directors.getText());
			 ReadClerks=Integer.parseInt(Clerks.getText());
			 ReadYear=Integer.parseInt(Year.getText());
			 ReadDays=Integer.parseInt(Days.getText());
			 ReadMax=Integer.parseInt(Max.getText());
			 
			 ReadClerkVacation=Integer.parseInt(ClerkVacation.getText());
			 ReadDirectorVacation=Integer.parseInt(DirectorVacation.getText()); 
			 ReadClerkSalary=Integer.parseInt(ClerkSalary.getText());
			 ReadDirectorSalary=Integer.parseInt(DirectorSalary.getText());
			 ReadSalaryIncrease=Double.parseDouble(SalaryIncrease.getText());
			 
			CompanyTest tester = new CompanyTest( ReadDirectors, ReadClerks, ReadYear, ReadDays, ReadMax, ReadClerkVacation, ReadDirectorVacation, ReadClerkSalary, ReadDirectorSalary, ReadSalaryIncrease);			
			tester.testing();
			
			
		}
	}	
}//The whole class ends
