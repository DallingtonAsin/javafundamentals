package inheritance;

public class Grandson extends Son{ // subclass of super class Son
	
	public void saySomethingGrandSon() {
		Grandson s = new Grandson();
		System.out.println("Am called a grand son who extends my father's height which is "+s.height);
	}
	
}
