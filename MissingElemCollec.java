package Week3.Day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElemCollec {
public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);    // 1,2,3,4,6,7,8
		
		List<Integer> values = new ArrayList<Integer>();		
		for (Integer eachData : arr) {
			values.add(eachData);
		}	
			for (int i=0; i<values.size(); i++) {
				if (values.get(i) != i+1) {
					System.out.println("Missing Element is " + (i+1));
					break;
				}
			}
	}

}
