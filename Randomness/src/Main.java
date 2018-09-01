
public class Main 
{
public static void main(String[] args) 
{
	
	Circle c= new Circle();
	dodrawing(c);
	
	
	Line l= new Line();
	dodrawing(l);
	
	Circle c1= new Circle();
	dodrawing(c1,c);
	
	
	
}


public static void dodrawing(Draw x) {
	
	x.Drawing();
	
}
public static void dodrawing(Draw x, Draw y) {
	
	x.Drawing();
	y.Drawing();
	
}


}