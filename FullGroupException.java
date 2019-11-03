package homeWork_4;

public class FullGroupException extends Exception{
	@Override
	public String getMessage() {
		return "This group is full";
	}

}
