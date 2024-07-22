

class demo
{
	private int age  = 23;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age changed to :" +age);
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		demo obj = new demo();
		obj.setAge(30);
		System.out.println(obj.getAge());
	}

}
