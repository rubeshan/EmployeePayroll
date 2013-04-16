import java.util.Random;

class Company {
	int lengthOfYear;
	int currentDay;
	int numberOfEmployees;
	int profit;
	private Employee[] employee;
	
	private  static int ClerkVacation;
	private  static int DirectorVacation;
	private  static int ClerkSalary;
	private  static int DirectorSalary;
	private  static double SalaryIncrease;

public Company(int max, int year, int CV, int DV, int CS, int DS, double SI){
	
	numberOfEmployees=0;
	employee=new Employee[max];
	lengthOfYear=year;
	profit=0;
	currentDay=0;
	ClerkVacation 	=	CV;
	DirectorVacation=	DV;
	ClerkSalary		=	CS;
	DirectorSalary	=	DS;
	SalaryIncrease	=	SI;
}

public void employClerk(int i, Random random){
		int age = 25+random.nextInt(20);
		int birthDay = random.nextInt(lengthOfYear);
	    int salary = (ClerkSalary + random.nextInt(ClerkSalary)) / 2;
		int vacation =   ClerkVacation * (lengthOfYear - currentDay) / lengthOfYear;
	    employee[i] = new Clerk(age, birthDay, salary, vacation);
	    System.out.println("Created clerk: " + i + ", " + employee[i]);
}
	
public void addClerk(Random random){
	this.employClerk(numberOfEmployees, random);
	numberOfEmployees++;
}

public void employDirector(int i, Random random){
	int age = 25+random.nextInt(20);
	int birthDay = random.nextInt(lengthOfYear);
	int salary = (DirectorSalary + 3*random.nextInt(DirectorSalary))/4;
	 double gratification = random.nextDouble() * 0.10;
	 int vacation =   DirectorVacation * (lengthOfYear - currentDay) / lengthOfYear;
	    employee[i] = new Director(age, birthDay, salary, vacation, gratification);
	    System.out.println("Created director: " + i + ", " + employee[i]);
}

public void addDirector(Random random){
  this.employDirector(numberOfEmployees, random);
  numberOfEmployees++; 
}

public void dayStep(Random random){
  currentDay++;

  /* Test whether salaries must be paid out */
  if (currentDay % (lengthOfYear / 4) == 0){
    System.out.println("End of quarter, paying salaries");
    for (int i = 0; i < numberOfEmployees; i++)
      employee[i].paySalary(i);
  }

  /* Test for end of the year */
  if (currentDay % lengthOfYear == 0){
    currentDay = 0;
    profit = random.nextInt(10000000);
    System.out.println("End of year, profit is " + profit);
    for (int i = 0; i < numberOfEmployees; i++)
      if (employee[i] instanceof Director){
        employee[i].addVacationDays(DirectorVacation);
        ((Director) employee[i]).payGratification(i, profit);
      }
      else{
        employee[i].addVacationDays(ClerkVacation);
        ((Clerk) employee[i]).resetIllDays();
      }
  }

  /* Test Birthdays and Retirement */
  for (int i = 0; i < numberOfEmployees; i++){
    if (employee[i].checkBirthDay(currentDay)){
      System.out.println("Employee[" + i + "] has birthday!");
      if (employee[i].checkRetirement()){
        System.out.println("Employee[" + i + "] retires!");
        if (employee[i] instanceof Director)
          this.employDirector(i, random);
        else
          this.employClerk(i, random);
      }
      else /* Not retiring */
        employee[i].increaseSalary(SalaryIncrease);
    }
  }

  /* What are we doing today? */
  for (int i = 0; i < numberOfEmployees; i++)
    if (random.nextDouble() < 0.07){    	
      System.out.println("Employee[" + i + "] is ill today!");
      if (employee[i] instanceof Clerk) {
        ((Clerk) employee[i]).addIllDays();
        if (((Clerk) employee[i]).getIllDays() > 0.10 * lengthOfYear) {
          System.out.println("Employee[" + i + "] is fired!");
          this.employClerk(i, random);
        }
      }
    }
    else if (random.nextDouble() < 0.10)
      if (employee[i].takeVacationDay())
        System.out.println("Employee[" + i + "] takes free today!");
      else
        System.out.println("Employee[" + i + "] must work, no vacation days left!");
}



}