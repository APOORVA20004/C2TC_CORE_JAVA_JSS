package om.tnsif.expectionhandling;

public class AgeValidator {

	public static void validdateAge(int age) throws InvalidAgeException{
		
		if(age<18)
throw new InvalidAgeException("early to cast the vote");
	}
}
