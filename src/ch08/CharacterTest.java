package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		//	문자는 2byte
		char han = '한';
		char ch = '\uD55C';
		//	16진수는 숫자1개가 4bit	
		System.out.println(han);
		System.out.println(ch);
	}

}
