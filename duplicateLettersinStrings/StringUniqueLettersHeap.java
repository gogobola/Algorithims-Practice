package duplicateLettersinStrings;

import java.util.HashSet;

public class StringUniqueLettersHeap {

	String str;
	HashSet<Character> set = new HashSet<Character>();

	public StringUniqueLettersHeap(String str) {
	this.str = str;
	}

	public boolean isUnique() {
	boolean result = true;

	for(int i = 0;i <= str.length() - 1 ; i++) {
		if(!set.add(str.charAt(i))) {
		result = false;
		}
	}
	return result;
	}
	

	public static void main(String[] args) {
	StringUniqueLettersHeap str = new StringUniqueLettersHeap("yoldawbwy");
	StringUniqueLettersHeap str2 = new StringUniqueLettersHeap("abcdefghijklmnopqrstuvwxyz");

	if(str.isUnique()) {
		System.out.println("This String is Unique");
	}

	else {
		System.out.println("This String is not Unique");
	}
	
	if(str2.isUnique()) {
		System.out.println("This String is Unique");
	}

	else {
		System.out.println("This String is not Unique");
	}

	}
}
