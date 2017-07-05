package framework;
public abstract class User {
	private String name;
	private String registration;
	
	public abstract void create();
	public abstract void delete();
	public abstract boolean update();
	public abstract void visualize();
	
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
