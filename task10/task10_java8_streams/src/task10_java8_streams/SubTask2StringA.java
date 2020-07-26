package task10_java8_streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class SubTask2StringA {
	public static List<String> filterStrings(List<String> inputList)
	{
		return inputList.stream()
				  .filter(str -> str.startsWith("a"))
				  .filter(str -> str.length() == 3)
				  .collect(Collectors.toList());
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the size of the list");
			int n = sc.nextInt();
			List<String> inputList = new ArrayList<String>(n);
			System.out.println("Enter the numbers to the list");
			for(int i = 0; i < n; i++)
				inputList.add(sc.next());
			System.out.println( " Strings starting with the letter 'a' and having exactly 3 letters are: " + filterStrings( inputList ) );
		}
    }
}
