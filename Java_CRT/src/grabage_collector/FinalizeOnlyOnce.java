package grabage_collector;

public class FinalizeOnlyOnce {
	static FinalizeOnlyOnce sFinalizeOnlyOnce;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FinalizeOnlyOnce objFinalizeOnlyOnce = new FinalizeOnlyOnce();
		System.out.println("Main Method started");
		System.out.println(objFinalizeOnlyOnce.hashCode()); // Use 'hashcode()' to display memory location
		objFinalizeOnlyOnce = null;
		System.gc();
		Thread.sleep(1000); // Used for Synchronizing thread to avoid conflict
		System.out.println(sFinalizeOnlyOnce.hashCode());
		sFinalizeOnlyOnce = null;
		System.gc(); // Finalize method will only be called for one object only once
		Thread.sleep(1000);
		System.out.println("Main Method started");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize Method");
		sFinalizeOnlyOnce = this; // Use 'this' keyword to assign different variable to same object
	}

}
