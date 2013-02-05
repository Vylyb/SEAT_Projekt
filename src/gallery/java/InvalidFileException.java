package gallery.java;

public class InvalidFileException extends Exception {

	private String message;

	public InvalidFileException(String filepath) {
		this.message="Wrong file type: "+filepath;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return getMessage();
	}
}
