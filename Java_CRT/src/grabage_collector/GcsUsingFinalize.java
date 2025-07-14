package grabage_collector;

public class GcsUsingFinalize {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main started");
		GcsUsingFinalize objFinalize = new GcsUsingFinalize();
		objFinalize = null;
		System.gc();
		System.out.println("Main Ended");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize method");
	}

}
