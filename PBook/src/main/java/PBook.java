
import java.util.HashMap; 
import java.util.Iterator;


public class PBook {
	
	private String name;
	private String tell;
	
	HashMap<String, String> map = new HashMap<String, String>();

	
	 public boolean isEmpty() {
		if(map.isEmpty())
			return true;
		else
			return false;
	}

	public void addNumber(String string, String string2) {
		name = string;
		tell = string2;
		if(map.containsKey(name)){ // 포함되어잇냐?
			String newTell = map.get(name) + "; " + tell;
			map.replace(name,newTell);
		}
		else map.put(name, tell);
		
		
	}

	public String getNumber(String string) {
		
		return map.get(string);
	}

}
