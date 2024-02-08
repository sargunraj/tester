package Child;
import Warning.Single;
public class Parent extends Single  {
public void you () {
	System.out.println("You");
	
}
public static void main(String[] args) {
	Parent s = new Parent();
	s.you();
	s.Shift();
	s.tap();
	
	
}
}

