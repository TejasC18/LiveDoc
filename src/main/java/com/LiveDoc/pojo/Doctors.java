package com.LiveDoc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
@NamedQueries({@NamedQuery(name = "filteredDoctors",query = "select objDoctors from Doctors objDoctors where doctorType=?1")})
public class Doctors {
    @Id
    @Column(name = "doctorid")
    @GeneratedValue(generator="increment")
    int doctorId;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "gender")
    String gender;
    @Column(name = "contactnumber")
    String contactNumber;
    @Column(name = "age")
    int age;
    @Column(name = "entry_charge")
    int entryCharge;
    @Column(name = "qualification")
    String qualification;
    @Column(name = "doctor_type")
    String doctorType;
    @Column(name = "email_id")
    String emailId;
    @Column(name = "aadharcardnumber")
    long aadharCardNumber;
    @Column(name = "password")
    String password;
	public int getDoctorId()
	{
		return doctorId;
	}
	public void setDoctorId(int doctorId)
	{
		this.doctorId = doctorId;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getEntryCharge()
	{
		return entryCharge;
	}
	public void setEntryCharge(int entryCharge)
	{
		this.entryCharge = entryCharge;
	}
	public String getQualification()
	{
		return qualification;
	}
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	public String getDoctorType()
	{
		return doctorType;
	}
	public void setDoctorType(String doctorType)
	{
		this.doctorType = doctorType;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	public long getAadharCardNumber()
	{
		return aadharCardNumber;
	}
	public void setAadharCardNumber(long aadharCardNumber)
	{
		this.aadharCardNumber = aadharCardNumber;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
    
    
}
