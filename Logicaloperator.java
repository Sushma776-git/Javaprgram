package First;

public class Logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		int gender='M';
		if (age>=18 && gender=='M')
		{
			System.out.println("person 1 is eligible to vote");
		}
		if (age>=18 || gender=='M')
		{
			System.out.println("person2 is eligible to vote");
		}
		if (age>=18 && gender=='F')
		{
			System.out.println("person3 is eligible to vote");
		}
	}

}
