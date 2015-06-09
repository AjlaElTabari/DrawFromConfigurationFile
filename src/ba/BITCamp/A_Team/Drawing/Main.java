package ba.BITCamp.A_Team.Drawing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		//Task4
		g.setColor(Color.LIGHT_GRAY);
    	g.fillRect(0, 0, 800, 800);

		g.setColor(Color.BLACK);
    	for (int i = 50; i < 100; i+=50) {
    		for (int j = 50; j < 100; j+=50) {
	    		if (i % 2 == 0 && j % 2 == 0) {
	    			g.drawRect(i, j, 50, 50);
	    			g.fillRect(i, j, 50, 50);
	    		}
	    		else if (i % 2 != 0 && j % 2 != 0) {
	    			g.drawRect(i, j, 50, 50);
	    			g.fillRect(i, j, 50, 50);
	    		}
    		}
    	}
    		

		
		//Task3
		/*g.setColor(Color.PINK);
    	g.fillRect(0, 0, 1200, 800);
    	g.setColor(Color.BLACK);
    	
    	g.drawOval(175, 90, 110, 150);
    	g.drawOval(240, 90, 110, 150);
    	
    	g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.PLAIN, 18));
		g.drawString(".1", 250, 150);
		g.drawString(".12", 215, 135);
		g.drawString(".3", 200, 175);
		g.drawString(".4", 260, 185);
		g.drawString(".11", 310, 160);
		g.drawString(".6", 225, 220);

		g.drawString("A", 185, 80);
		g.drawString("B", 315, 80);
		

		g.drawString("A = {12, 3, 6}", 100, 300);
		g.drawString("B = {11}", 100, 350);

		g.drawString("Presjek = {1, 4}", 270, 320);*/
		
		// Task2
		/*g.setColor(Color.PINK);
    	g.fillRect(0, 0, 1200, 800);
    	g.setColor(Color.BLACK);
    	
    	g.setColor(Color.WHITE);
    	g.fillOval(60, 90, 90, 150);
    	g.drawOval(60, 90, 90, 150);
    	g.setColor(Color.YELLOW);
    	g.drawOval(220, 90, 90, 150);
    	g.fillOval(220, 90, 90, 150);
    	
    	g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.PLAIN, 18));
		g.drawString(".1", 250, 150);
		g.drawString(".12", 235, 135);
		g.drawString(".3", 235, 175);
		g.drawString(".4", 270, 185);
		g.drawString(".11", 275, 145);
		g.drawString(".6", 250, 220);
		

		g.drawString(".7", 90, 150);
		g.drawString(".8", 75, 135);
		g.drawString(".9", 75, 175);
		g.drawString(".10", 100, 185);
		g.drawString(".5", 120, 155);
		g.drawString(".2", 110, 220);

		g.drawString("A", 70, 80);
		g.drawLine(70, 85, 85, 95);
		g.drawString("B", 230, 80);
		g.drawLine(230, 85, 240, 100);
		

		g.drawString("A = {1, 12, 3, 4, 11, 6}", 100, 300);
		g.drawString("B = {7, 8, 9, 10, 5, 2}", 100, 350);*/
		
		
		// Task1
		/*g.setColor(Color.BLACK);
    	g.fillRect(0, 0, 1200, 800);
    	g.setColor(Color.WHITE);
    	
    	g.drawOval(130, 70, 70, 150);
    	g.drawLine(330, 70, 330, 220);
    	g.drawLine(330, 70, 280, 180);*/
		
		/*g.setColor(Color.ORANGE);
		g.drawOval(100, 100, 400, 100);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("BitCamp <3", 250, 150);
		
		g.setColor(Color.BLUE);
		g.drawLine(100, 200, 500, 200);*/
		
		// *******************
		w.setImage(img);
	}
}
