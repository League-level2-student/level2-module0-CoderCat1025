package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] numbers = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
		System.out.println(numbers[2]);
		//3. set the third element to a different value
		numbers[2] = "one thousand";
		//4. print the third element again
		System.out.println(numbers[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//6. make an array of 50 integers
		int[] moreNumbers = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		for (int e=0; e<moreNumbers.length; e++) {
			moreNumbers[e] = new Random().nextInt(1000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestValue = moreNumbers[0];
		int largestValue = moreNumbers[0];
		
		for (int a = 1; a<moreNumbers.length; a++) {
			if (moreNumbers[a] < smallestValue) {
				smallestValue = moreNumbers[a];
			}
			if (moreNumbers[a] > largestValue) {
				largestValue = moreNumbers[a];
			}
		}
		System.out.println("Smallest is " + smallestValue);
		//9 print the entire array to see if step 8 was correct
		for (int u = 0; u<moreNumbers.length; u++) {
			System.out.println(moreNumbers[u]);
		}
		//10. print the largest number in the array.
		System.out.println("Largest is " + largestValue);
	}
}
