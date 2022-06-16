package com.InterfaceAbstractionexamples;

interface Resizable 
{
 void reSize(double x);
}
class Rectangle implements Resizable {        
double height, width;        
public Rectangle(double w, double h) {
        super();
        this.height = h;
        this.width = w;
}

 public void reSize(double y) {
         
         this.height=height+y;
         this.width=width+y;
}       
public double getArea() {
        return height * width;
}

public double getPerimeter() {
        return 2 * (height + width);
}

}

public class Rectangle1 {
                public static void main(String[] args) {
        
        Rectangle rec = new Rectangle(2,3);
        System.out.println("area of rectangle brfore changing ="+rec.getArea());
        System.out.println("area of rectangle brfore changing ="+rec.getPerimeter());
        
        rec.reSize(2);
        System.out.println("area of rectangle After changing ="+rec.getArea());
        System.out.println("area of rectangle After changing ="+rec.getPerimeter());
                       
}

}
