package com.aim.test;

import java.util.ArrayList;

public class Trx {
	private String name;
	private String key;
	private String bitOffEvent;
	private String bitOffEventReport;
	private String bitOffReadAction;
	private ArrayList<MultiBlock> multiBlockList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getBitOffEvent() {
		return bitOffEvent;
	}
	public void setBitOffEvent(String bitOffEvent) {
		this.bitOffEvent = bitOffEvent;
	}
	public String getBitOffEventReport() {
		return bitOffEventReport;
	}
	public void setBitOffEventReport(String bitOffEventReport) {
		this.bitOffEventReport = bitOffEventReport;
	}
	public String getBitOffReadAction() {
		return bitOffReadAction;
	}
	public void setBitOffReadAction(String bitOffReadAction) {
		this.bitOffReadAction = bitOffReadAction;
	}
	public ArrayList<MultiBlock> getMultiBlockList() {
		return multiBlockList;
	}
	public void setMultiBlockList(ArrayList<MultiBlock> multiBlockList) {
		this.multiBlockList = multiBlockList;
	}
}
