package Java8Features;

interface InterfaceMain {
	void m1();

	default void m2() {
		System.out.println("m2");
	}

	static void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		abc objAbc = new abc() {

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m1");
			}
		};
		objAbc.m1();
		objAbc.m2();
		m3();
	}
}
