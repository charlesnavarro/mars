import java.util.ArrayList;

public class planet {
	String name;
	ArrayList<passengers> population = new ArrayList<passengers>();
	
	public planet(String name) {
        this.name = name;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<passengers> getPopulation() {
		return population;
	}

	public void setPopulation(ArrayList<passengers> population) {
		this.population = population;
	}
	
public String check() {
    	
    	int lion = 0;
    	int cow = 0;
    	int grains = 0;
    	int man = 0;
    	int woman = 0;
    	int scientist = 0;
    	
    	for(int i = 0; i < population.size(); i++)
    	{
    		if(population.get(i).name.equals("Man"))
    			man = 1;
    		if(population.get(i).name.equals("Woman"))
    			woman = 1;
    		if(population.get(i).name.equals("Lion"))
    			lion = 1;
    		if(population.get(i).name.equals("Cow"))
    			cow = 1;
    		if(population.get(i).name.equals("Grains"))
    			grains = 1;
    	}
    	
    	System.out.println("Man " + man);
    	System.out.println("Woman: " + woman);
    	System.out.println("Lion: " + lion);
    	System.out.println("Cow: " + cow);
    	System.out.println("Grains: " + grains);

   
    	if(lion == 1 && cow == 1) {
    		System.out.println("The lion ate the cow!");
    		return "The lion ate the cow!";
    		
    	}
    	else if(cow == 1 && grains == 1) {
    			System.out.println("The cow ate the grains!");
    			return "The cow ate the grains!";
    		}
    		else if(man == 1 && lion == 1) {
    				System.out.println("The man killed the lion!");
    				return "The man killed the lion!";
    			}
    			else if(woman == 1 && lion == 1) {
    					System.out.println("The woman killed the lion!");
    					return "The woman killed the lion!";
    				}
    				else if(man == 1 && cow == 1) {
    						System.out.println("The man ate the cow!");
    						return "The man ate the cow!";
    					}	
    					else if(woman == 1 && lion == 1) {
    							System.out.println("The woman ate the cow!");
    							return "The woman ate the cow!";
    						}	
    						else
    							return "valid";
    	}
  }
