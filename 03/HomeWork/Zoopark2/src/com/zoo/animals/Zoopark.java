package com.zoo.animals;

import com.zoo.Animals;
import com.zoo.Rost;
import com.zoo.Vid;

public class Zoopark {

	public static void main(String[] args) {
		var parrot = new Animals();
		var parrot1 = new Animals();
		var parrot2 = new Animals();
		var parrot3 = new Animals();
		var parrotRost = new Rost();
		var parrotRost1 = new Rost();
		var parrotRost2 = new Rost();
		var parrotRost3 = new Rost();
		var parrotVid = new Vid();
		var parrotVid1 = new Vid();
		var parrotVid2 = new Vid();
		var parrotVid3 = new Vid();

		
		parrot.name = "Тупохвост";
		parrotRost.rost = 34;
		parrotVid.vid = "Жако";
		System.out.print("Рост в см попугая по имени " + parrot.getName() + " - " 
				+ parrotRost.getRost() + ". Его вид - " + parrotVid.getVid() 
				+ ". Кажется, он хочет сделать что-то...\n" + parrot.getName());
		parrotVid.move();
		System.out.print(parrotVid.getVid() + " " + parrot.getName());
		parrotRost.srok();

		
		parrot1.name = "Кеша";
		parrotRost1.rost = 18;
		parrotVid1.vid = "Волнистый попугай";
		System.out.print("\nРост в см попугая по имени " + parrot1.getName() + " - " 
				+ parrotRost1.getRost() + ". Его вид - " + parrotVid1.getVid() 
				+ ". Кажется, эта птица весьма активна...\n" + parrot1.getName() + ":");
		parrot1.zvuk();
		System.out.print(parrot1.getName());
		parrotVid3.move();

		
		parrot2.name = "Пернач";
		parrotRost2.rost = 31;
		parrotVid2.vid = "Краснолобый блестящий лори";
		System.out.print("\nРост в см попугая по имени " + parrot2.getName() + " - " 
				+ parrotRost2.getRost() + ". Его вид - " + parrotVid2.getVid() 
				+ ". Кажется, он хочет что-то сказать...\n" + parrot2.getName() + ":");
		parrot2.zvuk();
		System.out.print(parrotVid2.getVid() + " " + parrot2.getName());
		parrotRost.srok();

		
		parrot3.name = "Геннадий";
		parrotRost3.rost = 82;
		parrotVid3.vid = "Солдатский ара";
		System.out.print("\nРост в см попугая по имени " + parrot3.getName() 
		+ " - " + parrotRost3.getRost() + ". Его вид - " + parrotVid3.getVid() + "\n");
		System.out.print(parrotVid3.getVid() + " " + parrot3.getName());
		parrotRost.srok();
	}

}
