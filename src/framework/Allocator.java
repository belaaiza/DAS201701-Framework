package framework;
import java.util.*;

public abstract class Allocator {
	private Map<List<User>,Resource> allocatedResources;
	
	public abstract void allocate();
	public abstract void vizualize();
	
}
