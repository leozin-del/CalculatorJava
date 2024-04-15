package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Double numero1 = null;
	        Double numero2 = null;

	        while (true) {
	            try {
	                System.out.print("Insira o primeiro n�mero que deseja calcular: ");
	                numero1 = sc.nextDouble();
	                break; // Saia do loop se a entrada for v�lida
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um valor v�lido.");
	                sc.next(); // Limpe o buffer de entrada
	            }
	        }

	        while (true) {
	            try {
	                System.out.print("Insira o segundo n�mero que deseja calcular: ");
	                numero2 = sc.nextDouble();
	                break; // Saia do loop se a entrada for v�lida
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um valor v�lido.");
	                sc.next(); // Limpe o buffer de entrada
	            }
	        }

	        System.out.println("Escolha uma opera��o matem�tica para fazer com esses dois n�meros dentre (adi��o, subtra��o, multiplica��o, divis�o)");

	        String operacao = sc.next();
	        Double resultado = 0.0;

	        if (operacao.equalsIgnoreCase("Adicao")) {
	            resultado = numero1 + numero2;
	            System.out.println("Resultado da Adi��o: " + resultado);
	        } else if (operacao.equalsIgnoreCase("subtracao")) {
	            resultado = numero1 - numero2;
	            System.out.println("Resultado da Subtra��o: " + resultado);
	        } else if (operacao.equalsIgnoreCase("multiplicao")) {
	            resultado = numero1 * numero2;
	            System.out.println("Resultado da Multiplica��o: " + resultado);
	        } else if (operacao.equalsIgnoreCase("divisao")) {
	            if (numero2 != 0) {
	                resultado = numero1 / numero2;
	                System.out.println("Resultado da Divis�o: " + resultado);
	            } else {
	                System.out.println("N�o � poss�vel dividir por zero.");
	            }
	        } else {
	            System.out.println("Opera��o inv�lida.");
	        }

	        sc.close();
	    }
	}
