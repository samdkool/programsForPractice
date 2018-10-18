package questions.asked;
// what is the output of the below code snippet and why

public class QuestionsDemo2 {
	public static void methode1() {
		System.out.println(" Inside static methode1 ");
	}
	public static void main(String[] args) {
		QuestionsDemo2 q = null;
		q.methode1(); // As we can call static method by class name so we can also call using class variable
	}
}
