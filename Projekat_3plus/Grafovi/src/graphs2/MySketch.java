package graphs2;

import processing.core.PApplet;

/**
 * 
 * zahteva Processing core.jar datoteku
 * 
 * Demonstracija implementacije Processing sketchbook-a unutar JAVE.
 * (nije povezano sa temom zadatka)
 *
 */

public class MySketch extends PApplet{
	
	int r1, r2; 
	public void settings(){
		size(500, 500);	
		//background(255);
	}
	
	public void draw(){
		r1 = (int) Math.ceil(Math.random()*50);
		r2 = (int) Math.ceil(Math.random()*50);
		ellipse(mouseX, mouseY, r1, r2);
		fill(250, 150, 200, 54);
	}
	
	public void mousePressed(){
		background((int) Math.ceil(Math.random()*154 + 50));
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		MySketch mySketch = new MySketch();
		PApplet.runSketch(processingArgs, mySketch);
	}
}
