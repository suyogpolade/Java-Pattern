class PatternDiamond 
{
	public static void main(String[] args)
	{
		int num=7;
		for (int i =0;i<num ;i++ )
		{	
			for (int j=0;j<num-i-1;j++)
				System.out.print(" ");
				for ( int k=0;k<=i ;k++ )
					System.out.print("* ");

		System.out.println();
		
		}
		for (int i =0;i<num-1;i++ )
		{	
			for (int j=0;j<i ;j++)
			System.out.print(" ");
				for ( int k=0;  k<(num-i-1) ; k++ )
					System.out.print(" *");
			
		System.out.println();
		}
	}		
	}
