package com.aim.test;

import java.util.ArrayList;

public class Block {
	private String name;
	private String trigger;
	private ArrayList<Item> itemList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrigger() {
		return trigger;
	}
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
}