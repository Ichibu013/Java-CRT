package Java8Features.serializableEg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDetails {

	static String FILE_PATH = "C:\\Users\\ansha\\git\\Java-CRT\\Java_CRT\\src\\Java8Features\\serializableEg\\";
	static String FILE_NAME = "student.txt";
	static String FULL_PATH = FILE_PATH + FILE_NAME;

	public static void StudentSerialization() throws IOException {
		Student student = new Student();
		student.StudentId = 100;
		student.studentName = "Ansh";
		FileOutputStream fileOutputStream = new FileOutputStream(FULL_PATH);
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(student);
			System.out.println("Object written in " + FILE_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
		fileOutputStream.close();
	}

	public static void StudentDeserialization() throws Exception {
		FileInputStream fileInputStream = new FileInputStream(FULL_PATH);
		try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			Student readStudent = (Student) objectInputStream.readObject();
			System.out.println("Reading file " + FILE_NAME);
			System.out.println("Student ID : " + readStudent.StudentId);
			System.out.println("Student Name : " + readStudent.studentName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		StudentSerialization();
		StudentDeserialization();
	}

}
