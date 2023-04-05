package dash;
class CountryIndia extends Exception{
	public CountryIndia(String msg){
		super(msg);
	}
}

public class CountryException {
	public static void India(String ind) throws CountryIndia{
		if(ind!="India"){
			throw new CountryIndia("Enter valid Country Name");
		}
	}
    public static void main(String[] args) {
    	try {
    		India("aus");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
