import java.util.*;
import java.util.stream.*;

public class StringStreamDemo {

	public static void main(String[] args) {
List<String> l=Arrays.asList("zen","peon","ken","man");
List<String> s=l.stream().filter(x->x.contains("e")).collect(Collectors.toList());
//for(String g:s)
//{
//	System.out.println(g);
//}
//or lines 11 to 14 can be written as
//s.stream().forEach(System.out::println);
//l.stream().limit(2).forEach(System.out::println);
//Stream<String> s6=l.stream().map(x->x.toUpperCase()).filter(x->x.contains("E"));
//System.out.println(s6.count());
//l.stream().filter(name -> name.toLowerCase().contains("e")).forEach(System.out::println);
System.out.println(l.stream().anyMatch(x->x.contains("e")));
System.out.println(l.stream().noneMatch(x->x.contains("o")));
System.out.println(l.stream().allMatch(x->x.contains("n")));
List<String> stringList = new ArrayList<String>();
/*
stringList.add("one");
stringList.add("two");
stringList.add("three");
stringList.add("one");
*/
Stream<String> stream = stringList.stream();

Optional<String> anyElement = stream.findAny();

if(anyElement.isPresent())
{
	System.out.println(anyElement.get());
}

	}
System.out.println("sorting in ascending line 40 or 41");
l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
l.stream().sorted().forEach(System.out::println);

System.out.println("sorting in reverse");
l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
}
