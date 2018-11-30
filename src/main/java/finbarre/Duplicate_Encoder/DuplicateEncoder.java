package finbarre.Duplicate_Encoder;

public class DuplicateEncoder {
	static String encode(String word){
		
		word=word.toLowerCase();
		String result="";
		boolean found;
		for(int i =0;i<word.length();i++){
			found = false;
			for(int j=0;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j) && i!=j) {
					result+=")";
					found = true;
					break;
				}
			}
			if(!found) result+="(";
		}
	    return result;
	  }
}
