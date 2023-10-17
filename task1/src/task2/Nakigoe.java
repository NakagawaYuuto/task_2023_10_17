package task2;

public class Nakigoe {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.naku();
		dog.sakebu("うー！");
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				System.out.println("しゃー！！");
			} else {
			dog.sakebu("wonn!wonn");
			}
		}
	}
}
