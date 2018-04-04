
import java.util.Iterator;


public class Test {
	public static void main (String args[]) {
		String[] myArray = {"1","2","3","4"};
		
			Iterator<String> myIterator = new EnumerationAdapter(new MyList(myArray));
			while (myIterator.hasNext()) {
				System.out.println(myIterator.next());
			
		}
	}
}
