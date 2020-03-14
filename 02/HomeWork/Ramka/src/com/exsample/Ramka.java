package com.exsample;

import java.util.Scanner;

public class Ramka {

	public static void main(String[] args) {

		
		System.out.println("Программа предназначена для рисования рамки"
				 + " вокруг текстовой строки. Дли начала введите длину рамки:");
		var Scanner = new Scanner(System.in);
		var Dlina = Scanner.nextInt();
		System.out.println("Теперь введите ширину (высоту) рамки:");
		var Visota = Scanner.nextInt();
		var VspomVisota = Visota;
		var VspomDlina = Dlina;
		var Kursor = 1;
		System.out.println("Введите слово, которое должно поместиться в "
				+ "заданную рамку (в наборе символов, разделённых пробелами, будет"
				+ " учтена только часть до первого пробела):");
		var PreSlovo = Scanner.next();
		var Slovo = PreSlovo.replaceAll(" ", "");
		var Length = Slovo.length();

		
		if ((Visota < 3) || (Length > Dlina - 2)) {
			System.out.println("Введённое слово не поместится в такую узкую рамку.");
		} else {
			System.out.println(
					"Слово центрировано с приоритетом по строке вправо" 
			+ " и по высоте вверх. Полученная рамка:");
			while (VspomDlina > 0) {
				System.out.print("*");
				VspomDlina -= 1;
			}
			VspomDlina = Dlina;
			while (VspomVisota > 2) {
				VspomVisota -= 1;
				System.out.print("\n*");
				if (VspomVisota == Visota / 2 + 1) {
					if (Dlina % 2 == 0) {
						if (Length % 2 == 1) {
							Kursor -= 1;
							Length += 1;
						}
						if ((Kursor == ((Dlina - Length) / 2))) {
							System.out.print(Slovo);
							Kursor += Length;
						}
						while (Kursor < Dlina - 1) {
							Kursor += 1;
							System.out.print(" ");
							if ((Kursor == ((Dlina - Length) / 2))) {
								System.out.print(Slovo);
								Kursor += Length;
							}
						}
					} else {
						if ((Length % 2 == 0) || (Length != 1)) {
							Kursor -= 1;
							Length += 1;
						}
						if ((Kursor == ((Dlina - Length) / 2))) {
							System.out.print(Slovo);
							Kursor += Length;
						}
						while (Kursor < Dlina - 1) {
							Kursor += 1;
							System.out.print(" ");
							if ((Kursor == ((Dlina - Length) / 2))) {
								System.out.print(Slovo);
								Kursor += Length;
							}
						}
					}
				} else {
					VspomDlina = Dlina;
					while (VspomDlina > 2) {
						System.out.print(" ");
						VspomDlina -= 1;
					}
				}
				System.out.print("*");
			}
			VspomDlina = Dlina;
			System.out.print("\n*");
			while (VspomDlina > 1) {
				System.out.print("*");
				VspomDlina -= 1;
			}
		}
	}
}