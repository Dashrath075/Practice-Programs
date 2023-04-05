package dash;
class Aggr{
	private int id;
	private String name;
	private Address ad;
	//constructor
	public Aggr(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public Aggr(int id,String name,Address ad) {
		super();
     this.id=id;
	 this.name=name;
	 this.ad=ad;
	}
	public Aggr() {
		super();
	}
	@Override
	public String toString(){
		return "Aggregation:[id"+id+",name="+name+","+ad+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Address getAddress() {
		return ad;
	}
	public void setAddress(Address ad) {
		this.ad=ad;
	}
}

public class Aggregations {
	public static void main(String[] args) {
		Address a=new Address(101,"flat1","mumbai","delhi","banglore");
		Aggr b=new Aggr();
		b.setId(12);
		b.setName("Dashrath");
		b.setAddress(a);
		System.out.println(b);
		
	}
}
