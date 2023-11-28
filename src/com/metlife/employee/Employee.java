package com.metlife.employee;

public class Employee {
    public int empId;
    public String empName;
    public double empSalary;
    public String empPerformance;
    public static String companyName;

    public Employee()
    {
        System.out.println("object created");
        System.out.println("launch browser");
        //autogenerate empid
        empId=909;
    }

    public Employee(int empId)
    {
        System.out.println(this);
        System.out.println("object created");
        System.out.println("launch browser");
        //autogenerate empid
        this.empId=empId;
    }

    public Employee(int empId,String empName)
    {
            this.empId=empId;
            this.empName=empName;
    }
    public Employee(String empName,int empId)
    {
        this.empId=empId;
        this.empName=empName;
    }

    public Employee(double x)
    {

    }
    public void displayEmployeeRecord() {
//        double empSalary=99;
        System.out.println("Employee Id: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println(this.empSalary);
        System.out.println(empPerformance);
        System.out.println(Employee.companyName);
        System.out.println("----------------------------------");
    }

    public void allocateBonus() {
        //perf -->A--> then salary+1000
        //perf -->B-->then salary+500
        //perf --> c --> then salary+100
//        double empSalary=0;
        if (empPerformance.equalsIgnoreCase("a")) {
            this.empSalary =  this.empSalary + 1000;
        } else if (empPerformance.equalsIgnoreCase("B")) {
            this.empSalary =  this.empSalary + 500;
        } else {
            this.empSalary =  this.empSalary + 100;
        }
    }

    public static Employee getInstance()
    {
        Employee e=new Employee();
        return e;
    }

    public static void printEmpName(Employee x)
    {
        System.out.println(x.empName);
    }
}
