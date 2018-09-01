
public class Accounts 

{

	public float netSalary(int salary, int absenties) throws AbsentException
	{
		float net=0;
	
		if (absenties>=4)
		{
			AbsentException E =new AbsentException();
			throw E;
		}
		else
		{
			net=salary*15/100;
		}
	return net;}
	
	
}
