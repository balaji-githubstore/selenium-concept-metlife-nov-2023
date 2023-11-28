package com.metlife.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

    public static void main(String[] args) {



        Employee.companyName="Metlife";

        Employee emp1=new Employee(101);
        System.out.println(emp1);
        Employee emp2=new Employee(102);
        System.out.println(emp2);

        Employee emp3=new Employee(103);
        Employee emp4=new Employee(104,"hello");

//        Employee emp4= Employee.getInstance();
        Employee emp5= Employee.getInstance();
        emp5.displayEmployeeRecord();

//        Employee[] employees=new Employee[3];
//        employees[0]=emp1;
//        employees[1]=emp2;
//        employees[2]=emp3;
        List<Employee> employees=new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

//        (101,saul,9000,A,Metlife)
//        (102,peter,8000,B,Metlife)
//        (103,kim,4000,C,Metlife)

        emp1.empId=101;
        emp1.empName="saul";
        emp1.empSalary=9000;
        emp1.empPerformance="A";

        emp2.empId=102;
        emp2.empName="peter";
        emp2.empSalary=8000;
        emp2.empPerformance="B";

//        emp1.displayEmployeeRecord();
//        emp2.displayEmployeeRecord();
//        emp3.displayEmployeeRecord();

        emp2.displayEmployeeRecord();
        emp2.allocateBonus();
        emp2.displayEmployeeRecord();

//        emp3.allocateBonus();
//        emp3.displayEmployeeRecord();

        Employee.printEmpName(emp1);

    }
}
