package mvca;

//importing Java AWT class  
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/* ono što vidi korisnik */

//extending Frame class to our class AWTExample1  
public class Korisnik extends Frame {    

	private static final long serialVersionUID = 1L;
	private DecimalFormat df = new DecimalFormat("###0.0000");

	// initializing using constructor  
	Korisnik() {  
		frame();	   
	}
	
	public void frame() {
		// okvir
		Frame okvir = new Frame("Jednostavan digitron");
		
		// elementi okvira
		// kreiranje 
		// dugmad
		Button znak = new Button("+"); 
		Button jednako = new Button("="); 
		Button stop = new Button("close");
		// text box (field)
		TextField x = new TextField();
		TextField y = new TextField();
		TextField z = new TextField();
		// osobine elemenata  (ovde: položaj)
		x.setBounds(30,100,80,30);
		znak.setBounds(130,100,80,30);  
		y.setBounds(250, 100, 80, 30);
	   	jednako.setBounds(350,100,80,30);  
	   	z.setBounds(430,100,80,30); 
	   	stop.setBounds(430,250,80,30);
	   	
	   	// pridruživanje događaja i obrada istih
	   	// zatvaranje prozora (x dugme)
	   	okvir.addWindowListener(new WindowListener() { 	    	
	    	public void windowClosing (WindowEvent e) {    
	           okvir.dispose();
	        }

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	    });
	   	// zatvaranje na dugme
	   	stop.addActionListener(new ActionListener() {	    	
	    	public void actionPerformed (ActionEvent e) {    
	           okvir.dispose();
	        }    
	    });  
	   	// izbor znaka
	   	znak.addActionListener(new ActionListener() { 
	    	String[] simboli = {"-","*","/","+"};
	    	int i = 0;
	    	public void actionPerformed (ActionEvent e) {    
	            znak.setLabel(simboli[i++]);
	            if(i >= simboli.length)
	            	i = 0;
	        }    
	    });  
	   	// računanje
	   	jednako.addActionListener(new ActionListener() { 
	    	String simbol;
	    	Double rezultat;
	    	public void actionPerformed (ActionEvent e) {   
	    		simbol = znak.getLabel();
	    		rezultat = 0.0;
	            switch(simbol) {
	            case "+":
	            	rezultat = Double.parseDouble(x.getText()) + Double.parseDouble(y.getText());
	            	break;
	            case "-":
	            	rezultat = Double.parseDouble(x.getText()) - Double.parseDouble(y.getText());
	            	break;
	            case "*":
	            	rezultat = Double.parseDouble(x.getText()) * Double.parseDouble(y.getText());
	            	break;
	            case "/":
	            	rezultat = Double.parseDouble(x.getText()) / Double.parseDouble(y.getText());
	            	break;
	            default:
	            	rezultat = 0.0;
	            }
	            z.setText(df.format(rezultat));
	        }    
	    });  
	   	   	
	   	// "vezivanje" elemenata za okvir
	    // adding button and textbox into frame    
		okvir.add(x);
	    okvir.add(y);
	    okvir.add(z);
	    okvir.add(znak);  
	    okvir.add(jednako);
		okvir.add(stop);
		
		// osobine okvira
		okvir.setSize(600,400);    
	    okvir.setLayout(null);    
	    okvir.setVisible(true);  
	}
	
}