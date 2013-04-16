
class Clerk extends Employee {
private int illDays;
public Clerk(int a, int b, int s, int v){
	super(a,b,s,v);
	illDays=0;
}

public void resetIllDays(){
	illDays=0;
}

public void addIllDays(){
	illDays++;
}

public int getIllDays(){
	return illDays;
}

public String toString(){
	return super.toString()+", illDays = "+illDays;
}

}
