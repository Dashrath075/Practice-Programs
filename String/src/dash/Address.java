package dash;
public class Address {
 private int addressId;
 private String addressLine1;
 private String addressLine2;
 private String city;
 private String state;
 public Address(int addressId, String addressLine1, String addressLine2, String city, String state) {
 super();
 this.addressId = addressId;
 this.addressLine1 = addressLine1;
 this.addressLine2 = addressLine2;
 this.city = city;
 this.state = state;
}

@Override
public String toString() {
	return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2+ ", city=" + city + ", state=" + state +"]";
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
}

