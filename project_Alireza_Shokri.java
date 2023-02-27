

public class pollicy {
  
  
       
    
   private double  policyNumber;
   private String  providerName;
   private  String policyholderFirstName;
   private String policyholderLastName ;
   private double policyholderAge;
   private String policyholderSmokingStatus;
   private double  policyholderHeight;
   private double policyholderWeight;
  
  
 {
    this.policyNumber = 0;
    this.providerName = "";
    this.policyholderFirstName = "";
    this.policyholderLastName = "";
    this.policyholderAge = 0;
    this.policyholderSmokingStatus = "";
    this.policyholderHeight = 0;
    this.policyholderWeight = 0;
  }
  // Constructor with arguments
  public pollicy(double policyNumber, String providerName, String policyholderFirstName, 
                        String policyholderLastName, double policyholderAge, String policyholderSmokingStatus, 
                        double policyholderHeight, double policyholderWeight) {
    this.policyNumber = policyNumber;
    this.providerName = providerName;
    this.policyholderFirstName = policyholderFirstName;
    this.policyholderLastName = policyholderLastName;
    this.policyholderAge = policyholderAge;
    this.policyholderSmokingStatus = policyholderSmokingStatus;
    this.policyholderHeight = policyholderHeight;
    this.policyholderWeight = policyholderWeight;
  }
  
  // Setters (Mutators)
  public void setPolicyNumber(double policyNumber) {
    this.policyNumber = policyNumber;
  }
  
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }
  
  public void setPolicyholderFirstName(String policyholderFirstName) {
    this.policyholderFirstName = policyholderFirstName;
  }
  
  public void setPolicyholderLastName(String policyholderLastName) {
    this.policyholderLastName = policyholderLastName;
  }
  
  public void setPolicyholderAge(double policyholderAge) {
    this.policyholderAge = policyholderAge;
  }
  
  public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
    this.policyholderSmokingStatus = policyholderSmokingStatus;
  }
  
  public void setPolicyholderHeight(double policyholderHeight) {
    this.policyholderHeight = policyholderHeight;
  }
  
  public void setPolicyholderWeight(double policyholderWeight) {
    this.policyholderWeight = policyholderWeight;
    }
    // getter 
    
     public double getPolicyNumber() {
        return policyNumber;
    }
    
    
     public String getProviderName() {
        return providerName;
    }
    
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
        
    }
    
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }
    public double getPolicyholderAge() {
        return policyholderAge;
        }
        public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }
    
     public double getPolicyholderHeight() {
        return policyholderHeight;
    }
    
     public double getPolicyholderWeight() {
        return policyholderWeight;
        }
   
   public double getcalculateBMI() {
        return (policyholderWeight * 703) / (Math.pow(policyholderHeight, 2));
    
    }
    
    public double getcalculatePrice()     {
    
    
      int policyholderAge = 0;
     String policyholderSmokingStatus ="";
     double policyholderBMI = 0;
     final int BASE_FEE = 600;
     final int ADDITIONAL_FEE_FOR_SMOKER = 100;
     final int ADDITIONAL_FEE_FOR_OVER_50 = 75;
     final int BMI_THRESHOLD = 35;
     final int ADDITIONAL_FEE_PER_BMI = 20;
       int price = 0;
       
        if (policyholderAge > 50) {
            price += ADDITIONAL_FEE_FOR_OVER_50;
        }
        if (policyholderSmokingStatus.equals("smoker")) {
            price += ADDITIONAL_FEE_FOR_SMOKER;
        }
        if (policyholderBMI > BMI_THRESHOLD) {
            price += (policyholderBMI - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI;
        }
        return price;
    }
    
    
}

