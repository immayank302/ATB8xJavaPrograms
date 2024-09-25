// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
package assignments.as_20092024;

public class TriangleClassifier {

    public static void main(String[] args) {
         int side1=60;
         int side2=65;
         int side3=70;

         if(side1 == side2 && side1==side3 && side2==side3){
             System.out.println("Triangle is Equilateral");
         } else if (side1==side2 && side1!=side3 && side2!=side3) {
             System.out.println("Triangle is Isosceles");
         }
         else{
             System.out.println("Triangle is scalene");
         }


    }
}
