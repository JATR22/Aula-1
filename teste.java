public class Teste {
	public static void main(String[] args) 
	{
	System.out.println("Escreva um programa que peça ao utilizador dois números inteiros.");
	
	Scanner consola = new Scanner(System.in);
	System.out.println("Escreva dois números inteiros. ");
	int maiorNumero = consola.nextInt();
	
	
	System.out.println("Escreva o seu primeiro número:");
	Scanner in = new Scanner(System.in);
	int numero = in.nextInt();
	System.out.println("Escreva o seu segundo número:");
	Scanner in2 = new Scanner(System.in);
	int numero2 = in2.nextInt();
	
	if (numero>numero2)
	{
		System.out.println("O número maior é:" + numero);
	}
	else
	{
		System.out.println("O número maior é:" + numero2);
		if (numero==numero2)
		{
		System.out.println();
		in. close();
		in2.close();
		}
		else 
		{
		System.out.println("O número maior é:" + numero2);
		}
		for (int i = 0; i <= maiorNumero; i++)
		{
		System.out.println(i);
		}
        System.out.println(Alteração
        
        ç,lç mçl,mçl);
	consola.close();
		}
	}
}

