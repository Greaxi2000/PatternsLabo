package comparator;

import java.util.Comparator;

import domain.Symptom;

public class severityIndexComparator implements Comparator {

	
	public severityIndexComparator() {}
	
	@Override
	public int compare(Object o1, Object o2) {
		
		int index1 = ((Symptom)o1).getSeverityIndex();
		int index2 = ((Symptom)o2).getSeverityIndex();
//		Symptom-ak jaso behar ditu, eta ondoren horien izenaren arabera ordenatu
		
		if(index1>index2) {
			return 1;
		}
		else if(index1<index2) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

	
			
	
	
}
