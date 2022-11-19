package scripts;

import java.util.HashMap;
import java.util.Map;

public class TestString {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
		System.out.println(map.get("id").intValue());
		}
		catch(Exception e)
		{
			
		System.out.println("Exception is raised");
		
		}
	}

	

}
