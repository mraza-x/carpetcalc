/**
   Mohammed Raza
   CSC 162 - Lab2 # 3 (class1)
*/

public class RoomDimension
{
   private double length;
   private double width;
   private double area;

   public void RoomDimension(double len, double w)
   {
      length = len;
      width = w;
   }

     public double getArea()
     {
        return length * width;

     }

   public String toString()
   {
	   String str = "Room Dimension: " + length + "x" + width +
	   				 "\nRoom Area: " + length * width;

	   return str;
   }


}
