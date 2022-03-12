package com.aim.test;

import java.util.ArrayList;

public class MultiBlock {
	private String name;
	private String inteval;
	private String startUp;
	private String priority;
	private String isTrace;
	private String multiBlockScan;
	private String action;
	private ArrayList<Block> blockList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInteval() {
		return inteval;
	}
	public void setInteval(String inteval) {
		this.inteval = inteval;
	}
	public String getStartUp() {
		return startUp;
	}
	public void setStartUp(String startUp) {
		this.startUp = startUp;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getIsTrace() {
		return isTrace;
	}
	public void setIsTrace(String isTrace) {
		this.isTrace = isTrace;
	}
	public String getMultiBlockScan() {
		return multiBlockScan;
	}
	public void setMultiBlockScan(String multiBlockScan) {
		this.multiBlockScan = multiBlockScan;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public ArrayList<Block> getBlockList() {
		return blockList;
	}
	public void setBlockList(ArrayList<Block> blockList) {
		this.blockList = blockList;
	}
}
