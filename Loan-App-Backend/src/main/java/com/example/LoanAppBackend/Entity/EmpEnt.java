package com.example.LoanAppBackend.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Applicant_Details")
public class EmpEnt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String DateOfBirth;
	private String MaritalStatus;
	private String SSNNumber;
	private int LoanAmount;
	private String LoanPurpose;
	private String Description;
	private String ADL1;
	private String ADL2;
	private String City;
	private String State;
	private String PostalCode;
	private String HomePhone;
	private String OfficePhone;
	private String Mobile;
	private String Email;
	private String EmployerName;
	private String WorkExpTo;
	private String WorkExpFrom;
	private String AnnualSalary;
	private String Designation;
	private String Emp_ADL1;
	private String Emp_ADL2;
	private String Emp_City;
	private String Emp_State;
	private String Emp_PostalCode;
	//Constructor
	public EmpEnt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmpEnt(int id, String firstName, String middleName, String lastName, String dateOfBirth,
			String maritalStatus, String sSNNumber, int loanAmount, String loanPurpose, String description, String aDL1,
			String aDL2, String city, String state, String postalCode, String homePhone, String officePhone,
			String mobile, String email, String employerName, String workExpTo, String workExpFrom, String annualSalary,
			String designation, String emp_ADL1, String emp_ADL2, String emp_City, String emp_State,
			String emp_PostalCode) {
		super();
		Id = id;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		MaritalStatus = maritalStatus;
		SSNNumber = sSNNumber;
		LoanAmount = loanAmount;
		LoanPurpose = loanPurpose;
		Description = description;
		ADL1 = aDL1;
		ADL2 = aDL2;
		City = city;
		State = state;
		PostalCode = postalCode;
		HomePhone = homePhone;
		OfficePhone = officePhone;
		Mobile = mobile;
		Email = email;
		EmployerName = employerName;
		WorkExpTo = workExpTo;
		WorkExpFrom = workExpFrom;
		AnnualSalary = annualSalary;
		Designation = designation;
		Emp_ADL1 = emp_ADL1;
		Emp_ADL2 = emp_ADL2;
		Emp_City = emp_City;
		Emp_State = emp_State;
		Emp_PostalCode = emp_PostalCode;
	}	
	
	//GET & SET METHODS
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getSSNNumber() {
		return SSNNumber;
	}
	public void setSSNNumber(String sSNNumber) {
		SSNNumber = sSNNumber;
	}
	public int getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		LoanAmount = loanAmount;
	}
	public String getLoanPurpose() {
		return LoanPurpose;
	}
	public void setLoanPurpose(String loanPurpose) {
		LoanPurpose = loanPurpose;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getADL1() {
		return ADL1;
	}
	public void setADL1(String aDL1) {
		ADL1 = aDL1;
	}
	public String getADL2() {
		return ADL2;
	}
	public void setADL2(String aDL2) {
		ADL2 = aDL2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getHomePhone() {
		return HomePhone;
	}
	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}
	public String getOfficePhone() {
		return OfficePhone;
	}
	public void setOfficePhone(String officePhone) {
		OfficePhone = officePhone;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEmployerName() {
		return EmployerName;
	}
	public void setEmployerName(String employerName) {
		EmployerName = employerName;
	}
	public String getWorkExpTo() {
		return WorkExpTo;
	}
	public void setWorkExpTo(String workExpTo) {
		WorkExpTo = workExpTo;
	}
	public String getWorkExpFrom() {
		return WorkExpFrom;
	}
	public void setWorkExpFrom(String workExpFrom) {
		WorkExpFrom = workExpFrom;
	}
	public String getAnnualSalary() {
		return AnnualSalary;
	}
	public void setAnnualSalary(String annualSalary) {
		AnnualSalary = annualSalary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getEmp_ADL1() {
		return Emp_ADL1;
	}
	public void setEmp_ADL1(String emp_ADL1) {
		Emp_ADL1 = emp_ADL1;
	}
	public String getEmp_ADL2() {
		return Emp_ADL2;
	}
	public void setEmp_ADL2(String emp_ADL2) {
		Emp_ADL2 = emp_ADL2;
	}
	public String getEmp_City() {
		return Emp_City;
	}
	public void setEmp_City(String emp_City) {
		Emp_City = emp_City;
	}
	public String getEmp_State() {
		return Emp_State;
	}
	public void setEmp_State(String emp_State) {
		Emp_State = emp_State;
	}
	public String getEmp_PostalCode() {
		return Emp_PostalCode;
	}
	public void setEmp_PostalCode(String emp_PostalCode) {
		Emp_PostalCode = emp_PostalCode;
	}
	
	@Override
	public String toString() {
		return "EmpEnt [Id=" + Id + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", MaritalStatus=" + MaritalStatus + ", SSNNumber=" + SSNNumber
				+ ", LoanAmount=" + LoanAmount + ", LoanPurpose=" + LoanPurpose + ", Description=" + Description
				+ ", ADL1=" + ADL1 + ", ADL2=" + ADL2 + ", City=" + City + ", State=" + State + ", PostalCode="
				+ PostalCode + ", HomePhone=" + HomePhone + ", OfficePhone=" + OfficePhone + ", Mobile=" + Mobile
				+ ", Email=" + Email + ", EmployerName=" + EmployerName + ", WorkExpTo=" + WorkExpTo + ", WorkExpFrom="
				+ WorkExpFrom + ", AnnualSalary=" + AnnualSalary + ", Designation=" + Designation + ", Emp_ADL1="
				+ Emp_ADL1 + ", Emp_ADL2=" + Emp_ADL2 + ", Emp_City=" + Emp_City + ", Emp_State=" + Emp_State
				+ ", Emp_PostalCode=" + Emp_PostalCode + "]";
	}
		
}
