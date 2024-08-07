package com.my.programs;

public class CuboidRectangle {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(2,3);
        System.out.println(" rectangle length = "+ rectangle.getLength());
        System.out.println(" reactangle width = "+rectangle.getWidth());

        System.out.println("area= " + rectangle.getArea());

        Cuboid cuboid=new Cuboid(rectangle, 5);

        System.out.println("height= " + cuboid.getHeight());

        System.out.println("cuboid volume= " +cuboid.getVolume());
    }
}
