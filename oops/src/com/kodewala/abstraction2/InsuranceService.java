package com.kodewala.abstraction2;
public class InsuranceService {
    // Public method exposed to other classes
    public void submitClaim(String policyNumber, boolean documentsSubmitted) {

        if (validatePolicy(policyNumber)
                && verifyDocuments(documentsSubmitted)) {

            processClaim();
            System.out.println("Insurance claim submitted successfully.");
        } else {
            System.out.println("Claim rejected: Invalid policy or documents.");
        }
    }
    // Hidden core functionality
    private boolean validatePolicy(String policyNumber) {
        System.out.println("Validating insurance policy...");

        return policyNumber != null
                && policyNumber.matches("POL[0-9]{3}");
    }

    private boolean verifyDocuments(boolean documentsSubmitted) {
        System.out.println("Verifying claim documents...");
        return documentsSubmitted;
    }

    private void processClaim() {
        System.out.println("Processing insurance claim...");
    }
}

// Other class uses only the exposed functionality
class Customer {
    public void raiseClaim() {
        InsuranceService service = new InsuranceService() {};
        service.submitClaim("POL123", true);
    }
}


