import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.*;
import javax.swing.*;

public class FileReader {
String fileName="";
public FileReader(String x){
	fileName=x;
}

public void UserFrame(){
			
		String inside;	
		JFrame secondWindow = new JFrame();
		secondWindow.setSize(500,500);
		secondWindow.setVisible(true);
		
		Container content = secondWindow.getContentPane();
		content.setLayout(new FlowLayout());
		content.setBackground(Color.orange);
		JLabel Title = new JLabel("This is required for class "+fileName);
		content.add(Title);
		JTextArea QuestionViewer = new JTextArea(2,10);
		content.add(QuestionViewer);
		
		try{
			  DataInput f = new DataInputStream( new FileInputStream(fileName+".txt"));
			  String txt = f.readLine();
			  while(txt!=null){
				  inside=txt;
				  txt=f.readLine();				  
				  String s = QuestionViewer.getText();
				  QuestionViewer.setText(s+"\n"+inside);
			  }			 
		  }catch(Exception e){
			 QuestionViewer.setText("Your File with the question is not Found");
		  }
		
}
}