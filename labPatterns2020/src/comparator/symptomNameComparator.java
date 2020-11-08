package comparator;

import java.util.Comparator;
import domain.Symptom;

public class symptomNameComparator implements Comparator {

	public symptomNameComparator() {}
	
	@Override
	public int compare(Object o1, Object o2) {
		
		String izena1 = ((Symptom)o1).getName();
		String izena2 = ((Symptom)o2).getName();
		
		if(izena1.compareTo(izena2)>0) {
			return 1;
		}
		else if(izena1.compareTo(izena2)<0) {
			return -1;
		}
		else {
			return 0;
		}	
	}

}
