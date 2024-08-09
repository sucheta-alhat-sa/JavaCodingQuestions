package javaPracticeCoding;

public class Tree {

	public static void main(String[] args) {
		String s = "0";
		Yacht y1 = new Yacht();
		Yacht y2 = new RacingBoat();
		RacingBoat rb = new RacingBoat();
		
		if((y1 instanceof Vessel) && (y2 instanceof Toy)) {
			s += "1";
		}
		if((rb instanceof Vessel) && (rb instanceof Toy)) {
			s += "2";
		}
		System.out.println(s);
		

	}

}
