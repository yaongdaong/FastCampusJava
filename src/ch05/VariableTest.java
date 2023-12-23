package ch05;

public class VariableTest {

	public static void main(String[] args) {
		int age, count;
		age = 10;
		
		int level = 10000;
		System.out.println(age);
		System.out.println(level);
	}

}
//변수의 이름 만들 때...
//변수 이름은 영문자(대문자, 소문자)나 숫자를 사용할 수도 있고, 특수문자 중에는 $와 _만 사용 (ex. count100, _master)
//변수 이름의 시작은 숫자로 할 수 없음 ( ex. 27days(X), 1abc(X))
//자바에서 이미 사용하고 있는 예약어는 사용할 수 없음 (while, break 등)
//변수 이름은 프로그램내에서 사용되는 것이므로 그 용도에 맞고 가독성이 좋게 만드는것이 중요
//ex) int numberOfStudent;