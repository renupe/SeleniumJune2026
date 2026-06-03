package Interview;

public class CountVowelsConso {

	public static void main(String[] args) {
		String str = "Automation";
		String text = str.toLowerCase();
		int vowels = 0;
		int consonant = 0;

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= 'a' && ch <= 'z') {//check only alphabets
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonant++;

				}

			}

		}
		System.out.println("vowels is "+vowels);
		System.out.println("consonants is "+consonant);
	}
}
