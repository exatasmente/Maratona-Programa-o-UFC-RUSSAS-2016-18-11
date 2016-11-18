package desafio1;

import java.util.Scanner;

public class desafio1 {
	
	public static void main(String[] args)
	{
		double altura;
		double angulo, rad;
		Scanner entrada = new Scanner(System.in);
		altura = entrada.nextInt();
		angulo = entrada.nextDouble();
		rad = Math.cos(angulo);
		double tempo = altura/rad;
		if(angulo == 180)
		{
			System.out.println("safe");
		}
		else
			System.out.println((int)tempo);
	}
}
