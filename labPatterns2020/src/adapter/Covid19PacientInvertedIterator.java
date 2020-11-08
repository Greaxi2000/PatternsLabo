package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator{

	List<Symptom> symptoms;
	int position=0;
	
	public Covid19PacientInvertedIterator(List<Symptom> s) {
		this.symptoms = s;
	}
	
	@Override
	public Object previous() {
		//Oraingo balioa bueltatu eta aurreko posiziora itzuli
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}
	@Override
	public boolean hasPrevious() {
		//Posizioa 0 bada ez du aurrekorik izango
		return position>=0;
	}
	@Override
	public void goLast() {
		//Posizioa azkenekora aldatu
		position = symptoms.size()-1;
		
	}

}
