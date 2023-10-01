
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		HelloWorld hl = new HelloWorld();
		hl.add();
		

	}
	// add method
	public void add() {
		System.out.println("This is test");
	}
	//this method added by other developer
	public void minus(){
		System.out.println("This is test --minus()");
	}
	//added in phase2 branch 
	public void multiply(){
		System.out.println("This is test --multiply()");
	}

}
