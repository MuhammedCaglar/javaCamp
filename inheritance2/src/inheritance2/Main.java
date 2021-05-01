package inheritance2;
//Birbirinin alternatifi olan kodlar için if yazýlmaz.
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager();
		customerManager.add(new EmailLogger());

	}

}
