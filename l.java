import java.util.LinkedList;

public class l {

	
	
	public static void main(String[] args) {
		LinkedList<Pair> list=new LinkedList<Pair>();
		list.add( new Pair(1 , 2) );
		list.add(new Pair(3 , 4));
		list.add(0, new Pair(5,6));
		System.out.println(list);
	}
	
}
