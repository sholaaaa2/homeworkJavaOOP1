package level2;

public class Main {

	public static void main(String[] args) {
		Network network = new Network();
		
		Phone ph1 = new Phone("1");
		Phone ph2 = new Phone("2");
		Phone ph3 = new Phone("3");
		
		ph1.registerInNetwork(network);
		ph3.registerInNetwork(network);
		
		ph1.outgoingCall("2");
		ph1.outgoingCall(ph3.getNumber());
		ph2.outgoingCall("3");
	}

}
