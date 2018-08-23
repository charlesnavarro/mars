import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		spaceship s1 = new spaceship();
		planet earth = new planet("Earth");
		planet mars = new planet("Mars");
		person man = new person("Man", 0);
		person woman = new person("Woman", 0);
		person scientist = new person("Scientist",0);
		lion l1 = new lion("Lion", 0);
		cow c1 = new cow("Cow", 0);
		grain g1 = new grain("Grains", 0);
		
		earth.population.add(man);
		earth.population.add(woman);
		earth.population.add(l1);
		earth.population.add(c1);
		earth.population.add(g1);
		
		System.out.println(earth.getPopulation());
		
		while (earth.population.size() != 0)
		{
			System.out.println("earth popul2ation: " + earth.population.size());
			System.out.println("mars population: " + mars.population.size());
			System.out.println("============================================");		
			
			System.out.println();
			System.out.println("Choose who to board the spaceship!");
			System.out.println("1. Man");
			System.out.println("2. Woman");
			System.out.println("3. Lion");
			System.out.println("4. Cow");
			System.out.println("5. Grain");
			
			int input, input1;
			int moves = 0;
//			System.out.print("Enter number of passengers 1 or 2: ");
//			input1 = scan.nextInt();
			// earth to mars
			if(moves == 0) {
				System.out.println();
				System.out.print("Enter number of passengers 1 or 2: ");
				input1 = scan.nextInt();
				for (int i=1; i<=input1; i++)
				{
					System.out.println();
					System.out.println("========Going to Mars!========");
					System.out.println(moves);
					System.out.print("Enter choice " + i + ": ");
					input = scan.nextInt();
					
					if(input == 1) {
						s1.population.add(man);
						earth.population.remove(man);
					}
					else if(input == 2) {
						s1.population.add(woman);
						earth.population.remove(woman);
					}
					else if(input == 3) {
						s1.population.add(l1);
						earth.population.remove(l1);
					}
					else if(input == 4) {
						s1.population.add(c1);
						earth.population.remove(c1);
					}
					else if(input == 5) {
						s1.population.add(g1);
						earth.population.remove(g1);
					}
	
					System.out.println("Earth" + earth.getPopulation());
					System.out.println("spaceship before mars" + s1.getPopulation());
					System.out.println("Mars" + mars.getPopulation());
				}
				
					for (int i=0; i<=s1.getPopulation().size(); i++)
					{
						mars.population.add(s1.population.get(0));
						s1.population.remove(0);
		
						System.out.println("Earth" + earth.getPopulation());
						System.out.println("spaceship after mars" + s1.getPopulation());
						System.out.println("Mars" + mars.getPopulation());
					}
					moves = 1;
					System.out.println(moves + "Earth");
					earth.check().equals("valid");
					
					if(earth.population.size() == 0) {
						System.out.println();
						System.out.println("YOU WIN!");
						System.exit(1);
					}
					
					if (!(earth.check().equals("valid")))
					{
						System.out.println();
						System.out.println("GAME OVER!");
						System.exit(1);
					}
			
				}
				//mars to earth
			if(moves == 1){
				System.out.println();
				System.out.print("Enter number of passengers 1 or 2: ");
				input1 = scan.nextInt();
				for (int i=1; i<=input1; i++)
				{
					System.out.println();
					System.out.println("========Going to Earth!========");
					System.out.print("Enter choice " + i + ": ");
					input = scan.nextInt();
					
					if(input == 1) {
						s1.population.add(man);
						mars.population.remove(man);
					}
					else if(input == 2) {
						s1.population.add(woman);
						mars.population.remove(woman);
					}
					else if(input == 3) {
						s1.population.add(l1);
						mars.population.remove(l1);
					}
					else if(input == 4) {
						s1.population.add(c1);
						mars.population.remove(c1);
					}
					else if(input == 5) {
						s1.population.add(g1);
						mars.population.remove(g1);
					}

					System.out.println("Earth" + earth.getPopulation());
					System.out.println("spaceship after mars" + s1.getPopulation());
					System.out.println("Mars" + mars.getPopulation());
				}
				
					for (int i=0; i<=s1.getPopulation().size(); i++)
					{
						earth.population.add(s1.population.get(0));
						s1.population.remove(0);
		
						System.out.println("Earth" + earth.getPopulation());
						System.out.println("spaceship after mars" + s1.getPopulation());
						System.out.println("Mars" + mars.getPopulation());
					}
					moves = 0;
					System.out.println(moves + "Mars");
					mars.check().equals("valid");
					
					if (!(mars.check().equals("valid")))
					{
						System.out.println();
						System.out.println("GAME OVER!");
						System.exit(1);
					}
			}
			
		}

	}
}
