package com.example.LoanAppBackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.LoanAppBackend.Entity.EmpEnt;
import com.example.LoanAppBackend.dao.EmpRepo;


@RestController
public class ReqController {
	
	EmpRepo applicationDetailsRepository;
	
	
	
	public ReqController(EmpRepo applicationDetailsRepository) {
		super();
		this.applicationDetailsRepository = applicationDetailsRepository;
	}

	
	@PostMapping("/submit_application")
	public String InsertIntoEmpTable(@RequestParam int id,@RequestParam  String firstName,@RequestParam  String middleName,@RequestParam  String lastName,@RequestParam  String dateOfBirth,
			@RequestParam String maritalStatus,@RequestParam  String sSNNumber,@RequestParam  int loanAmount,@RequestParam  String loanPurpose,@RequestParam  String description,@RequestParam  String aDL1,
			@RequestParam String aDL2,@RequestParam  String city,@RequestParam  String state,@RequestParam  String postalCode,@RequestParam  String homePhone,@RequestParam  String officePhone,
			@RequestParam String mobile,@RequestParam  String email,@RequestParam  String employerName,@RequestParam  String workExpTo,@RequestParam  String workExpFrom,@RequestParam  String annualSalary,
			@RequestParam String designation,@RequestParam  String emp_ADL1,@RequestParam  String emp_ADL2,@RequestParam  String emp_City,@RequestParam  String emp_State,
			@RequestParam String emp_PostalCode ) {
		EmpEnt entry=new EmpEnt(id,firstName, middleName, lastName, dateOfBirth,
			 maritalStatus, sSNNumber, loanAmount, loanPurpose, description, aDL1,
			 aDL2, city, state, postalCode, homePhone, officePhone,
			 mobile, email, employerName, workExpTo, workExpFrom, annualSalary,
			designation,emp_ADL1,emp_ADL2,emp_City,emp_State,
			emp_PostalCode);
		
		applicationDetailsRepository.save(entry);
		
		System.out.println("Success");
		return entry.toString();
	}
}
