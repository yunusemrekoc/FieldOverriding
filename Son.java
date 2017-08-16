package fieldoverriding2;

public class Son extends Dad{
	String me="son";
public void print(){
	System.out.println(super.me);
	super.me="son";
	System.out.println(super.me);
	System.out.println(this.me);
}
}

	

