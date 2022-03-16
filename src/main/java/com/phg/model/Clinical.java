package com.phg.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="clinical")
public class Clinical {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="C_ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "M_ID1")
	private Master mid1;
	
	@ManyToOne
	@JoinColumn(name = "M_ID2")
	private Master mid2;
	
	@ManyToOne
	@JoinColumn(name = "M_ID3")
	private Master mid3;
	
	@ManyToOne
	@JoinColumn(name = "M_ID4")
	private Master mid4;
	
	@ManyToOne
	@JoinColumn(name = "M_ID5")
	private Master mid5;
	
	@Column(name="CLINICAL_1")
	private String clinic1;
	
	@Column(name="CLINICAL_2")
	private String clinic2;
	
	@Column(name="CLINICAL_3")
	private String clinic3;

	@Column(name="CLINICAL_4")
	private String clinic4;

	@Column(name="CLINICAL_5")
	private String clinic5;
	
	@Column(name="CLINICAL_6")
	private String clinic6;
	
	@Column(name="CLINICAL_7")
	private String clinic7;
	
	@Column(name="CLINICAL_8")
	private String clinic8;
	
	@Column(name="CLINICAL_9")
	private String clinic9;
	
	@Column(name="CLINICAL_10")
	private String clinic10;
	
	@Column(name="CLINICAL_11")
	private String clinic11;
	
	@Column(name="CLINICAL_12")
	private String clinic12;
	
	@Column(name="CLINICAL_13")
	private String clinic13;
	
	@Column(name="CLINICAL_14")
	private String clinic14;
	
	@Column(name="CLINICAL_15")
	private String clinic15;
	
	@Transient
	private List<Master> masters;

	public List<Master> getMasters() {
		return masters;
	}

	public void setMasters(List<Master> masters) {
		this.masters = masters;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Master getMid1() {
		return mid1;
	}

	public void setMid1(Master mid1) {
		this.mid1 = mid1;
	}

	public Master getMid2() {
		return mid2;
	}

	public void setMid2(Master mid2) {
		this.mid2 = mid2;
	}

	public Master getMid3() {
		return mid3;
	}

	public void setMid3(Master mid3) {
		this.mid3 = mid3;
	}

	public Master getMid4() {
		return mid4;
	}

	public void setMid4(Master mid4) {
		this.mid4 = mid4;
	}

	public Master getMid5() {
		return mid5;
	}

	public void setMid5(Master mid5) {
		this.mid5 = mid5;
	}

	public String getClinic1() {
		return clinic1;
	}

	public void setClinic1(String clinic1) {
		this.clinic1 = clinic1;
	}

	public String getClinic2() {
		return clinic2;
	}

	public void setClinic2(String clinic2) {
		this.clinic2 = clinic2;
	}

	public String getClinic3() {
		return clinic3;
	}

	public void setClinic3(String clinic3) {
		this.clinic3 = clinic3;
	}

	public String getClinic4() {
		return clinic4;
	}

	public void setClinic4(String clinic4) {
		this.clinic4 = clinic4;
	}

	public String getClinic5() {
		return clinic5;
	}

	public void setClinic5(String clinic5) {
		this.clinic5 = clinic5;
	}

	public String getClinic6() {
		return clinic6;
	}

	public void setClinic6(String clinic6) {
		this.clinic6 = clinic6;
	}

	public String getClinic7() {
		return clinic7;
	}

	public void setClinic7(String clinic7) {
		this.clinic7 = clinic7;
	}

	public String getClinic8() {
		return clinic8;
	}

	public void setClinic8(String clinic8) {
		this.clinic8 = clinic8;
	}

	public String getClinic9() {
		return clinic9;
	}

	public void setClinic9(String clinic9) {
		this.clinic9 = clinic9;
	}

	public String getClinic10() {
		return clinic10;
	}

	public void setClinic10(String clinic10) {
		this.clinic10 = clinic10;
	}

	public String getClinic11() {
		return clinic11;
	}

	public void setClinic11(String clinic11) {
		this.clinic11 = clinic11;
	}

	public String getClinic12() {
		return clinic12;
	}

	public void setClinic12(String clinic12) {
		this.clinic12 = clinic12;
	}

	public String getClinic13() {
		return clinic13;
	}

	public void setClinic13(String clinic13) {
		this.clinic13 = clinic13;
	}

	public String getClinic14() {
		return clinic14;
	}

	public void setClinic14(String clinic14) {
		this.clinic14 = clinic14;
	}

	public String getClinic15() {
		return clinic15;
	}

	public void setClinic15(String clinic15) {
		this.clinic15 = clinic15;
	}
}
