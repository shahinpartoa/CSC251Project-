public class Policy
{
   private String policyNum;
   private String providerName;
   private PolicyHolder ph;
   
   public static int numOfPolicies = 0;   
   
   public Policy()
   {
      policyNum = "";
      providerName = "";
      ph = new PolicyHolder();
      numOfPolicies++;
   }
   
 
   public Policy(String policyNumber, String providerName, PolicyHolder ph)
   {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.ph = new PolicyHolder(ph);//create a "copy" using the PolicyHolder's copy constructor
      numOfPolicies++;
   }
   
   //getters//
 
   public String getPolicyNum()
   {
      return policyNum;
   }
   
   /**
   @return The Policy Provider's Name
   */
   public String getProviderName()
   {
      return providerName;
   }
 
   /**
   @return The PolicyHolder for the policy
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(ph);   }  
   //setters//
   /**
   @param pNumber The Policy Number
   */
   public void setPolicyNum(String policyNum)
   {
      this.policyNum = policyNum;
   }
   
   /**
   @param pName The Policy Provider's name
   */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   /**
   @param ph The PolicyHolder for the policy
   */
   public void setPolicyHolder(PolicyHolder ph)
   {
      this.ph = new PolicyHolder(ph);   }  
   
   /**
   Calculates the Policy's price
     */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
     
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
     
      double price = BASE_PRICE;
     
      if(ph.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(ph.getSmokingS().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
     
      if(ph.getBMI() > BMI_THRESHOLD)
         price += ((ph.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
   
  
   public String toString()
   {
      return String.format("Policy Number: " + policyNum +
                           "\nProvider Name: " + providerName +
                           "\n" + ph + 
                           "\nPolicy Price: $%.2f", getPrice());
   }
}