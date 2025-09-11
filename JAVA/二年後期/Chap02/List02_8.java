class InvalidAgeException1 extends Exception {
	InvalidAgeException1(String message){
		super(message);
	}
}
class Person{
	int age;
	void setAge(int age) throws InvalidAgeException1{
			if(age < 0) {
				throw new InvalidAgeException1("年齢にマイナスの値が指定されました");
			}
			this.age = age;
		}
	}

public class List02_8 {
	public static void main(String args[]) {
		Person p = new Person();
		try {
			p.setAge(-5);
		}
		catch(InvalidAgeException1 e) {
			System.out.println(e);
		}		
	}
}
