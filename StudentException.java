package homeWork_4;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "Student already exsist";
	}
}
