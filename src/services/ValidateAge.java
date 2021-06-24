package services;

public class ValidateAge {

	public byte validateAge(byte age) throws InvalidAgeException{
		
		// TODO Auto-generated method stub
		if(age>=0 && age<=127 ) {
			return age;
		}
		else {
			throw new InvalidAgeException();
		}
		
	}
}
