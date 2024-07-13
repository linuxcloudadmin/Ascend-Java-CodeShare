public class GenericDemo {

	public static void main(String[] args) {
//		List<Integer> l=new ArrayList();
//		l.add(5);
//		l.add(8);
//		l.add(6);
		List<Integer> l=Arrays.asList(2,3,4);
		List<String> l1=Arrays.asList("ann","ben");
		for(Integer k:l) //1.5
		{
			System.out.println(k);
		}
		
		
		
		Iterator<String> i=l1.iterator();  // ann  ben   3 6 ==OBJECT
		while(i.hasNext())
		{
			String o=i.next();
			System.out.println(o);
		}

		

	}

}
