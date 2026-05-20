class  nested6
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.println(i);
			}
			if(i!=9)
				System.out.println(",");
			else
					System.out.println(".");
		}
	}
}
