package p1;

public class Citizen {
	
	private static int VOTING_AGE = 18 ;
	private static int citizenCount = 0 ;
	private final String firstName ;
	private final String lastName ;
	private int age ;
	private final int voterId ;
	
	public Citizen(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.voterId = citizenCount;
        citizenCount++;
    }
	
	public void incrementAge() {
		this.age ++ ;
	}
	
	public boolean canVote() {
		return this.age >= VOTING_AGE ;
	}

	private String getUpperCaseLastName() {
		return this.lastName.toUpperCase();
	}
	
	private String getCapitalizedFirstName() {
		return Character.toUpperCase(this.firstName.charAt(0)) + this.firstName.substring(1).toLowerCase() ;
	}
	
	private String getName() {
		return this.getUpperCaseLastName()+" "+this.getCapitalizedFirstName();
	}
	public String getNamePublic() {
		return getName();
	}
	public boolean equals(Object o) {
		if(!(o instanceof Citizen))
			return false ;
		Citizen c = (Citizen) o ;
		return this.getVoterId() == c.getVoterId();
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getVoterId() {
		return voterId;
	}

	public static void main(String[] args) {
        Citizen citizen1 = new Citizen("john", "doe", 25);
        Citizen citizen2 = new Citizen("Jane", "smith", 15);

        System.out.println(citizen1.getName());  
        System.out.println(citizen2.getName()); 
        System.out.println(citizen2.canVote());  
        System.out.println(citizen1.equals(citizen2));  
        System.out.println(citizen1.getVoterId());
        System.out.println(citizen2.getVoterId());

	}
	
}