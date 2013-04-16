import java.util.Random;

public class CompanyTest {
	public static int Directors;
	public static int Clerks;
	public static int Year;
	public static int Days;
	public static int Max;
	private  static int ClerkVacation;
	private  static int DirectorVacation;
	private  static int ClerkSalary;
	private  static int DirectorSalary;
	private  static double SalaryIncrease;

	public CompanyTest(int Di, int Cl, int Ye, int Da, int Ma, int CV, int DV, int CS, int DS, double SI) {
		Directors = Di;
		Clerks = Cl;
		Year = Ye;
		Days = Da;
		Max = Ma;
		ClerkVacation 	=	CV;
		DirectorVacation=	DV;
		ClerkSalary		=	CS;
		DirectorSalary	=	DS;
		SalaryIncrease	=	SI;
	}

	public static void testing() {
		Random random = new Random();
		int cv = ClerkVacation, dv = DirectorVacation, cs = ClerkSalary, ds = DirectorSalary; double si = SalaryIncrease;
		Company company = new Company(Max, Year, cv, dv, cs, ds, si);

		for (int i = 0; i < Directors; i++)
			company.addDirector(random);
		for (int i = 0; i < Clerks; i++)
			company.addClerk(random);
		for (int i = 0; i < Days; i++)
			company.dayStep(random);
	}

	public static void main(String args[]) {
		Layout layout = new Layout();
		testing();
	}

}
