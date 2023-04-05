package dash;
class InvalidAgeException extends Exception {
	 
    String msg;
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
public class CustomException{
	public static void checkAge(int age) throws InvalidAgeException {
    if (age < 18)
        throw new InvalidAgeException("You are not yet eligible for driving");
    else
        System.out.println("you are eligible for driving");
}
	 public static void main(String[] args) {
	        try {
	            checkAge(3);
	        } catch (InvalidAgeException e) {
	            e.printStackTrace();
	        }
	 }
}