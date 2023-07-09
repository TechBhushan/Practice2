package com.stringandarrays;
//Swap first character of each word with last character
public class SwapFirstCharacterWithLast {

	public static void main(String[] args) {

		String[] names = { "Rahul", "Prashant", "Vivek", "Niket" };
		StringBuilder result=new StringBuilder();
		
		for(String name:names) {
			char[] chars=name.toCharArray();
			
			char temp=chars[0];
			chars[0]=chars[chars.length-1];
			chars[chars.length-1]=temp;
			
			result.append(new String(chars)).append(",");
		}
		
		System.out.println("Result: "+result.toString());

	}
}

//public class SwapFirstAndLastCharacters - declares a public class called SwapFirstAndLastCharacters.
//public static void main(String[] args) - declares a public static method called main, which is the entry point of the program and takes an array of strings as input.
//String[] names = {"Rahul", "Prashant", "Vivek", "Niket"} - initializes an array of strings called names with the given names.
//StringBuilder result = new StringBuilder() - declares a StringBuilder object called result to store the swapped names.
//for (String name : names) - loops through each name in the names array.
//char[] chars = name.toCharArray() - converts the current name into a character array.
//char temp = chars[0] - stores the first character of the current name in a temporary variable called temp.
//chars[0] = chars[chars.length - 1] - swaps the first character of the current name with the last character of the name.
//chars[chars.length - 1] = temp - swaps the last character of the current name with the character stored in temp.
//result.append(new String(chars)).append(", ") - converts the swapped character array back to a string and appends it to the result string, followed by a comma and a space.
//System.out.println("Result: " + result.toString().trim()) - prints the final result string to the console, with leading and trailing whitespaces removed.
//So, the program loops through each name in the array, converts the name into a character array, swaps the first and last characters of the array, converts the array back to a string, and appends it to the result string. Finally, it prints the result string to the console.