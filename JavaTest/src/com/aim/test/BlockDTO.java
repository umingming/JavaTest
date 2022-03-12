package com.aim.test;

import java.util.ArrayList;

public class BlockDTO {
	private String name;
	private ArrayList<ItemDTO> item;
//	private String deviceCode;
//	private String point;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "ItemDTO [name=" + name + ", deviceCode=" + deviceCode + ", point=" + point + "]";
	}
}
