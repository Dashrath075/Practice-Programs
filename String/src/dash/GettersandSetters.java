package dash;

public class GettersandSetters {
	private int id;
	private String name;
	private String Lastname;
	private int age;
	public void setId(int id) {
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() throws Exception
	{
		if(name==null || name.length()<=0) {
			throw new Exception();
		}
		return name;
	}
	public void setAge(int id) {
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public String toString(){
		return "Employee: [id="+id+",name="+name+",age="+age+"]";
	}
	public static void main(String[] args) {
		GettersandSetters a=new GettersandSetters();
		a.setAge(12);
		a.setName("");
		a.setId(123);
		System.out.println(a);
		try {
			System.out.println(a.getName()+"  "+a.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank you for using Getters and Setters");
		}
	}
}
