
public class StringSwap {

	public static void main(String[] args) {

		String s1 = "java programming is fun";
		String[] words = s1.split(" ");
		int sLength = words.length;
		System.out.println(sLength);
		String newString = "";
		newString = newString.concat(words[sLength - 1]) + " ";
		String sREverse = reverseString(words[1]);

		for (int i = 1; i <= sLength - 2; i++) {
			newString = newString.concat(words[i]) + " ";
		}
		newString = newString.concat(words[0]) + " ";
		System.out.println("Original String:" + s1);

		System.out.println("New string is :" + newString);

	}

	String reverseString(String s2) {
		
		String sr="";
		for(int i=s2.length()-1;i>=0; i--) {
			
			sr=sr.concat(new String(sr[i]));
			sr.
			
		}
		
		return(sr);
		
		
	}

}
