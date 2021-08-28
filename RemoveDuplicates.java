package Week3.Day2;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	String text = "PayPal India";
	String text1 = text.toLowerCase();
 	String text2 = text1.replaceAll("\\s","");
	
	//Convert it into a character array
 	char[] charArray = text2.toCharArray();

	//Declare a Set as charSet for Character
 	Set<Character> charSet = new LinkedHashSet<Character>();

	//Declare a Set as dupCharSet for duplicate Character
 	Set<Character> dupCharSet = new LinkedHashSet<Character>();
 	{

	//Iterate character array and add it into charSet
 	for (char c : charArray) {
		boolean unique = charSet.add(c);
		
	//If the character is already in the charSet then, add it to the dupCharSet
		if (unique == false) {
			dupCharSet.add(c);
		}
 	}

	System.out.println("Duplicate Characters: " + dupCharSet);
	System.out.println("Character Set after removing duplicates: " + charSet);
}

}
