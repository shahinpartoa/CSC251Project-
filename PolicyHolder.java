public class PolicyHolder
{
   private String fName;
   private String lName;
   private int age;
   private String smokingS;
   private double hgt;
   private double wgt;


   public PolicyHolder()
   {
      fName = "";
      lName = "";
      age = 0;
      smokingS = "";
      hgt = 0;
      wgt = 0;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param firstName The Policyhodler's first name
   @param lastName The Policyholder's last name
   @param age The Policyholder's age
   @param smokingStatus The Policyholder's smoking status
   @param height The Policyholder's height
   @param wweight The Policytholder's weight
   */
   public PolicyHolder(String fName, String lName,int age, String smokingS, double hgt, double wgt)
   {
      this.fName = fName;
      this.lName = lName;
      this.age = age;
      this.smokingS = smokingS;
      this.hgt = hgt;
      this.wgt = wgt;
   }
   
   /**
   Copy Constructor that returns a copy of the PolicyHolder object
   @param obj2 The PolicyHolder to return a copy of
   */
   public PolicyHolder(PolicyHolder obj2)
   {
      this.fName = obj2.getfName();
      this.lName = obj2.getlName();
      this.age = obj2.getAge();
      this.smokingS = obj2.getSmokingS();
      this.hgt = obj2.getHgt();
      this.wgt = obj2.getWgt();
   }
   
   //getters//
   
   /**
   @return The Policyholder's first name
   */
   public String getfName()
   {
      return fName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getlName()
   {
      return lName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmokingS()
   {
      return smokingS;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHgt()
   {
      return hgt;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWgt()
   {
      return wgt;
   }

   
   //setters//
   
   /**
   @param firstName The PolicyHolder's first name
   */
   public void setfName(String fName)
   {
      this.fName = fName;
   }
   
   /**
   @param lastName The PolicyHolder's last name
   */
   public void setlName(String lName)
   {
      this.lName = lName;
   }
   
   /**
   @param age The PolicyHolder's age
   */
   public void setAge(int age)
   {
      this.age = age;
   }
   
   /**
   @param smokingStatus The PolicyHolder's smoking status
   */
   public void setSmokingS(String smokingS)
   {
      this.smokingS = smokingS;
   }
   
   /**
   @param height The PolicyHolder's height
   */
   public void setHgt(double hgt)
   {
      this.hgt = hgt;
   }
   
   /**
   @param weight The PolicyHolder's weight
   */
   public void setWgt(double wgt)
   {
      this.wgt = wgt;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
     
      return (wgt * CONVFACTOR) / (hgt * hgt);
   }
   
   /**
   @return A String that describes the PolicyHolder
   */
   public String toString()
   {
      return String.format("Policyholder's First Name: " + fName +
                           "\nPolicyholder's Last Name: " + lName +
                           "\nPolicyholder's Age: " + age +
                           "\nPolicyholder's Smoking Status: " + smokingS +
                           "\nPolicyholder's Height: " + hgt + " inches" +
                           "\nPolicyholder's Weight: " + wgt + " pounds" +
                           "\nPolicyholder's BMI: %.2f" , getBMI());
   }
}