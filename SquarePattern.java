/*
1		8		9			16
2		7		10		15
3		6      11		14
4		5		12		13
*/
class  SquarePattern
{
	public static void main(String[] args) 
	{
		int num= 16;
		for (int i=1;i<=num ;i++ )
		{
			for (int j=1;j<=num-1 ; j++)		//for space
			{
				System.out.print(num+" ");
			}
			System.out.println();
	}
	}	
}
