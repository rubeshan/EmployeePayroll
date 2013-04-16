
public class Employee {

	private int age;
	private int birthDay;
	private int salary;
	private int vacationDays;
	
	public Employee(int a, int b, int s, int v){
		age=a;
		birthDay=b;
		salary=s;
		vacationDays=v;
		
	}
	public void increaseSalary(double salaryIncrease){
		salary*=(1+salaryIncrease);
	}
	
	public boolean takeVacationDay(){
		if(vacationDays>0){
			vacationDays--;
			return true;
		}
		else return false;
	}
	
	public void addVacationDays(int days){
		vacationDays/=2+days;
	}
	
	public boolean checkBirthDay(int CurrentDay){
		if(birthDay==CurrentDay){
			age++;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean checkRetirement(){
		if(age>65){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void paySalary(int i){
		System.out.println("the employee ["+i+"] gets paid "+salary);
	}
	public String toString(){
		return "age = "+age+", birthDay = "+birthDay+", salaray = "+salary+", days = "+vacationDays;
		
	}
}
