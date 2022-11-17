import java.util.HashMap;
public class Application extends WordsAndDefinitions{

	public static void main(String[] args) {
	
		
		HashMap<String, String> myMap = new HashMap<String,String>();
		
		for(int i = 0; i<436; i++) {
			myMap.put(words[i], definitions[i]);
		}
		
		for (String i: myMap.keySet()) {
			System.out.println(i+ ": "+myMap.get(i));
		}
		
		System.out.println("\n rapscallion: " + myMap.get("rapscallion"));
		System.out.println("\n dame: "+myMap.get("dame"));
		System.out.println("\n appetency: "+ myMap.get("appetency"));
		System.out.println("\n jade: "+ myMap.get("jade"));
		System.out.println("\n quiz: "+ myMap.get("quiz"));
		
		
		
	}

}
