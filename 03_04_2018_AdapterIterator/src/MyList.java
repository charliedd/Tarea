import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class MyList implements Enumeration<String> {
	ArrayList<String> list;
	int index,end;
	
	MyList(String[] strings){
		list = new ArrayList<String>();
		list.addAll(Arrays.asList(strings));
		index = 0;
		end = list.size();
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		if(index < end){
			return true;
		}
		return false;
	}

	@Override
	public String nextElement() {
		// TODO Auto-generated method stub
		return list.get(index++);
	}
	
	
}
