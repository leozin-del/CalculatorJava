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
	                System.out.print("Insira o primeiro número que deseja calcular: ");
	                numero1 = sc.nextDouble();
	                break; // Saia do loop se a entrada for válida
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um valor válido.");
	                sc.next(); // Limpe o buffer de entrada
	            }
	        }

	        while (true) {
	            try {
	                System.out.print("Insira o segundo número que deseja calcular: ");
	                numero2 = sc.nextDouble();
	                break; // Saia do loop se a entrada for válida
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, insira um valor válido.");
	                sc.next(); // Limpe o buffer de entrada
	            }
	        }

	        System.out.println("Escolha uma operação matemática para fazer com esses dois números dentre (adição, subtração, multiplicação, divisão)");

	        String operacao = sc.next();
	        Double resultado = 0.0;

	        if (operacao.equalsIgnoreCase("Adicao")) {
	            resultado = numero1 + numero2;
	            System.out.println("Resultado da Adição: " + resultado);
	        } else if (operacao.equalsIgnoreCase("subtracao")) {
	            resultado = numero1 - numero2;
	            System.out.println("Resultado da Subtração: " + resultado);
	        } else if (operacao.equalsIgnoreCase("multiplicao")) {
	            resultado = numero1 * numero2;
	            System.out.println("Resultado da Multiplicação: " + resultado);
	        } else if (operacao.equalsIgnoreCase("divisao")) {
	            if (numero2 != 0) {
	                resultado = numero1 / numero2;
	                System.out.println("Resultado da Divisão: " + resultado);
	            } else {
	                System.out.println("Não é possível dividir por zero.");
	            }
	        } else {
	            System.out.println("Operação inválida.");
	        }

	        sc.close();
	    }
	}
