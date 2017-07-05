package framework;
import java.util.*;

public class Allocator {
	private static HashMap< Resource, List<User> > allocatedResources = new HashMap <>();

	public static void allocate(Resource resource, List <User> users) {
		allocatedResources.put(resource, users);
		System.out.println("Recuso alocado com sucesso");
	}
	
	public static void visualize() {
		for (HashMap.Entry<Resource, List<User> > entry : allocatedResources.entrySet()) {
			System.out.println(entry.getKey().getName()+" : ");
		    entry.getValue().listIterator().forEachRemaining(u ->  System.out.println(u.getName()));
		}
	}
	
}
