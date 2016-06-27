
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
 

public class tab extends JFrame {

  public tab(){

    this.setTitle("Demineur");

    this.setSize(500, 500);

    this.setLocationRelativeTo(null);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel pan = new JPanel();

    //Définition de sa couleur de fond

    pan.setBackground(Color.ORANGE);        

    //On prévient notre JFrame que notre JPanel sera son content pane

    this.setContentPane(pan);               

    
    GridLayout G1 = new GridLayout(5, 5);
	G1.setVgap(0);
	this.setLayout(G1);
	
	JButton b1 = new JButton("1");	
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");	
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b10 = new JButton("10");
	JButton b11 = new JButton("11");	
	JButton b12 = new JButton("12");
	JButton b13 = new JButton("13");
	JButton b14 = new JButton("14");
	JButton b15 = new JButton("15");	
	JButton b16 = new JButton("16");
	JButton b17 = new JButton("17");
	JButton b18 = new JButton("18");
	JButton b19 = new JButton("19");
	JButton b20 = new JButton("20");
	JButton b21 = new JButton("21");
	JButton b22 = new JButton("22");
	JButton b23 = new JButton("23");
	JButton b24 = new JButton("24");
	JButton b25 = new JButton("25");
	
	this.getContentPane().add(b1);
	this.getContentPane().add(b2);
	this.getContentPane().add(b3);
	this.getContentPane().add(b4);
	this.getContentPane().add(b5);
	this.getContentPane().add(b6);
	this.getContentPane().add(b7);
	this.getContentPane().add(b8);
	this.getContentPane().add(b9);
	this.getContentPane().add(b10);
	this.getContentPane().add(b11);
	this.getContentPane().add(b12);
	this.getContentPane().add(b13);
	this.getContentPane().add(b14);
	this.getContentPane().add(b15);
	this.getContentPane().add(b16);
	this.getContentPane().add(b17);
	this.getContentPane().add(b18);
	this.getContentPane().add(b19);
	this.getContentPane().add(b20);
	this.getContentPane().add(b21);
	this.getContentPane().add(b22);
	this.getContentPane().add(b23);
	this.getContentPane().add(b24);
	this.getContentPane().add(b25);
	
	
	this.setVisible(true);
  }

}

