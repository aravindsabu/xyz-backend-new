package com.nestdigital.xyzbaclkendnew.app.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class StudentModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollnumber;
    private int admissionnumber;
    private String collegename;
    private String department;
    private String bloodgroup;
    private String dateofbirth;
    private String parentname;
    private String guardianname;
    private String emailid;
    private String address;

    public StudentModel(int id, String name, int rollnumber, int admissionnumber, String collegename, String department, String bloodgroup, String dateofbirth, String parentname, String guardianname, String emailid, String address) {
        this.id = id;
        this.name = name;
        this.rollnumber = rollnumber;
        this.admissionnumber = admissionnumber;
        this.collegename = collegename;
        this.department = department;
        this.bloodgroup = bloodgroup;
        this.dateofbirth = dateofbirth;
        this.parentname = parentname;
        this.guardianname = guardianname;
        this.emailid = emailid;
        this.address = address;
    }

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public int getAdmissionnumber() {
        return admissionnumber;
    }

    public String getCollegename() {
        return collegename;
    }

    public String getDepartment() {
        return department;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getParentname() {
        return parentname;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public void setAdmissionnumber(int admissionnumber) {
        this.admissionnumber = admissionnumber;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
