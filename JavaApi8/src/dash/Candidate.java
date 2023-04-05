package dash;
import java.util.*;
import java.util.stream.Collectors;
public class Candidate {
	private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;
 
    public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
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
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public int getYearOfJoining() {
        return yearOfJoining;
    }
 
    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    @Override
    public String toString() {
        return "Candidate [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
    
    public static void main(String args[]) {
    	List<Candidate> list = new ArrayList<>();
        list.add(new Candidate(112, "Diya", 32, "Female", "HR", 2011, 25000.0));
        list.add(new Candidate(146, "Dashrath", 28, "Male", "Product Development", 2014, 32503.0));
        
        System.out.println(Candidate.getYoungestCandidateDetails(list));
    	
    }
    static Map<String, Long> getCount(List<Candidate> list){
    	Map<String, Long> count=list.stream().collect(Collectors
    			.groupingBy(Candidate::getGender,Collectors.counting()));
		return count;
    }
    static Map<String, Double> getAvarageAge(List<Candidate> list){
    	Map<String, Double> count=list.stream().collect(Collectors
    			.groupingBy(Candidate::getGender,Collectors
    		    		.averagingInt(Candidate::getAge)));
    	return count;
    }
    static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
        Map<String, Long> count = list.stream()
                .collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
        return count;
    }
    static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list) {
        Optional<Candidate> age = list.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(Candidate::getAge));
        return age;
    }
}
