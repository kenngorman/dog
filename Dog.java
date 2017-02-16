
/**
 * Dog Class for Computer Science Spring 2017
 * 
 * @author - Mr. Gorman
 * @version - February 9 2017
 */

/*
* Everything in Java "lives" inside a class.
* Only import statements are outside of the class block.
* A block of code begins and ends with curly braces.
*/

public class Dog
{
/*    
* Instance variables - all Dog objects that are created by this class will have
*     these three variables.
*/

     String name;
     int age;
     String breed;
     String collar;

/*
* Constructor - there is a method with the same name as the class.
*     This is the method that creates the Dog object.
*     There can be more than one constructor, depending upon how we want
*           to create the Dog object.
*    This constructor will create a "default" Dog object where the name, age
*          and breed are automatically added.
*/

    public Dog()
    {
       name = "Spot";
       age = 4;
       breed = "Mutt";
       collar = "red";
    }

/*
* This constuctor also makes a Dog object, but it requires that you send
*    the name, age and breed. Those three items are called parameters.
* Each one of the parameters you give this method are them transfered into
*     another new Dog object.    
*/

    public Dog(String newName, int newAge, String newBreed, String newCollar)
    {
       name = newName;
       age = newAge;
       breed = newBreed;
       collar = newCollar;
    }

/*
* Methods - this is code that shows what a Dog object can do. When a Dog object
*     is created, it is given the ability to speak. The method will create a
*     String and add the text "woof" to that String. The method will then give
*     that String back to you using the retun statement.
*/

    public String speak()
    {
        String sound = "woof";
        return sound;
    }
    
 /*
* After you have completed the above code, try the following...
* Add an instance variable that will hold the color of the dog's collar
* Add two additional methods - each one is a trick the dog can do. 
*     When you create a new Dog object, add one trick.
*/

public String shake()
{
    String canShake = " can shake your hand!";
    return canShake;
}

public String rollOver()
{
    String canRollOver = " can roll over!";
    return canRollOver;
}

public String playPiano()
{
    String canPlayPiano = " can play the piano!";
    return canPlayPiano;
}
}

