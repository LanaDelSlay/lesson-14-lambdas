package exercises;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaHelper {

	public static List<Integer> processList(List<Integer> inputList,
			Function<Integer, Integer> lambda) {
		return inputList.stream().map(lambda).collect(Collectors.toList());
	}

	public static String processString(String inputString,
			Function<String, String> lambda) {
		return lambda.apply(inputString);
	}

	public static int processBiFunction(int numberA, int numberB,
			BiFunction<Integer, Integer, Integer> lambda) {
		return lambda.apply(numberA, numberB);
	}

	public static String processFunction(Integer number,
			Function<Integer, String> lambda) {
		return lambda.apply(number);
	}

	public static int processCharFunction(char c,
			Function<Character, Integer> lambda) {
		return lambda.apply(c);
	}

	public static Double processBiFunction(double sideA, double sideB,
			BiFunction<Double, Double, Double> pYTHAGOREAN_LAMBDA) {
		// TODO Auto-generated method stub
		return null;
	}

}
