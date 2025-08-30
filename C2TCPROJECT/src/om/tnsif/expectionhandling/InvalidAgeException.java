package om.tnsif.expectionhandling;

public class InvalidAgeException extends Exception {
public InvalidAgeException() {
	super("Invalid age");
}
public InvalidAgeException(String string) {
	super(string);
}
}
