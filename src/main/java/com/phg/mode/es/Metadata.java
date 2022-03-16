package com.phg.mode.es;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import com.phg.helper.Constent;

@Document(indexName = Constent.META_INDEX)
@Setting(settingPath = Constent.SETTING_PATH)
public class Metadata {
	
	@Id
	@Field(type = FieldType.Keyword)
	private String id;
	
	private List<String> clinical1;
	private List<String> clinical2;
	private List<String> clinical3;
	private List<String> clinical4;
	private List<String> clinical5;
	private List<String> clinical6;
	private List<String> clinical7;
	private List<String> clinical8;
	private List<String> clinical9;
	private List<String> clinical10;
	private List<String> clinical11;
	private List<String> clinical12;
	private List<String> clinical13;
	private List<String> clinical14;
	private List<String> clinical15;
	
	private List<String> master1;
	private List<String> master2;
	private List<String> master3;
	private List<String> master4;
	private List<String> master5;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getClinical1() {
		return clinical1;
	}
	public void setClinical1(List<String> clinical1) {
		this.clinical1 = clinical1;
	}
	public List<String> getClinical2() {
		return clinical2;
	}
	public void setClinical2(List<String> clinical2) {
		this.clinical2 = clinical2;
	}
	public List<String> getClinical3() {
		return clinical3;
	}
	public void setClinical3(List<String> clinical3) {
		this.clinical3 = clinical3;
	}
	public List<String> getClinical4() {
		return clinical4;
	}
	public void setClinical4(List<String> clinical4) {
		this.clinical4 = clinical4;
	}
	public List<String> getClinical5() {
		return clinical5;
	}
	public void setClinical5(List<String> clinical5) {
		this.clinical5 = clinical5;
	}
	public List<String> getClinical6() {
		return clinical6;
	}
	public void setClinical6(List<String> clinical6) {
		this.clinical6 = clinical6;
	}
	public List<String> getClinical7() {
		return clinical7;
	}
	public void setClinical7(List<String> clinical7) {
		this.clinical7 = clinical7;
	}
	public List<String> getClinical8() {
		return clinical8;
	}
	public void setClinical8(List<String> clinical8) {
		this.clinical8 = clinical8;
	}
	public List<String> getClinical9() {
		return clinical9;
	}
	public void setClinical9(List<String> clinical9) {
		this.clinical9 = clinical9;
	}
	public List<String> getClinical10() {
		return clinical10;
	}
	public void setClinical10(List<String> clinical10) {
		this.clinical10 = clinical10;
	}
	public List<String> getClinical11() {
		return clinical11;
	}
	public void setClinical11(List<String> clinical11) {
		this.clinical11 = clinical11;
	}
	public List<String> getClinical12() {
		return clinical12;
	}
	public void setClinical12(List<String> clinical12) {
		this.clinical12 = clinical12;
	}
	public List<String> getClinical13() {
		return clinical13;
	}
	public void setClinical13(List<String> clinical13) {
		this.clinical13 = clinical13;
	}
	public List<String> getClinical14() {
		return clinical14;
	}
	public void setClinical14(List<String> clinical14) {
		this.clinical14 = clinical14;
	}
	public List<String> getClinical15() {
		return clinical15;
	}
	public void setClinical15(List<String> clinical15) {
		this.clinical15 = clinical15;
	}
	public List<String> getMaster1() {
		return master1;
	}
	public void setMaster1(List<String> master1) {
		this.master1 = master1;
	}
	public List<String> getMaster2() {
		return master2;
	}
	public void setMaster2(List<String> master2) {
		this.master2 = master2;
	}
	public List<String> getMaster3() {
		return master3;
	}
	public void setMaster3(List<String> master3) {
		this.master3 = master3;
	}
	public List<String> getMaster4() {
		return master4;
	}
	public void setMaster4(List<String> master4) {
		this.master4 = master4;
	}
	public List<String> getMaster5() {
		return master5;
	}
	public void setMaster5(List<String> master5) {
		this.master5 = master5;
	}
}
