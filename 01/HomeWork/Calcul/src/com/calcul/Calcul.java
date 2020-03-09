package com.calcul;

import java.util.Scanner;

public class Calcul {
	public static void main(String[] args) {

		
		System.out.println("Программа предназначена для проведения выбранной"
				+ " операции над двумя введёнными числами. Для начала введите"
				+ " желаемое действие (+, -, *, /, div, mod или ^):");
		var scanner = new Scanner(System.in);
		var vvod = scanner.nextLine();
		var znak = vvod.replaceAll(" ", "");
		while ((znak.equals("+")== false) && (znak.equals("-")== false)
				&& (znak.equals("*")== false) && (znak.equals("/"))== false
				&& (znak.equals("div")== false) && (znak.equals("mod")== false) 
				&& (znak.equals("^")== false)) {
			System.out.println("Некорректный ввод. Набор допустимых символов описан"
				+ " выше, повторите попытку.");
			vvod = scanner.nextLine();
			znak = vvod.replaceAll(" ", "");
		}

		
		System.out.println("Введите число, которое будет являться первым слагаемым,"
				+ " уменьшаемым, превым множителем, делимым или основанием степени," 
				+ " соответственно:");
		var pervoe = scanner.nextInt();
		System.out.println("Теперь введите второе число:");
		var vtoroe = scanner.nextInt();

		
		switch (znak) {
		case "+": {
			System.out.println("Результат суммы:");
			System.out.println(pervoe + vtoroe);
			break;
		}
		case "-": {
			System.out.println("Результат разности:");
			System.out.println(pervoe - vtoroe);
			break;
		}
		case "*": {
			System.out.println("Результат умножения:");
			System.out.println(pervoe * vtoroe);
			break;
		}
		case "/": {
			if (vtoroe == 0) {
				System.out.println("На ноль делить нельзя!");
				break;
			}
			System.out.println("Результат общего деления:");
			System.out.println((float) pervoe / vtoroe);
			break;
		}
		case "div": {
			if (vtoroe == 0) {
				System.out.println("На ноль делить нельзя!");
				break;
			}
			System.out.println("Результат деления с выводом только целой части:");
			System.out.println(pervoe / vtoroe);
			break;
		}
		case "mod": {
			if (vtoroe == 0) {
				System.out.println("На ноль делить нельзя!");
				break;
			}
			System.out.println("Результат деления с выводом только остатка:");
			System.out.println(pervoe % vtoroe);
			break;
		}
		case "^": {
			float result = 1;
			short minus = 0;
			System.out.println("Результат возведения в степень:");
			if (vtoroe == 0) {
				System.out.println(result);
			} else if ((vtoroe < 0) && (pervoe == 0)) {
				System.out.println(
						"Получить невозможно, так как в ходе выполнения "
						+ "операции производится недопустимое деление на ноль.");
				break;
			} else if (vtoroe < 0) {
				vtoroe = vtoroe * (-1);
				minus = 1;
			}
			while (vtoroe != 0) {
				vtoroe -= 1;
				result *= pervoe;
			}
			if (minus == 1) {
				result = 1 / result;
			}
			System.out.println(result);
			break;
		}
		}
	}
}
