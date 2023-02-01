package calculator;
import java.util.*;
import java.awt.*;
public class MyCalculator implements ActionListener{

	JFrame f;
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, 
	badd, bsub, bdiv, bmul, bdec, beq, bdel, bclr;
	
	static double a=0, b=0, res=0;
	static int operator=0;
	
	
	
	public MyCalculator() {
		f=new JFrame("My Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(20, 20, 300, 350);
		f.setResizable(true);
		
		Font fo = new Font("Arial", Font.BOLD, 20);
		
		t = new JTextField();
		t.setFont(fo);
		t.setBackground(Color.CYAN);
		t.setForeground(Color.BLACK);
		t.setBounds(40, 40, 200, 50);
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		
		badd = new JButton("+");
		bsub = new JButton("-");
		bdiv = new JButton("/");
		bmul = new JButton("x");
		bdec = new JButton(".");
		beq = new JButton("=");
		bdel = new JButton("DEL");
		bclr = new JButton("CLR");
		
		b7.setBounds(40, 100, 50, 40);
		b8.setBounds(90, 100, 50, 40);
		b9.setBounds(140, 100, 50, 40);
		bdiv.setBounds(190, 100, 50, 40);
		
		b4.setBounds(40, 140, 50, 40);
		b5.setBounds(90, 140, 50, 40);
		b6.setBounds(140, 140, 50, 40);
		bmul.setBounds(190, 140, 50, 40);
		
		b1.setBounds(40, 180, 50, 40);
		b2.setBounds(90, 180, 50, 40);
		b3.setBounds(140, 180, 50, 40);
		bsub.setBounds(190, 180, 50, 40);
		
		b0.setBounds(40, 220, 50, 40);
		bdec.setBounds(90, 220, 50, 40);
		badd.setBounds(140, 220, 50, 40);
		beq.setBounds(190, 220, 50, 40);
		
		bdel.setBounds(40, 260, 100, 40);
		bclr.setBounds(140, 260, 100, 40);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bdec.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
		
		f.add(t);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(badd);
		f.add(bsub);
		f.add(bdiv);
		f.add(bmul);
		f.add(bdec);
		f.add(beq);
		f.add(bdel);
		f.add(bclr);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCalculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==b2) {
			t.setText(t.getText().concat("2"));
		}
		if(e.getSource()==b3) {
			t.setText(t.getText().concat("3"));
		}
		if(e.getSource()==b4) {
			t.setText(t.getText().concat("4"));
		}
		if(e.getSource()==b5) {
			t.setText(t.getText().concat("5"));
		}
		if(e.getSource()==b6) {
			t.setText(t.getText().concat("6"));
		}
		if(e.getSource()==b7) {
			t.setText(t.getText().concat("7"));
		}
		if(e.getSource()==b8) {
			t.setText(t.getText().concat("8"));
		}
		if(e.getSource()==b9) {
			t.setText(t.getText().concat("9"));
		}
		if(e.getSource()==b0) {
			t.setText(t.getText().concat("0"));
		}
		if(e.getSource()==bdec) {
			t.setText(t.getText().concat("."));
			// add logic for no two consecutive decimals
		}
		
		if(e.getSource()==bclr) {
			t.setText("");
		}
		if(e.getSource()==bdel) {
			String str = t.getText();
			t.setText(" ");
			for(int i=0; i<str.length()-1; i++) {
				t.setText((t.getText() + str.charAt(i)));
			}
		}
		
		if(e.getSource()==badd) {
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==bsub) {
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==bmul) {
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==bmul) {
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==bmul) {
			t.setText(t.getText().concat("1"));
		}
	}

}
