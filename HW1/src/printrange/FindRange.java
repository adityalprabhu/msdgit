package printrange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindRange implements Range{

	public List<Integer> printAllNumbersInRange(int start, int end) {
		
	    List<Integer> listOfNumbers = new ArrayList<Integer>();
	    for(int i=start+1;i<end;i++) {
	    	listOfNumbers.add(i);
	    }
		return listOfNumbers;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the starting number of the range:");
		int start = scanner.nextInt();
		System.out.println("Enter the ending number of the range:");
		int end = scanner.nextInt();
		Range newObj =  new FindRange();
		List<Integer> list = newObj.printAllNumbersInRange(start, end);
		System.out.println(list);
		
		
	}
	

}
