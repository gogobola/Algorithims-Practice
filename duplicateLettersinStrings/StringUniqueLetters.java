package duplicateLettersinStrings;
import java.util.Arrays;

public class StringUniqueLetters {
String str;
char[] charArray;
// n + nlogn + n, I think run time will be nlogn
public StringUniqueLetters(String str){
	this.str = str;
}

public boolean isUnique() {
	//Runtime for conversion to charArray is n
	charArray = this.str.toCharArray();
	//Runtime for built in sort is n log n
	Arrays.sort(charArray);
	
	boolean result = true;

	for(int i = 0; i < charArray.length - 1;i++) {
		//Once Sorted any duplicates will be next to each other so check if so, not unique
		
		if(charArray[i] == charArray[i+1]){
			
		result = false;
		
				}
			
	}
	
	return result;
	
}

public static void main(String[] args){
	
	StringUniqueLetters test = new StringUniqueLetters("azqwxcerfvbgtyhnjmkiust");
	StringUniqueLetters test2 = new StringUniqueLetters("tesnm");

	if(test.isUnique()){
		
		System.out.println("This String is Unique");
		
	}
	else {
		
		System.out.println("This String is not Unique");
		
	}

	if(test2.isUnique()){
		
		System.out.println("This String is Unique");
		
	}
	else {
		
		System.out.println("This String is not Unique");
		
	}

}
	
}
