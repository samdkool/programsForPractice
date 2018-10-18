package questions.asked;

// what is the output of below code snippet and why

public class QuestionDemo1 {
	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2); // here comes a doubt
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3==i4); // here content may be same but the reference of the two objects are different
	}
}
