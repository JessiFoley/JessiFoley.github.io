package com.jfreyberger;

import java.util.Random;

import javax.swing.JCheckBoxMenuItem;

public class CharRandomizer {
	private static final String[] CLASS_LIST = {"Warrior","Paladin","Hunter","Rogue","Priest","Shaman","Mage","Warlock","Monk","Druid","Demon Hunter","Death Knight"};
	private static final String[] A_RACE_LIST = {"Human", "Dwarf", "Night Elf", "Gnome", "Draenei", "Worgen", "Pandaren"};
	private static final String[] A_ALLIED_RACE_LIST = {"Void Elf", "Lightforged Draenei", "Dark Iron Dwarf", "Kul Tiran", "Mechagnome"};
	private static final String[] H_RACE_LIST = {"Orc", "Undead", "Tauren", "Troll", "Blood Elf", "Goblin", "Pandaren"};
	private static final String[] H_ALLIED_RACE_LIST = {"Nightborne", "Highmountain Tauren", "Mag\'har Orc", "Zandalari Troll", "Vulpera"};
	
	public static String rollRace(String faction) {
		Random rand = new Random();
		
		if (faction.equals("Alliance")) {
			if (Filter.isPreferAR()) {
				return A_ALLIED_RACE_LIST[rand.nextInt(A_ALLIED_RACE_LIST.length)];
			} else {
				return A_RACE_LIST[rand.nextInt(A_RACE_LIST.length)];
			}
		} else {
			if (Filter.isPreferAR()) {
				return H_ALLIED_RACE_LIST[rand.nextInt(H_ALLIED_RACE_LIST.length)];
			} else {
				return H_RACE_LIST[rand.nextInt(H_RACE_LIST.length)];
			}
		}
	}
	
	public static String rollClass() {
		//String[] list = masterClassList;
		Random rand = new Random();
				
		return CLASS_LIST[rand.nextInt(CLASS_LIST.length)];
	}
	
	public static String rollFaction(Boolean alliance, Boolean horde) {
		Random rand = new Random();
		
		if (alliance == horde) {
			if (rand.nextInt(100) > 49) {
				return ("Alliance");
			} else {
				return ("Horde");
			}
		} else if (alliance == true) {
			return "Alliance";
		} else {
			return "Horde";
		}
	}
}
