import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      String policyNum;
      String providerName;
      String fName;
      String lName;
      int age;
      String smokingS;
      double hgt;
      double wgt;
      int numSmokers = 0;
     
      ArrayList<Policy> policyList = new ArrayList<Policy>();
     
    
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
     
      //process all information in the file
      while(inputFile.hasNext())
      {
     
         policyNum = inputFile.nextLine();
         providerName = inputFile.nextLine();
         fName = inputFile.nextLine();
         lName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingS = inputFile.nextLine();
         hgt = inputFile.nextDouble();
         wgt = inputFile.nextDouble();
         
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
         
         policyList.add(new Policy(policyNum, providerName, new PolicyHolder(fName, lName, age, smokingS, hgt, wgt)));
     
      }
     
      //print each Policy object
      for(Policy policy : policyList)
      {
          System.out.println(policy);
          System.out.println();
          if(policy.getPolicyHolder().getSmokingS().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;
      }
     
      //print the number of Policy objects
      System.out.println("There were " + Policy.numOfPolicies + " Policy objects created.");
     
      //print the  number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
   }
}