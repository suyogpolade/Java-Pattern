class Pattern3 
{
	public static void main(String[] args) 
	{
	int num=8;
	for (int i=0;i<num ;i++ )
	{
		/*for (int space=0;space<i ;space++ )
		{
			System.out.print(" ");
		}*/
		for (int star=0;star<num-i; star++)
		{
				System.out.print("* ");
		}
		System.out.println();
	}
	}
}
