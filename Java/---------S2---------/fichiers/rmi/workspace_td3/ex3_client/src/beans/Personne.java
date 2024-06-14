package beans;

import java.io.Serializable;

public class Personne implements Serializable{
	private int id ;
	private String name ;
	private int age ;
	private String adresse;
	
	public Personne() {
	}
	
	public Personne(int id, String name, int age, String adresse) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.adresse = adresse;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", name=" + name + ", age=" + age + ", adresse=" + adresse + "]";
	}
	
	
}
