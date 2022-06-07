package level1;

public class Main {

	public static void main(String[] args) {
		Product pr1 = new Product(22.5, "CAr", 100);
		
		Triangle tr = new Triangle(2,5,4);
		
		System.out.println(pr1.toString());
		
		System.out.println(tr.toString());
		System.out.println(tr.getSquare());

	}

}
