package trainig;

public class CountWords{
	public static void main(String[] args) {
		
	String sentence = "my name is ashraf ali";
	int wordCount = 0;

	for(int i = 0; i < sentence.length(); i++) {

	if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {
	wordCount++;
	}
	}

	wordCount++;


	System.out.println("Total number of words: " + wordCount);
	}
	}

