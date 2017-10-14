class People{
	int age;
	public People() {
		// TODO Auto-generated constructor stub
		
	}
	void eat()
	{
		int number = 10;
		System.out.println("I can eat "+number+" apple");
		
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		System.out.println(people.age);
		people.eat();
		

	}

}
