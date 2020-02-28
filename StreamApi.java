package STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		System.out.println(names);

//print names with length with more than 6 !
		List<String> namesList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println("Names with more than 6 letters ");
		namesList.forEach(System.out::println);

// names in upper case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		namesInUpper.forEach(System.out::println);
		
		long count=names.stream().count();
		System.out.println("list count is : "+count);
		
		Stream<Integer> data = Stream.of(1,11,111,1111,111);
		System.out.println("data count :" +data.count());
		
		
		Stream<String> charac = Stream.of("angular","python","c++","c","java");
//		List<String> characl=   charac.filter(s->s.length()>4).collect(Collectors.toList());
//		characl.forEach(System.out::println);
//		List<String> characm= charac.map(s -> s.concat(" programming")).collect(Collectors.toList());
//		characm.forEach(System.out::println);
		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());
		defaultSorted.forEach(System.out::println);
		
		List<String> customSorting = names.stream().
										sorted((s1,s2) -> -s1.compareTo(s2)).
										collect(Collectors.toList());
				customSorting.forEach(System.out::println);
	}

	private static void addNames(ArrayList<String> names) {
		names.add("neeraj");
		names.add("abhijeet");
		names.add("rushika");
		names.add("trisha");
		names.add("aisha");
		

	}

}
