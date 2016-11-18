package desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		int indMaior=0;
		int maior=0;
		int aux;
		int n;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		n = input.nextInt();
			for(int i =0; i<n; i++)
			{
				resultados.add(input.nextInt());
				
			}
			for(int i =0 ; i < n ; i++)
			{
				aux = resultados.get(i);
				for(int j = i+1 ; j< n; j++)
				{
					if(aux == resultados.get(j))
					{
						for(int k = 0; k<n;k++)
						{
							if(aux == resultados.get(k))
							{
								resultados.set(k, 0);
							}
						}
					}
				}
			}
			for(int i = 0 ; i<n; i++)
			{
				if(resultados.get(i) > maior)
				{
					maior= resultados.get(i); 
					indMaior = i+1;
				}
			}
			if(maior == 0)
				System.out.println("none");
			else
			System.out.println(indMaior);
				
				
	}

}
