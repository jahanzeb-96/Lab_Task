package countOps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class CountOps extends JFrame {		
		
	
	/*int count = 0;
	String result = "";

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel panel = (JPanel) frame.getContentPane();
	    panel.setLayout(null);

	    JLabel label = new JLabel("Enter Code Here...");
	    panel.add(label);
	    Dimension size = label.getPreferredSize();
	    label.setBounds(30, 50, size.width, size.height);
	    
	    JTextField input = new JTextField();
	    panel.add(input);
	    input.setBounds(280, 50, 350, 200);
	    
	    JButton exec = new JButton("Execute");
	    panel.add(exec);
	    exec.setBounds(548, 260, 80, 40);
	    
	    JLabel label1 = new JLabel("Output:");
	    panel.add(label1);
	    Dimension size1 = label1.getPreferredSize();
	    label1.setBounds(30, 350, size1.width, size1.height);
	    
	    JTextArea output = new JTextArea(100, 50);
	    panel.add(output);
		output.setBorder(BorderFactory.createLineBorder(Color.black));
		output.setFont(new Font("Times New Roman", Font.BOLD, 12));
		output.append(" Operator\t\tNo. of Occurences");
	    output.setBounds(280, 350, 350, 200);
	    output.setEditable(false);
	    

	    frame.setSize(800, 800);
	    frame.setVisible(true);
	    
	    exec.addActionListener(new ActionListener() {

	        

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
                String s = input.getText().toString();
				
				if(count == 0){
					output.append(result);
					count++;
				}
				else{
					output.setText(" Operator\t\tNo. of Occurences");
					output.append(result);
				}
			

	    
	    
		
		    int PCount = 0;
	        int NCount = 0;
	        int MCount = 0;
	        int DCount = 0;
	        int RCount = 0;
	        int ACount = 0;
	        int OCount = 0;
	        int GCount = 0;
	        int LCount = 0;
	        int ECount = 0;
	     
	        
	        //String s = "int a=5; float b=5.5;  int c=a+b;  if ((a&&b)<c) {  cout<<c }  else  { cout<< â€œinvalid answerâ€� }";
	        
	        
	        Pattern p1 = Pattern.compile("[+]");
	        Matcher m1 = p1.matcher(s);
	        
	        while(m1.find()){
	            
	            
	            PCount++;
	        }
	        System.out.println("Operators           Count");
	        System.out.println("+                    "+PCount);
	        
	        
	        
	        Pattern p2 = Pattern.compile("[-]");
	        Matcher m2 = p2.matcher(s);
	        
	        while(m2.find()){
	            
	            
	            NCount++;
	        }
	        System.out.println("-                    "+NCount);
	        
	        
	        Pattern p3 = Pattern.compile("[*]");
	        Matcher m3 = p3.matcher(s);
	        
	        while(m3.find()){
	            
	            
	            MCount++;
	        }
	        System.out.println("*                    "+MCount);
	        
	        
	        
	        Pattern p4 = Pattern.compile("[/]");
	        Matcher m4 = p4.matcher(s);
	        
	        while(m4.find()){
	            
	            
	            DCount++;
	        }
	        System.out.println("/                    "+DCount);
	        
	        
	        
	        Pattern p5 = Pattern.compile("[%]");
	        Matcher m5 = p5.matcher(s);
	        
	        while(m5.find()){
	            
	            
	            RCount++;
	        }
	        System.out.println("%                    "+RCount);
	        
	        
	         Pattern p6 = Pattern.compile("[&]{2}");
	        Matcher m6 = p6.matcher(s);
	        
	        while(m6.find()){
	            
	            
	            ACount++;
	        }
	        System.out.println("&&                   "+ACount);
	        
	         Pattern p7 = Pattern.compile("[|]{2}");
	        Matcher m7 = p7.matcher(s);
	        
	        while(m7.find()){
	            
	            
	            OCount++;
	        }
	        System.out.println("||                   "+OCount);
	        
	        
	         Pattern p8 = Pattern.compile("[>]");
	        Matcher m8 = p8.matcher(s);
	        
	        while(m8.find()){
	            
	            
	            GCount++;
	        }
	        System.out.println(">                    "+GCount);
	        
	         Pattern p9 = Pattern.compile("[<]");
	        Matcher m9 = p9.matcher(s);
	        
	        while(m9.find()){
	            
	            
	            LCount++;
	        }
	        System.out.println("<                    "+LCount);
	        
	       
	        Pattern p10 = Pattern.compile("[=]");
	        Matcher m10 = p10.matcher(s);
	        
	        while(m10.find()){
	            
	            
	            ECount++;
	        }
	        System.out.println("=                    "+ECount);
	        
	       
	            
	        this.result = "\n  +\t\t" + PCount + "\n  -\t\t" 
	                + NCount + "\n  *\t\t" + MCount + "\n  /\t\t"
	                + DCount + "\n  %\t\t" + RCount + "\n  && \t\t" 
	        		+ ACount + "\n  || \t\t" + OCount + "\n  >\t\t" 
	                + GCount + "\n  <\t\t" + LCount + "\n  =\t\t" + ECount;
	       
	        
	        
			}
			
		});
	        
	    }	            */
	    
	
	}


