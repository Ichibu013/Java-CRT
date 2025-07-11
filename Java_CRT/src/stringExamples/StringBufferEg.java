package stringExamples;

public class StringBufferEg {

	public static void StringBufferEg1() {
		StringBuffer stringBuffer1 = new StringBuffer("ABC");
		StringBuffer stringBuffer2 = new StringBuffer("ABC");
		System.out.println(stringBuffer1 == stringBuffer2);
		System.out.println(stringBuffer1.equals(stringBuffer2));
	}

	public static void StringBuffer2() {
		StringBuffer stringBuffer = new StringBuffer("Ansh");
		stringBuffer.append(" Sharma");
		System.out.println(stringBuffer);
	}

	// StringBuffer Objects are mutable i.e any changes happen on the same obj
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer2();
		StringBufferEg1();
	}
}
