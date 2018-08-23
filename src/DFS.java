import java.util.ArrayList;

public class DFS {
	static String earth = "MWLCG-";
	static String mars = "______-";
	static ArrayList<String> solutions = new ArrayList();
	
	public static ArrayList<String> getSolutions() {
		return solutions;
	}
	
	public static void main(String[] args) {
		solve(earth,mars,'-','-', true,"",1);
	}
	
	public static void solve(String currPlanet, String prevPlanet, char passA, char passB, Boolean onEarth, String empty, int count) {
		String current = currPlanet;
		String previous = prevPlanet;
		//leaving the planet
		if(passA!='-')
			previous = previous.replaceFirst(""+passA, "_");
		if(passB!='-')
			previous = previous.replaceFirst(""+passB, "_");
		//when arriving
		if(passA!='-')
			current = current.replaceFirst("_",""+passA);
		if(passB!='-')
			current = current.replaceFirst("_",""+passB);
		if(onEarth==false && current.contains("M") && current.contains("W") && current.contains("L") && current.contains("C") && current.contains("G")) {
			if(!(solutions.contains(empty+"END"))) {
				solutions.add(empty+"END");
				System.out.println(empty+"END");
			}
		}
		else if(count>7) {
			System.out.print("");
		}
		else if(previous.contains("M") && previous.contains("L")) {
			System.out.print("");
		}
		else if(previous.contains("W") && previous.contains("L")) {
			System.out.print("");
		}
		else if(previous.contains("C") && previous.contains("L")) {
			System.out.print("");
		}
		else if(previous.contains("C") && previous.contains("G")) {
			System.out.print("");
		}
		else if(previous.contains("M") && previous.contains("C")) {
			System.out.print("");
		}
		else if(previous.contains("F") && previous.contains("C")) {
			System.out.print("");
		}
		else if(count<=7) {
			for(int i=0;i<current.length()-1;i++) {
				for(int j=i+1;j<current.length();j++) {
					if((current.charAt(i)!='_' && current.charAt(j)!='_') && !((current.charAt(i)+""+current.charAt(j)).equals(passA+""+passB))) {
						if((current.charAt(i)=='M') && current.charAt(j)=='W'||current.charAt(i)=='W' && current.charAt(j)=='M' || current.charAt(i)!='M'&& current.charAt(i)!='W') {
							solve(previous,current,current.charAt(i),current.charAt(j),!(onEarth),empty+(current.charAt(i)+""+current.charAt(j))+">",count+1);
						}
					}
				}
			}
		}
	}
}

