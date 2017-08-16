package fieldoverriding2;

public class FieldOverriding2 {
public static void main(String[] args){
	Son c1=new Son();
	System.out.println(c1.me);
	Dad c2=new Dad();
	System.out.println(c2.me);
	Dad c3=new Son();
	System.out.println("field"); 
	new Son().printMe();
	c1.printMe();
	c1.print();
	c2.printMe();
}
}
