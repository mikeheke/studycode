package mikeheke.studycode.designpattern.singleton2;

public class SingletonClient2 {

	public static void main(String[] args) {
		IPaymentService payment = 
				PaymentFactory.getInstance().getPaymentService("H");
		
		//...
	}

}
