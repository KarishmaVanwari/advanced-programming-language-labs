import Animals.*;

class Main {
	public static void main(String args[]) {
		Lion lion = new Lion();
		Deer dear = new Deer();
		Bear bear = new Bear();
		AbstractClass abs = new AbstractClass();

		lion.show();
		lion.display();
		dear.display();

		System.out.println("");

		bear.Method1();
		bear.Method2();
		bear.Method3();

		System.out.println("");

		abs.facial();
		abs.skin();
		abs.color();
	}
}