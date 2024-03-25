
package aula2allex;

import java.util.Scanner;

public class Aula2AllEx {


    public static void main(String[] args) {
        //exercício 1: Conversão de R$ (real) para U$ (dólar):
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em Reais:");
        double reais = scanner.nextDouble();
        System.out.println("Digite a taxa de câmbio atual (quantos reais vale 1 dólar):");
        double taxaCambio = scanner.nextDouble();
        double dolares = reais / taxaCambio;
        System.out.println("O valor em dólares é: " + dolares);*/
        
        //exercício 2: Conversão de U$ (dólar) para R$ (real):
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em Dólares:");
        double dolares = scanner.nextDouble();
        System.out.println("Digite a taxa de câmbio atual (quantos reais vale 1 dólar):");
        double taxaCambio = scanner.nextDouble();
        double reais = dolares * taxaCambio;
        System.out.println("O valor em reais é: " + reais);*/
        
        //exercício 3: Verificar se um número é par ou ímpar:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }*/
        
        //exercício 4: Verificar se um número é positivo ou negativo:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
             System.out.println("O número é nulo");
        }*/
        
        //exercício 5: Conversão de temperatura em Fahrenheit para Celsius:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("A temperatura em Celsius é: " + celsius);*/
        
        //exercício 6: Trocar os valores de duas variáveis:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int A = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int B = scanner.nextInt();
        int temp = A;
        A = B;
        B = temp;
        System.out.println("Agora, o valor de A é: " + A + ", e o valor de B é: " + B);*/
        
        //exercício 7: Verificar se um número é primo:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        boolean primo = true;

        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }*/
        
        //exercício 8: Calcular a área de diferentes formas:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de forma (1 para quadrado, 2 para círculo, 3 para triângulo):");
        int tipo = scanner.nextInt();
        switch (tipo) {
            case 1: // Quadrado
                System.out.println("Digite o lado do quadrado:");
                double lado = scanner.nextDouble();
                if (lado <= 0) {
                    System.out.println("O lado deve ser maior que zero.");
                    break;
                }
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            case 2: // Círculo
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                if (raio <= 0) {
                    System.out.println("O raio deve ser maior que zero.");
                    break;
                }
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            case 3: // Triângulo
                System.out.println("Digite a base do triângulo:");
                double base = scanner.nextDouble();
                if (base <= 0) {
                    System.out.println("A base deve ser maior que zero.");
                    break;
                }
                System.out.println("Digite a altura do triângulo:");
                double altura = scanner.nextDouble();
                if (altura <= 0) {
                    System.out.println("A altura deve ser maior que zero.");
                    break;
                }
                double areaTriangulo = (base * altura) / 2;
                System.out.println("A área do triângulo é: " + areaTriangulo);
                break;
            default:
                System.out.println("Tipo de forma inválido");
        }*/
        
        //exercício 9: Verificação de senhas:
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Crie sua senha:");
        String senhaCorreta = scanner.nextLine();
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();
            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Senha incorreta. Você tem " + tentativas + " tentativas restantes.");
                } else {
                    System.out.println("Senha incorreta. Você esgotou suas tentativas.");
                }
            }
        }*/
        
        //exercício 10
        //A diferença entre as estruturas de repetição while e
        //do ... while é que while verifica a condição antes de executar o bloco de código,
        //enquanto do ... while executa o bloco de código pelo menos uma vez 
        //e depois verifica a condição.
        
        //exercício 11
        //A diferença entre os incrementos ++i e i++ é que 
        //++i incrementa o valor de i e depois retorna i, 
        //enquanto i++ retorna i e depois incrementa o valor de i.
        
        //exercício 12: Cálculo do mínimo múltiplo comum (m.m.c.) de dois valores inteiros:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = scanner.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("O MMC de " + num1 + " e " + num2 + " é 0");
        } else {
            int mmc = num1 > num2 ? num1 : num2;
            while (true) {
                if (mmc % num1 == 0 && mmc % num2 == 0) {
                    System.out.println("O MMC de " + num1 + " e " + num2 + " é " + mmc);
                    break;
                }
                mmc++;
            }
        }

    }  

} 

