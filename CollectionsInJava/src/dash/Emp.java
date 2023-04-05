package dash;

public class Emp implements Comparable<Emp> {
           private int id;
           private String name;
           private String company;
        public Emp(int id,String name,String company) {
        	this.id=id;
        	this.name=name;
        	this.company=company;
        }
           
        public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		
		@Override
		public int compareTo(Emp o) {
			return this.id-o.id;
		}
		@Override
		public String toString() {
			return "emp:[id="+id+",name="+name+",company="+company+"]";		}
           
}
