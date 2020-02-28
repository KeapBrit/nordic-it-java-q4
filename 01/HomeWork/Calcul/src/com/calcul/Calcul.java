package com.calcul;

import java.util.Scanner;

public class Calcul {
	public static void main(String[] args) {

		System.out.println("Программа предназначена для проведения выбранной операции"
				+ " над двумя введёнными числами. Для начала введите желаемое действие"
				+ " (+, -, *, /, div, mod или ^):");
		var scanner = new Scanner(System.in);
		var znak = scanner.next();
//		while ((znak != "+") && (znak != "-") && (znak != "*") && (znak != "/") 
//				&& (znak != "div") && (znak != "mod") && (znak != "^")) {
//			System.out.println("Некорректный ввод. Набор допустимых символов описан" + " выше, повторите попытку.");
//			znak = scanner.next();
//		}

		System.out.println("Введите число, которое будет являться первым слагаемым,"
				+ "уменьшаемым, превым множителем, делимым или основанием степени," + " соответственно:");
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
			var step = 0;
			float result = 1;
			float operation = 1;
			System.out.println("Результат возведения в степень:");
			if (step == vtoroe) {
				System.out.println(result);
				break;
			}
			while (vtoroe > step) {
				result = (result * pervoe);
				step = (step + 1);
			}
			if ((vtoroe < step) && (pervoe == 0)) {
				System.out.println(
						"Получить невозможно, так как в ходе выполнения операции производится недопустимое деление на ноль.");
				break;
			}
			while (vtoroe < step) {
				operation = (operation * pervoe);
				result = 1/operation;
				step = (step - 1);
			}
			System.out.println(result);
			break;
		}
		}
	}
}
