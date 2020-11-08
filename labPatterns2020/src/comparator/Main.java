package comparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import adapter.Covid19PacientInvertedIterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import domain.simptomFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		simptomFactory sf = new simptomFactory();
		
		Covid19Pacient p = new Covid19Pacient("Asier", 20, sf);
		
		Symptom s1 = new Symptom("sukarra", 2, 5);
		Symptom s2 = new Symptom("eztula", 1, 3);
		Symptom s3 = new Symptom("usaimen galera", 1, 3);
		Symptom s4 = new Symptom("dastamenaren galera", 1, 2);
		Symptom s5 = new Symptom("nauseak", 3, 1);
		
		p.addSymptom(s1, 1);
		p.addSymptom(s2, 1);
		p.addSymptom(s3, 1);
		p.addSymptom(s4, 1);
		p.addSymptom(s5, 1);
		
		Covid19PacientInvertedIterator pii = new Covid19PacientInvertedIterator(new ArrayList<Symptom>(p.getSymptoms()));
		
		symptomNameComparator snc = new symptomNameComparator();
		severityIndexComparator sic = new severityIndexComparator();
		
		Iterator i = Sorting.sortedIterator(pii, snc);
		Iterator i2 = Sorting.sortedIterator(pii, sic);
		
		System.out.println("######Izenaren arabera ordenatuta######");
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		System.out.println("######Severity indexaren arabera ordenatuta######");
		while(i2.hasNext())
			System.out.println(i2.next());

	
	
	
		
	}

}
