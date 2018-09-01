
public class StringProcessing {

	public void wordcount(String msg) {
		int word=0;
		for (int i=0; i<msg.length(); i++)
		{
			String alpha= msg.substring(i, i+1);
			if (alpha.equals(" "))
			{
				word++;
			}
		}

		System.out.println(" Words: " + (word+1));
	}
	
	public void printning1(String msg) {
		for (int i=0; i<msg.length(); i++)
		{
			String alpha= msg.substring(i, i+1);
			if (alpha.equals(" "))
			{
				System.out.println();
			}else 
			{
				System.out.print(msg.substring(i,i+1));
			}
		}
	}
	
	public void printning2(String msg1) {
		
		String out ="";
		
		for (int i=msg1.length()-1; i>=0; i--)
		{
			String alpha= msg1.substring(i, i+1);
			if (alpha.equals(" "))
			{
				System.out.println(out);
				out = "";
			}else 
			{
				out = msg1.substring(i,i+1) + out;
			}
		} System.out.println(out);
}
}
