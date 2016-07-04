
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
 

public class tab extends JFrame {

	public void facile(){
		
		int  h=10, w=20;
		JFrame frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setLayout(new GridLayout(h, w));
		
		JButton[][] bouton = new JButton[h][w];
		
		for (int i = 0; i < h; i++)
		for (int j = 0; j < w; j++) 
		{	
			frame.add(bouton[i][j] = new JButton());
		}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    /*this.setTitle("Demineur");

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
		
		
		this.setVisible(true);*/
	}
	
	public void normal(){

		int  h=20, w=20;
		JFrame frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setLayout(new GridLayout(h, w));
		
		JButton[][] bouton = new JButton[h][w];
		
		for (int i = 0; i < h; i++)
		for (int j = 0; j < w; j++) 
		{	
			frame.add(bouton[i][j] = new JButton());
		}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    /*this.setTitle("Demineur");

	    this.setSize(700, 700);

	    this.setLocationRelativeTo(null);

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel pan = new JPanel();

	    //Définition de sa couleur de fond

	    pan.setBackground(Color.BLUE);        

	    //On prévient notre JFrame que notre JPanel sera son content pane

	    this.setContentPane(pan);               

	    
	    GridLayout G1 = new GridLayout(5, 10);
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
		JButton b26 = new JButton("26");	
		JButton b27 = new JButton("27");
		JButton b28 = new JButton("28");
		JButton b29 = new JButton("29");
		JButton b30 = new JButton("30");	
		JButton b31 = new JButton("31");
		JButton b32 = new JButton("32");
		JButton b33 = new JButton("33");
		JButton b34 = new JButton("34");
		JButton b35 = new JButton("35");
		JButton b36 = new JButton("36");	
		JButton b37 = new JButton("37");
		JButton b38 = new JButton("38");
		JButton b39 = new JButton("39");
		JButton b40 = new JButton("40");	
		JButton b41 = new JButton("41");
		JButton b42 = new JButton("42");
		JButton b43 = new JButton("43");
		JButton b44 = new JButton("44");
		JButton b45 = new JButton("45");
		JButton b46 = new JButton("46");
		JButton b47 = new JButton("47");
		JButton b48 = new JButton("48");
		JButton b49 = new JButton("49");
		JButton b50 = new JButton("50");
		
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
		this.getContentPane().add(b26);
		this.getContentPane().add(b27);
		this.getContentPane().add(b28);
		this.getContentPane().add(b29);
		this.getContentPane().add(b30);
		this.getContentPane().add(b31);
		this.getContentPane().add(b32);
		this.getContentPane().add(b33);
		this.getContentPane().add(b34);
		this.getContentPane().add(b35);
		this.getContentPane().add(b36);
		this.getContentPane().add(b37);
		this.getContentPane().add(b38);
		this.getContentPane().add(b39);
		this.getContentPane().add(b40);
		this.getContentPane().add(b41);
		this.getContentPane().add(b42);
		this.getContentPane().add(b43);
		this.getContentPane().add(b44);
		this.getContentPane().add(b45);
		this.getContentPane().add(b46);
		this.getContentPane().add(b47);
		this.getContentPane().add(b48);
		this.getContentPane().add(b49);
		this.getContentPane().add(b50);
		
		
		this.setVisible(true); */
	  }
	
	public void difficile()
	{
		int  h=30, w=20;
		JFrame frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setLayout(new GridLayout(h, w));
		
		JButton[][] bouton = new JButton[h][w];
		
		for (int i = 0; i < h; i++)
		for (int j = 0; j < w; j++) 
		{	
			frame.add(bouton[i][j] = new JButton());
		}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

