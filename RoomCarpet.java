/**
   Mohammed Raza
   CSC 162 - Lab2 # 3 (class2)
*/

public class RoomCarpet
{
   private RoomDimension size;

   private double length;

   private double width;

   private double carpetCost;

   private double totalcost;



   public void RoomCarpet(double len, double w, double cost)
   {

	  length = len;
	  width = w;
      carpetCost = cost;
   }


   public double getTotalCost()
   {
      totalcost = length * width * carpetCost;
      return totalcost;

   }

      public String toString()
      {
   	   String str = "Total cost: $" + totalcost;
   	   return str;
      }

}
