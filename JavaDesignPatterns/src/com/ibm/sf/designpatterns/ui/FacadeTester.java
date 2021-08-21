package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.facade.ReportGeneratorFacade;
import com.ibm.sf.facade.ReportType;

public class FacadeTester {
    public static void main(String[] args) throws Exception   {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
         
        reportGeneratorFacade.generateReport(ReportType.HTML, null, null);
        reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
    }
}