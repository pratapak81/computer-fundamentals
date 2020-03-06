package com.nsc.designprinciples.liskovsubstitution;

public class SubContractor {
    public boolean approveSLA() {
        System.out.println("Approving SLA of SubContractor");
        return true;
    }
}
