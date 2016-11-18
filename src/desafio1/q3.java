package desafio1;

import java.util.Scanner;
import java.util.Stack;

public class q3 {

	public static void main(String[] args) {
		int h,w,n,cont=0;
		Stack<Integer> a = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		h =input.nextInt();
		w =input.nextInt();
		n = input.nextInt();
		
		for(int i =0 ;i<n ; i++ )
		{
			a.add(input.nextInt());
		}
		
		
		while(a.isEmpty() != true)
		{
			cont += a.pop();
			if(cont == w*h)
			{
				System.out.println("YES");
				break;
			}
			if(cont > w*h)
			{
				System.out.println("NO");
				break;
			}
			if(a.isEmpty())
			{
				System.out.println("NO");
			break;
			}
		}
		
		
	}

}
