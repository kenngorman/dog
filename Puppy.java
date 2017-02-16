/*
* Mr. Gorman
* Puppy Class
*
* February 14, 2017
*/

public class Puppy 
{
   // Puppy age is private; you can only access it through a method 
   //   in this class.
   private int puppyAge;

   public Puppy(String name)
   {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is : " + name );
   }

   // Only allowed to set the Puppy's age through a method
   // "Protects" the puppyAge variable from being changed to something 
   //   out of the ordinary from another class.
   public void setAge(int age) 
   {
       if(age > 15)
       {
           System.out.println("Too old");
       }
       else
       {
           puppyAge = age;
       }
   }

   public int getAge( ) 
   {
      System.out.println("Puppy's age is : " + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) 
   {
      /* Object creation */
      Puppy myPuppy = new Puppy("Spike");

      /* Call class method to set puppy's age */
      myPuppy.setAge(2);

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("My puppy is: " + myPuppy.puppyAge + " years old." );
      
      // This will change the puppyAge variable as the statement is
      //     inside this class.
      myPuppy.puppyAge = 4;
      System.out.println(myPuppy.puppyAge);
   }
}