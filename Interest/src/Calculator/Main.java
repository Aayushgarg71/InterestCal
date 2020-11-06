package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main implements ActionListener{
	JRadioButton r1;
	JFrame jf;
	 void Jframe() {
		  jf = new JFrame();
			JLabel jl = new JLabel();
			//JTextField jt = new JTextField();
			//jt.setBounds(100,60, 100,20);
			jl.setText("Investment Type");
			jl.setBounds(50,50, 100,30); 
			jf.add(jl);
			 r1 =new JRadioButton("Fixed Deposit");    
			JRadioButton r2=new JRadioButton("Recurring Deposit");
			JRadioButton r3=new JRadioButton("Saving Account");
			r1.setBounds(200,50,170,30);    
			r2.setBounds(375,50,170,30); 
			r3.setBounds(555,50,170,30);
			ButtonGroup bg=new ButtonGroup();
			r1.addActionListener(this);
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			jf.add(r1);
			jf.add(r2);
			jf.add(r3);
			jf.setSize(800,300);
			jf.setLayout(null);
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m =new Main();
		m.Jframe();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(r1.isSelected()) {
			JLabel lb1=new JLabel("Amount");
			JTextField tf1= new JTextField();
			JLabel lb2=new JLabel("Age");
			JTextField tf2= new JTextField();
			JLabel lb3=new JLabel("Days");
			JTextField tf3= new JTextField();
			lb1.setBounds(50,100, 100, 20);
			tf1.setBounds(140,100, 100, 20);
			lb2.setBounds(50,125, 100, 20);
			tf2.setBounds(140,125, 100, 20);
			lb3.setBounds(50,150, 100, 20);
			tf3.setBounds(140,150, 100, 20);
			jf.add(lb1);
			jf.add(tf1);
			jf.add(lb2);
			jf.add(tf2);
			jf.add(lb3);
			jf.add(tf3);
			Double a=Double.parseDouble(tf1.getText());
			FDAccount fd= new FDAccount();
			fd.setAmount(a);
			int b=Integer.parseInt(tf2.getText());
			fd.setAgeOfACHolder(b);
			int c=Integer.parseInt(tf3.getText());
			fd.setNoOfDays(c);
			jf.repaint();
			jf.revalidate();
		}
	}

}
