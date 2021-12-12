package com.jfreyberger;

import java.util.Random;

public class ClassPicker {
	private static  final String[] masterClassList = {"Warrior","Paladin","Hunter","Rogue","Priest","Shaman","Mage","Warlock","Monk","Druid","Demon Hunter","Death Knight"};
	
	public static String roll() {
		String[] list = masterClassList;
		Random rand = new Random();
				
		return list[rand.nextInt(list.length)];
	}
}
