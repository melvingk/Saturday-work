
public class salaryReport {
	
	public static void main(String[] args) {
		
		float N;
		Accounts A= new Accounts();
		try
		{
			N= A.netSalary(1000, 1);
		}
		catch(AbsentException E)
		{
			System.out.println("shittt!!! you lost out on money my guy");
			N = 0;
		}
		System.out.println(N);
	}

}
