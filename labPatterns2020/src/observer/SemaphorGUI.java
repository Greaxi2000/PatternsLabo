package observer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;
import observer.PacientThermometerGUI.TemperatureCanvas;


public class SemaphorGUI extends JFrame implements Observer {

	private int current;
	
	public void set(int level) { current = level; }	
	public int get(){return current;}
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}
	
	public void paint() {
		Color c;
		 if (current<5) c=Color.green;
	     else if (current<10) c=Color.yellow;
	      else c=Color.red;
		 getContentPane().setBackground(c);
		 repaint();
	}

	

	@Override
	public void update(Observable o, Object arg) {
		Covid19Pacient p=(Covid19Pacient)o;
		// Obtain the current covidImpact to paint
		int impact = (int) p.covidImpact();
		// Semaphore gauge update
		set(impact);
		paint();
	}
}     

