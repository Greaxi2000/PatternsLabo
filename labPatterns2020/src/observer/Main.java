package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.simptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		simptomFactory sf = new simptomFactory();
		
		Observable pacient=new Covid19Pacient("aitor", 35, sf);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI(pacient);
		PacientThermometerGUI thermo = new PacientThermometerGUI(pacient);
		SemaphorGUI semaphor = new SemaphorGUI(pacient);
		
		Observable pacient2=new Covid19Pacient("Jon", 20, sf);
	
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI(pacient2);
		PacientThermometerGUI thermo2 = new PacientThermometerGUI(pacient2);
		SemaphorGUI semaphor2 = new SemaphorGUI(pacient2);
		
		Observable pacient3=new Covid19Pacient("Asier", 80, sf);
		
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI(pacient3);
		PacientThermometerGUI thermo3 = new PacientThermometerGUI(pacient3);
		SemaphorGUI semaphor3 = new SemaphorGUI(pacient3);
	}


}