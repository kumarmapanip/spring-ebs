package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.composite.Department;
import com.ibm.sf.composite.FinancialDepartment;
import com.ibm.sf.composite.HeadDepartment;
import com.ibm.sf.composite.SalesDepartment;

public class CompositeDemo {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
 
        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
 
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
 
        headDepartment.printDepartmentName();
    }
}