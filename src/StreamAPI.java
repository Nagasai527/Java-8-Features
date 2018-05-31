import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
	

	public static void main(String[] args) {
		List<String> streamList = new ArrayList<String>();
		StrLengthFI strLen = str -> str.length();
		streamList.add("Zsfsd");
		streamList.add("Zee");
		streamList.add("Bfgd");
		streamList.add("Osfsd");
		streamList.add("Asfsd");
		streamList.add("Isfsd");
		
		System.out.println("Stream List before sort"+ streamList);
		
		/*using Stream API for sorting and iterating using lambda expression along with 
		 * calculating string length using a Functional Interface*/ 
		System.out.println("---After Sort with length---");
		streamList.stream().sorted().forEach( s -> System.out.println(s+" - "+strLen.stringLength(s)));
		
		/*Filtering the list to print Strings starting with letter Z*/
		System.out.println("---After filter---");
		streamList.stream().filter(str -> str.startsWith("Z")).forEach(System.out::println);

	}

}
