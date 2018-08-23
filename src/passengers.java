import java.util.ArrayList;

public abstract class passengers {

	String name;
	int location;
	
	public passengers(String name, int location) {
        this.name = name;
        this.location = location;
    }

	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
