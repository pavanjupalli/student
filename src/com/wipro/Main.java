package com.wipro;

public class Main {

    public static void main(String[] args) {

        Employee employee[] = new Employee[7];
        DesignCode designCode[] = new DesignCode[5];

        designCode[0] = new DesignCode('e', "Engineer", 20000);
        designCode[1] = new DesignCode('c', "Consultant", 32000);
        designCode[2] = new DesignCode('k', "Clerk", 12000);
        designCode[3] = new DesignCode('r', "Receptionist", 15000);
        designCode[4] = new DesignCode('m', "Manager", 40000);

        employee[0] = new Employee(1001 ,"Ashish", "01/04/2009", designCode[0], "R&D", 20000, 8000, 3000 );
        employee[1] = new Employee(1002 ,"Sushma", "23/08/2012", designCode[1], "R&D", 20000, 8000, 3000 );
        employee[2] = new Employee(1003 ,"Rahul", "12/11/2008",  designCode[2],"R&D", 20000, 8000, 3000 );
        employee[3] = new Employee(1004 ,"Chahat", "29/01/2013",designCode[3],  "R&D", 20000, 8000, 3000 );
        employee[4] = new Employee(1005 ,"Ranjan", "16/07/2005",  designCode[4],"R&D", 20000, 8000, 3000 );
        employee[5] = new Employee(1006 ,"Suman", "1/1/2000",  designCode[0],"R&D", 20000, 8000, 3000 );
        employee[6] = new Employee(1007 ,"Tanmay", "12/06/2006",  designCode[1],"R&D", 20000, 8000, 3000 );

        System.out.println("Emp No. Emp Name Department Designation Salary");
        for(int i =0;i<7;i++){
            if(employee[i].getEmployeeNo().equals(Integer.valueOf(args[0]))){
                System.out.println(employee[i].getEmployeeNo()+ " "+ employee[i].getEmployeeName()
                        + " " + employee[i].getDepartment() + " " + employee[i].getDesignationCode().getDesignation() + " "
                + (employee[i].getBasic()+employee[i].getHra() - employee[i].getIt() + employee[i].getDesignationCode().getDa()));
                return;
            }
        }

        System.out.println("There is no employee with empid : " + args[0]);



    }
}
