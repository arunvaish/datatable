package com.phg.model;

import java.util.List;

public class DataManager {

	private List<Clinical> data;
	private List<Master> masters;
	int start;
	int length;
	int draw;
	int recordsTotal;
	int recordsFiltered;
	List<Object[]> rawData;
	public List<Object[]> getRawData() {
		return rawData;
	}
	public void setRawData(List<Object[]> rawData) {
		this.rawData = rawData;
	}
	public List<Clinical> getData() {
		return data;
	}
	public void setData(List<Clinical> data) {
		this.data = data;
	}
	public List<Master> getMasters() {
		return masters;
	}
	public void setMasters(List<Master> masters) {
		this.masters = masters;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
}
