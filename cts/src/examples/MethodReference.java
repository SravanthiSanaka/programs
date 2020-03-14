package examples;
interface Sayable{
	void say();
}
class Example{
	public static void saySomething() {
		System.out.println("i am saying on reference");
	}
}
public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable=()->System.out.println("i am telling lambda expression");
		sayable.say();
		Sayable say1=Example::saySomething;
		say1.say();
		

	}

}
