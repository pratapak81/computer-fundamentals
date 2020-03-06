package com.nsc.designprinciples.interfacesegregation.payslip;

public interface ExportablePdf {
    byte[] toPDF();
}
