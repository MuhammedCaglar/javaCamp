package inheritance2;
//Birbirinin alternatifi olan kodlar i�in if yaz�lmaz.
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager();
		customerManager.add(new EmailLogger());

	}

}
