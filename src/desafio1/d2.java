package desafio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class d2 {
	public static void main(String[] args)
	{
		double media=0;
		double n=0,m=0,s=0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for(int i =0 ; i < n ; i ++)
		{
			m = input.nextDouble() +(m);
			s = input.nextDouble() +(s);
			
			
			
		}
		media = s/(m*60);
				
		if(media <=1)
		{
			System.out.println("measurement error");
			
			
		}else{
			System.out.print(new DecimalFormat("#0.000000000").format(media)+"\n");
		}
	}
}
