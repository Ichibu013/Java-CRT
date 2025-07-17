package Java8Features.Lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface LambdaInterfaceEg {
	void hello();
}

public class LambdaEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() -> System.out.println("Hello World")).start();

		LambdaInterfaceEg objEg = () -> System.out.println("Hello from Interface");
		objEg.hello();

		Consumer<String> printer = message -> System.out.println(message);
		printer.accept("Hello from consumer");

	}

}
