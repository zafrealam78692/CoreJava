package com.kodewala.oops.inheritance4;
class Insurance {

    int policyId;
    String policyHolderName;
    double premiumAmount;
    // Parent class constructor
    Insurance(int policyId, String policyHolderName,
              double premiumAmount) {
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
        this.premiumAmount = premiumAmount;
    }

    // Parent class method
    void displayInsuranceDetails() {
        System.out.println("Policy ID: " + policyId);
        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Premium Amount: Rs. " + premiumAmount);
    }
}

// Child class
class HealthInsurance extends Insurance {

    double coverageAmount;
    int policyDuration;

    // Child class constructor
    HealthInsurance(int policyId, String policyHolderName,
                    double premiumAmount, double coverageAmount,
                    int policyDuration) {

        super(policyId, policyHolderName, premiumAmount);

        this.coverageAmount = coverageAmount;
        this.policyDuration = policyDuration;
    }

    // Display all details
    void displayHealthInsuranceDetails() {
        displayInsuranceDetails();

        System.out.println("Coverage Amount: Rs. " + coverageAmount);
        System.out.println("Policy Duration: " + policyDuration + " years");
    }
}


