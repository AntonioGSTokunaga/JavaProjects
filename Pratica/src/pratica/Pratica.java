package pratica;

import java.util.Scanner;
import java.util.Locale;

public class Pratica {

    public static void main(String[] args) {
        //estrutura sequencial
        /*int num1, num2, soma;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
            num1 = entrada.nextInt();
            
        System.out.println("Informe um outro numero: ");
            num2 = entrada.nextInt();
            soma = num1 + num2;
            
        System.out.println("A soma e: "+ soma);
        
        
        //Resolução
        /*Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close(); //fecha o onjeto sc*/
        
        
        /*Float
        r, areaCirculo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
            r = sc.nextFloat
        ();
        
        areaCirculo = Math.PI * r * r;
        
        System.out.println("A Area do círculo é: "+ areaCirculo);

        //resolução
        /*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Float
        R, A, pi = 3.14159;
	    
	    R = sc.nextFloat
        ();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();*/
        
        /*int a, b, c, d, diferenca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
            a = sc.nextInt();
        System.out.println("Informe um segundo número");
            b = sc.nextInt();
        System.out.println("Informe um terceiro número");
            c = sc.nextInt();
        System.out.println("Informe um quarto número");
            d = sc.nextInt();
        
            diferenca = a*b - c*d;
            
            System.out.println("A diferença é: "+ diferenca);
         
        
        //resolucao
        /*Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();*/
        
        /*Float
                n, h, v, s;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu ID: ");
        n = sc.nextFloat
        ();
        
        System.out.println("Escreva o seu número de horas trabalhadas: ");
        h = sc.nextFloat
        ();
        
        System.out.println("Digite o valor que recebe por hora: ");
        v = sc.nextFloat
        ();
        
        s = h * v;
        System.out.println("ID: "+ n);
        System.out.printf("SalArio: ", s);
        
        
        //correção
        /*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    Float
        valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextFloat
        ();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ ", salario);
		
		sc.close();*/
        
        
        /*Scanner sc = new Scanner(System.in);
        double c1, n1, p1, c2, n2, p2, v;
        
        System.out.println("Digite o código do item: ");
        c1 = sc.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        n1 = sc.nextDouble();
        
        System.out.println("Informe o valor unitArio: ");
        p1 = sc.nextDouble();
        
        System.out.println("Digite o código do outro item: ");
        c2 = sc.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        n2 = sc.nextDouble();
        
        System.out.println("Informe o valor unitArio: ");
        p2 = sc.nextDouble();
        
        v = n1 * p1 + n2 * p2;
        
        System.out.printf("Valor total a pagar: R$ ", v);
        
        //correção

        /*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ ", total);
		
		sc.close();*/
        
        /*Scanner sc = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        
        System.out.println("Informe um valor numerico A: ");
        A = sc.nextDouble();
        
        System.out.println("Informe um valor B: ");
        B = sc.nextDouble();
        
        System.out.println("Informe um valor C: ");
        C = sc.nextDouble();
        
        triangulo = (A * C) / 2;
        circulo = Math.PI * C * C;
        trapezio = ((A + B) * C)/2;
        quadrado = B * B;
        retangulo = A * B;
        
        System.out.printf("Area do triangulo com base A e altura C: %.3f%n", triangulo);
        System.out.printf("Area do circulo com raio C: %.3f%n", circulo);
        System.out.printf("Area do trapezio com bases A e B e com altura C: %.3f%n", trapezio);
        System.out.printf("Area do quadrado com lado B: %.3f%n", quadrado);
        System.out.printf("Area do triangulo com lados A e B: %.3f%n", retangulo);

        //correção
        
        /*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();*/
        
        //estrutura condicional
        
        /*Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero: ");
        x = sc.nextInt();
        
        if (x < 0){
            System.out.println("O numero e negativo");
        } else if (x > 0){
            System.out.println("O numero nao e negativo");
        } else {
            System.out.println("O numero e nulo");
        }

        //correção
        
        /*Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();*/
        
        /*Scanner sc = new Scanner(System.in);
        int x;
        
        System.out.println("Informe um numero: ");
        x = sc.nextInt();
        
        if (x % 2 == 0){
            System.out.println("O numero e par");
        } else {
            System.out.println("O numero e impar");
        }
        
        //correção

        /*Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();*/
        

        /*Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        
        System.out.println("Digite outro numero: ");
        b = sc.nextInt();
        
        if (a % b == 0 || b % a == 0){
            System.out.println("Os numeros sao multiplos");
        } else {
            System.out.println("Os numeros nao sao multiplos");
        }

        //correção

        /*Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();*/
        
        /*Scanner sc = new Scanner(System.in);
        int hi, hf, duracao;
        
        System.out.println("Informe a hora inicial: ");
        hi = sc.nextInt();
        
        System.out.println("Informe a hora final: ");
        hf = sc.nextInt();
        
        if (hi < hf){
            duracao = hf - hi;
            System.out.println("O jogo durou "+ duracao + " horas");
        } else {
            duracao = 24 - hi + hf;
            System.out.println("O jogo durou "+ duracao + " horas");
        }
        
        //correção
        /*Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();*/
        
        
        Scanner sc = new Scanner(System.in);
        int codigo, qtde;
        double preco;
        
        System.out.println("""
                           Informe um codigo:
                           1 - Cachorro quente
                           2 - X-salada
                           3 - X-bacon
                           4 - Torrada simples
                           5 - Refrigerante
                           """);
        codigo = sc.nextInt();
        
        System.out.println("Informe a quantidade: ");
        qtde = sc.nextInt();
        
        switch (codigo) {

            case 1:
                
                preco = qtde * 4.00;
                System.out.println("Sao "+ qtde + " cachorro(s) quente(s) e custam ao todo R$ "+ preco);
                break;
                
            case 2:
                
                preco = qtde * 4.50;
                System.out.println("Sao "+ qtde + " x-salada e custam ao todo R$ "+ preco);
                break;
                
            case 3:
                
                preco = qtde * 5.00;
                System.out.println("Sao "+ qtde + " x-bacon e custam ao todo R$ "+ preco);
                break;
                
            case 4:
                
                preco = qtde * 2.00;
                System.out.println("Sao "+ qtde + " torrada(s) simples e custam ao todo R$ "+ preco);
                break;
                
            case 5:
                
                preco = qtde * 1.50;
                System.out.println("Sao "+ qtde + " refrigerante(s) e custam ao todo R$ "+ preco);
                break;
                
            default:
                System.out.println("Codigo invalido.");
                break;
        } 
    }
    
}
