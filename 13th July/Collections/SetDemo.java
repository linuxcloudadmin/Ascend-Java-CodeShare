import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		System.out.println("using HashSet");//no order
s.add("ann");
s.add(3);
s.add("ben");
s.add(3);
s.add("zen");
s.add(4);
System.out.println(s);
System.out.println("using LinkedHashSet");//maintains insertion oredr
Set s1=new LinkedHashSet();
s1.add("ann");
s1.add(3);
s1.add("ben");
s1.add(3);
s1.add("zen");
s1.add(4);
System.out.println(s1);
System.out.println("using Treeset"); //sorted,but all objects shud be of same kind
Set s2=new TreeSet();
s2.add("ann");
s2.add("zen");
s2.add("ben");
s2.add("hen");
s2.add("men");

System.out.println(s2);


	}

}
