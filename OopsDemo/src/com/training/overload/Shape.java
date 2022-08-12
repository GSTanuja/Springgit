package com.training.overload;

public class Shape {
   void calcArea(int x) {
	   System.out.println("Sq "+(x*x));
   }
   void calcArea(double x) {
	   System.out.println("Circle "+(Math.PI*x*x));
   }
   int calcArea(int x,int y) {
	return x*y;
	}
   double calcArea(int x,float y) {
	   return 0.5*x*y;
   }

}
