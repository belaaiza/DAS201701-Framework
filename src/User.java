
public abstract class User {
	private String name;
	private String registration;
	
	
	
	public User(String name, String registration) {
		this.name = name;
		this.registration = registration;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	
}