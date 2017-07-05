package framework;

public abstract class Resource {
	private String name;
	private String description;
	private int number;
	
	public abstract void create(String name, String description, int number);
	public abstract void delete(int idResource);
	public abstract boolean update(int idResource, String name, String description);
	public abstract void visualize();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
