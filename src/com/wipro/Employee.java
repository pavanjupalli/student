package com.wipro;

public class Employee {

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public DesignCode getDesignationCode() {
        return designationCode;
    }

    public void setDesignationCode(DesignCode designationCode) {
        this.designationCode = designationCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getBasic() {
        return basic;
    }

    public void setBasic(Integer basic) {
        this.basic = basic;
    }

    public Integer getHra() {
        return hra;
    }

    public void setHra(Integer hra) {
        this.hra = hra;
    }

    public Integer getIt() {
        return it;
    }

    public void setIt(Integer it) {
        this.it = it;
    }

    private Integer employeeNo;

    private String employeeName;

    private String joinDate;

    private DesignCode designationCode;

    public Employee() {
    }

    private String department;

    private Integer basic;

    private Integer hra;

    private Integer it;

    public Employee(Integer employeeNo, String employeeName, String joinDate, DesignCode designationCode, String department, Integer basic, Integer hra, Integer it) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}
