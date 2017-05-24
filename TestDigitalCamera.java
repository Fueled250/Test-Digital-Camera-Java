/*S.McDonald 11/5/2016
TestDigitalCamera.java
This program asks the user to enter both a camera brand and how many megapixels the camera has.
New objects are created for the 4 camera data entries the user inputs.
After the 4 objects have been created, this camera calls the DigitalCamera class which then assigns a
price to the camera, as well as displays the output of all the values.
*/

import java.util.Scanner; //import Scanner class

public class TestDigitalCamera
{
   public static void main(String[] args)
   {
      //declare
      String brand;
      int megapixels;
      Scanner user_input = new Scanner(System.in); //user_input = new object of the Scanner class
      
      //input and create new objects
      //Camera 1
      System.out.println("Enter the brand of a camera: ");
      brand = user_input.nextLine(); //captures the user's input
      System.out.println("Enter the number of megapixels of the camera: ");
      megapixels = user_input.nextInt(); //captures the user's input
      user_input.nextLine();
      DigitalCamera cam1 = new DigitalCamera(brand, megapixels); //creates cam1 as a new object of the DigitalCamera class
      
      //Camera 2
      System.out.println("Enter the brand of another camera: ");
      brand = user_input.nextLine(); //captures the user's input
      System.out.println("Enter the number of megapixels of the camera: ");
      megapixels = user_input.nextInt(); //captures the user's input
      user_input.nextLine();
      DigitalCamera cam2 = new DigitalCamera(brand, megapixels); //creates cam2 as a new object of the DigitalCamera class
      
      //Camera 3
      System.out.println("Enter the brand of another camera: ");
      brand = user_input.nextLine(); //captures the user's input
      System.out.println("Enter the number of megapixels of the camera: ");
      megapixels = user_input.nextInt(); //captures the user's input
      user_input.nextLine();
      DigitalCamera cam3 = new DigitalCamera(brand, megapixels); //creates cam3 as a new object of the DigitalCamera class
      
      //Camera 4
      System.out.println("Enter the brand of another camera: ");
      brand = user_input.nextLine(); //captures the user's input
      System.out.println("Enter the number of megapixels of the camera: ");
      megapixels = user_input.nextInt(); //captures the user's input
      user_input.nextLine();
      DigitalCamera cam4 = new DigitalCamera(brand, megapixels); //creates cam4 as a new object of the DigitalCamera class
      
      //display/output
      System.out.println("Camera 1");
      cam1.show(); //call the show method for cam1
      System.out.println("");
      System.out.println("Camera 2");
      cam2.show(); //call the show method for cam2
      System.out.println("");
      System.out.println("Camera 3");
      cam3.show(); //call the show method for cam3
      System.out.println("");
      System.out.println("Camera 4");
      cam4.show(); //call the show method for cam4
   
   }//main method

}//class