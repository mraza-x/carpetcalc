import java.util.Scanner;
import java.util.*;

/**
   Mohammed Raza
   CSC 162 - Lab2 # 3 (main)
*/

public class CarpetCalculator
{
   public static void main(String[] args)
   {

	  Scanner keyboard = new Scanner(System.in);

	  double len;
	  double w;
	  double cost;


	  RoomDimension dim = new RoomDimension();

	  RoomCarpet total = new RoomCarpet();


      System.out.print("Enter the room length: ");
      len = keyboard.nextDouble();

      System.out.print("\nEnter the room width: ");
      w = keyboard.nextDouble();

      System.out.print("\nEnter the price of carpet per square foot: ");
      cost = keyboard.nextDouble();

      System.out.println("Room Dimension: " + len + "x" + w);
      System.out.println("Room Area: " + dim.getArea());
      System.out.println("Total Cost: $" + total.getTotalCost());

      System.out.println(dim.toString());

      System.out.println(total.toString());

      // Professor, I tried both ways of printing the calculaed values
      // for area and cost. They will not work.

      // Also tried passing object dim to RoomCarpet class
      // Compiler says it cannot perform calculation with it
      // and the cost variable.


   }
}

