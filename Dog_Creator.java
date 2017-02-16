
/*
 * Dog_Creator Class for Computer Science Spring 2017
 * 
 * @author - Mr. Gorman 
 * @version - February 9, 2017
 */

/* 
* Tester Class - this is another class in the same project that will 
* ask the Dog class to create a new Dog object. 
* The Dog class acts like a cookie cutter - 
* it can make numerous new objects but it will never change.
*/

public class Dog_Creator
{
    
/*
* All Java programs begin at the main method. All of the classes are first compiled, and then the program
*     starts wherever the main method is.
*/

    public static void main (String [] args)
    {
/*        
* new - the next two lines use the new keyword to create two new Dog objects.
*     "Dog" is the type of object you want to create.
*     "Spot" is the name of the object.
*     "= new" tells Java that it will be creating a new object and placing 
*     in into the Spot location in memory
*      "Dog()" is asking that method from the Dog class to make a new Dog 
*      object. A call to the Dog() constructor
*        will create a new Dog object using the default values.
*     "Dog("Dave", 6, "Schnauzer") calles the second Dog constructor 
*     and given it the values we want.
*/
        Dog Spot = new Dog();
        Dog Dave = new Dog("Dave", 6, "Schnauzer", "blue");
        Dog Daisy = new Dog("Daisy", 2, "Golden Retreiver", "pink");
        Dog Buster = new Dog("Buster", 11, "Chihuahua", "black");
        Dog Maxx = new Dog("Maxx", 4, "Labrador", "orange");

/*        
* We can print out any information for any Dog object we have created.
* Spot is a Dog object, and has a name, age and breed. We can access those three instance variables
*     using the dot operator. Type the name of the Dog object, the dot, and then the instance variable name.
*     We can also call the speak() methods the same way using the dot operator.  
*/
     
        System.out.println("This dog's name is " + Spot.name + ".");
        System.out.println(Spot.name + " is " + Spot.age + " years old.");
        System.out.println(Spot.name + " says " + Spot.speak() + ".");
        System.out.println();
        
// Dave is a different Dog object. We can get Dave's name, age, and speak() method.   
     
        System.out.println("This dog's name is " + Dave.name + ".");
        System.out.println(Dave.name + " is " + Dave.age + " years old.");
        System.out.println(Dave.name + Dave.shake());
        System.out.println();    
        
         System.out.println("This dog's name is " + Daisy.name + ".");
        System.out.println(Daisy.name + " is " + Daisy.age + " years old.");
        System.out.println(Daisy.name + Daisy.playPiano());
        System.out.println();  
        
         System.out.println("This dog's name is " + Buster.name + ".");
        System.out.println(Buster.name + " is " + Buster.age + " years old.");
        System.out.println(Buster.name + Buster.rollOver());
        System.out.println();  
        
         System.out.println("This dog's name is " + Maxx.name + ".");
        System.out.println(Maxx.name + " is " + Maxx.age + " years old.");
        System.out.println(Maxx.name + Maxx.shake());
        System.out.println(Maxx.name + Maxx.rollOver());
        System.out.println(Maxx.name + Maxx.playPiano());
        System.out.println(Maxx.name + " says " + Maxx.speak() + ".");
        System.out.println();  
    }
}

/*
* After you have completed and run the above code, try the following:
* Create three additional dogs, calling the seconds constructor.
* Print out each dogs name, age, breed, and call the speak method.
* Print out the results of a call to one trick method.
*/