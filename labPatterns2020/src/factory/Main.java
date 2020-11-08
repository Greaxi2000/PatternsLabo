package factory;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.Medicament;
import domain.simptomFactory;
import observer.PacientSymptomGUI;

public class Main {

	public static void main(String[] args) {
	
	
	
		simptomFactory sf = new simptomFactory();
	
	Medicament m=new Medicament("Ibuprofeno", sf);
	MedicalGUI mgui=new MedicalGUI(m);
	
	Observable pacient=new Covid19Pacient("aitor", 35, sf);
	PacientSymptomGUI frame = new PacientSymptomGUI(pacient);
	
	} 

}
