import java.util.Scanner;
class caluclateApp
{  
   static void addNumber()
   {  
      Scanner input=new Scanner(System.in);

      System.out.println("Enter the number 1 :");
      int n1 = input.nextInt();

      
      System.out.println("Enter the number 2 :");
      int n2 = input.nextInt();

	   int add = n1 + n2;
	   System.out.println("ADDITION : "+add);
   }

   static void subtractionNumber()
   {  
      Scanner input=new Scanner(System.in);

      System.out.println("Enter the number 1 :");
      int n1 = input.nextInt();

      
      System.out.println("Enter the number 2 :");
      int n2 = input.nextInt();

	   int sub = n1 - n2;
	   System.out.println("Subtraction : "+sub);
   }
   
   static double divaideNumber()
   {  
      Scanner input=new Scanner(System.in);

      System.out.println("Enter the number 1 :");
      double d1 =input.nextDouble();

      
      System.out.println("Enter the number 2 :");
      double d2 =input.nextDouble();

      if (d2 == 0) 
      {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 if division by zero
      }
        

	   double div=d1/d2;
	   System.out.println("Division :"+div);
	   return div;
   }
   
   static double multipingNumber()
   {  
      Scanner input=new Scanner(System.in);

      System.out.println("Enter the number 1 :");
      int n1 = input.nextInt();

      
      System.out.println("Enter the number 2 :");
      int n2 = input.nextInt();

	   int mul=n1*n2;
	   System.out.println("Multiping :"+mul);
	   return mul;
   }   
	   
   
   public static void main(String []args)
   {
    System.out.println("            ");
    System.out.println("------------");
    System.out.println("Calculater App");
    System.out.println("    ----      ");

    System.out.println("------------");
    System.out.println("            ");
    System.out.println("Addition");
	 caluclateApp.addNumber();

    System.out.println("------------");
    System.out.println("            ");
    System.out.println("Subtraction");
	 caluclateApp.subtractionNumber();

     System.out.println("------------");
    System.out.println("            ");
    System.out.println("Division ");
	 caluclateApp.divaideNumber();

     System.out.println("------------");
    System.out.println("            ");
    System.out.println("Mulitification");
	 caluclateApp.multipingNumber();
    System.out.println("            ");


    System.out.println("------------");
    System.out.println("-THANK YOU-");
    System.out.println("------------");

   }
}