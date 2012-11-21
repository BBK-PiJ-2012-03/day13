public class Anagrams {

	public List<String> getAnagrams(String s) {
		List<String> result = new ArrayList <String>();
		
		if s.length() < 2) {
			result.add(s);
			return result;
		}

		else {
				for (int i=0; i<s.length; i++) {
					String rest = (s.substring(0,i) + s.substring(i+1, s.length()))
					List<String> partialResult = getAnagrams(rest);
					
					for(String next : partialResult) {
						result.add(s.get(i) + next);
					}
				}
				return result;
		}		
}

/** 
Allos tropos gia na grapsw auto to for loop einai:

for (int j = 0 ; j < partialResult.size().j++) {
			String next = partialResult.get(j);
			result.add(...);
			