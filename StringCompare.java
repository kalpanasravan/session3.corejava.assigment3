
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s1 = new sample();
		s1.display();
		

	}

}

class sample
{
	String myName1,myName2;
	
	
	sample()
	{
		myName1= new String("kalpana");
		myName2= new String("kalpana");
		
	}
	
	
	void display()
	{
		if(myName1.equals(myName2))
		{
			System.out.println("True");
		}
	
		else
		{
			System.out.println("false");
		}
	
	}
}