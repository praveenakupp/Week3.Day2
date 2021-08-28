package Week3.Day2;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDupeCollections {
	public static void main(String[] args) {		
		int[] arr = {12,12,13,11,15,14,19,16,17,19,18,20,20};
		
		Set<Integer> num = new LinkedHashSet<Integer>();
			for (Integer eachData : arr) {
				if (!num.add(eachData)) {
					System.out.println(eachData);
				}
			}
	}
}

