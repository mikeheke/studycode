package mikeheke.studycode.designpattern.singleton2;

public class PaymentFactory {

	private static PaymentFactory paymentFactory = new PaymentFactory();
	
	private PaymentFactory() {}
	
	public static PaymentFactory getInstance() {
		return paymentFactory;
	}
	
	public IPaymentService getPaymentService(String payMethod) {
		//TODO
		return null;
	}
}
