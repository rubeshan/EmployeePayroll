
class Director extends Employee{
private double gratification;

public Director(int a, int b, int s, int v, double g){
	super(a,b,s,v);
	gratification=g;
}

public void payGratification(int i, int profit){
	System.out.println("Paying " + (int) (profit * gratification) + " gratification to employee[" + i +"]");	 
}

public String toString(){
	return super.toString()+",gratification = "+gratification;
}
}
