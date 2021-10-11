package TotalNoOfIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountNoOfIntegers {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(2,45,64,85, 3453,234,34,12);
		long count = list.stream().count();
		System.out.println(count);
	}
}
