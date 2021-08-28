package Week3.Day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sortcollec {
	public static void main(String[] args) {
		String[] arr= {"Aspire Systems", "CTS", "Wipro", "HCL"};
		
	 //	Using Set
		Set<String> strList1 = new TreeSet<String>();    //ASCII order
		for (String eachData : arr) {
			strList1.add(eachData);			
		}
		System.out.println("Sorted using TreeSet:" + strList1);
		
	 //Converts the Array to a List			
		List<String> strList = new ArrayList<String>(Arrays.asList(arr));
		
	 //	Sort the array
		Collections.sort(strList);	
			System.out.println("Sorted using List: " + strList);
					
	 // Iterate it in the reverse order
		Collections.reverse(strList);
			System.out.println("Reverse List: " + strList);
	}
}

