package dash;

public class CheckAgeToDrink {

public static void main(String[] args) {
// TODO Auto-generated method stub
Age a = new Age();
ExceptionCheck obj = new ExceptionCheck();
try {
obj.valtidateAgeToDrink(a, 22);
obj.valtidateStringAgeToDrink(a, "23");
} catch (IllegalAgeException e) {
a.drink="Illegal";
}
System.out.println(a.drink);
}

}

class Age{
String drink;
}

class ExceptionCheck{
String valtidateAgeToDrink(Age a, int age) throws IllegalAgeException {

if (age<21) {
throw new IllegalAgeException("Illegal drinking age");
}else {
a.drink = "Legal";
}
return a.drink;

}

String valtidateStringAgeToDrink(Age a, String age) throws IllegalAgeException {

if ((age.length()<2) || Integer.parseInt(age)<21) {
throw new IllegalAgeException("Illegal age detail or drinking age");
}else {
a.drink = "Legal";
}
return a.drink;

}
}

class IllegalAgeException extends Exception{
private static final long serialVersionUID = 1L;
public IllegalAgeException(String str) {
super(str);
}

}

