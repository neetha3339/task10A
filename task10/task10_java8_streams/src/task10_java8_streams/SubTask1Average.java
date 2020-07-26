package task10_java8_streams;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
public class SubTask1Average {
	public static double averageOfList(List<Integer> inputList)
	{
		OptionalDouble average = inputList.stream()
				.mapToInt(Integer::intValue)
				.average();        
		return average.isPresent() ? average.getAsDouble() : 0; 
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the size of the list");
			int n = sc.nextInt();
			List<Integer> inputList = new ArrayList<Integer>(n);
			System.out.println("Enter the numbers to the list");
			for(int i = 0; i < n; i++)
				inputList.add(sc.nextInt());
			System.out.println( "Average of the given list of numbers is: " + averageOfList( inputList ) );
		}
    }
}
