package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {

	//instance variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false,length=6)
	private Integer doc_id;
	
	
	@OneToOne
	@JoinColumn(name = "staff_id",insertable=false,updatable=false)
	private Staff staff;
	
	
	private Integer staff_id;
	
	
	@ManyToOne
	@JoinColumn(name = "dept_id",insertable=false,updatable=false)
	private Department department;
	
	
	
	private Integer dept_id;
	
	@Column(nullable=false,length=50)
	private String specalization;
	
	@Column(nullable=false,length=10)
	private String consultation_fee;
	
	@Column(nullable=false)
	private String is_active;


	private LocalDate created_on;
	
	
	//default constructor
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	//parameterized constructor
	public Doctor(Integer doc_id, Staff staff, Integer staff_id, Department department, Integer dept_id,
			String specalization, String consultation_fee, String is_active) {
		super();
		this.doc_id = doc_id;
		this.staff = staff;
		this.staff_id = staff_id;
		this.department = department;
		this.dept_id = dept_id;
		this.specalization = specalization;
		this.consultation_fee = consultation_fee;
		this.is_active = is_active;
	}


	//getter and setter

	public Integer getDoc_id() {
		return doc_id;
	}



	public void setDoc_id(Integer doc_id) {
		this.doc_id = doc_id;
	}



	public Staff getStaff() {
		return staff;
	}



	public void setStaff(Staff staff) {
		this.staff = staff;
	}



	public Integer getStaff_id() {
		return staff_id;
	}



	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public Integer getDept_id() {
		return dept_id;
	}



	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}



	public String getSpecalization() {
		return specalization;
	}



	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}



	public String getConsultation_fee() {
		return consultation_fee;
	}



	public void setConsultation_fee(String consultation_fee) {
		this.consultation_fee = consultation_fee;
	}



	public String getIs_active() {
		return is_active;
	}



	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}



	@Override
	public String toString() {
		return "Doctor [doc_id=" + doc_id + ", staff=" + staff + ", staff_id=" + staff_id + ", department=" + department
				+ ", dept_id=" + dept_id + ", specalization=" + specalization + ", consultation_fee=" + consultation_fee
				+ ", is_active=" + is_active + "]";
	}


	
	
}