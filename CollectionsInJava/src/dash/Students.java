package dash;

public class Students implements Comparable<Students>{
int id;
String name;
int age;
 public Students(int id, String name, int age) {
 super();
 this.id = id;
 this.name = name;
 this.age =age;
 }

@Override
public int compareTo(Students o) {
if(age==o.age)
return 0;
else if(age>o.age)
 return 1;
else
return -1;
}
}
