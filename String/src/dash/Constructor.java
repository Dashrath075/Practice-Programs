package dash;
public class Constructor{
       private int id;
       String name;
       String Lastname;
       int age;
       static String CompanyName="Capgemini";
       public Constructor(int id,String name,String Lastname,int age) {
    	   this.id=id;
    	   this.name=name;
    	   this.Lastname=Lastname;
    	   this.age=age;
       }
       public Constructor(int id,String name,String LastName) {
    	   this.id=id;
    	   this.name=name;
    	   this.Lastname=Lastname;
       }
       @Override
       public String toString()
       {
    	return "Constructor [id="+id+",name="+name+",LastName="+Lastname+",Age="+age+",CompanyName="+CompanyName+"]";
       }
       public static void main(String[] args) {
    	   // Constructor a=new Constructor(10,"dashrath","Metre", 22);
    	   //System.out.println(a);
    	   Constructor b=new Constructor(20,"Amar","Metre");
    	   System.out.println(b);
       }
}