package framework;
public abstract class User {
	private String name;
	private String registration;
	
	public abstract void create(String name, String registration);
	public abstract void delete(int idUser);
	public abstract boolean update(int idUser, String name, String registration);
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
