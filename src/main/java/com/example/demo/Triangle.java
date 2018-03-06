package com.example.demo;

import java.util.List;

public class Triangle {
  List<Point> l1;
  Point pointA;
  Point pointB;
  
  public Point getPointA() {
    return pointA;
  }

  public void setPointA(Point pointA) {
    this.pointA = pointA;
  }

  public Point getPointB() {
    return pointB;
  }

  public void setPointB(Point pointB) {
    this.pointB = pointB;
  }
 
  public List<Point> getL1() {
    return l1;
  }

  public void setL1(List<Point> l1) {
    this.l1 = l1;
  }
  
  public void display() {
    System.out.println(pointA.getX()+","+pointA.getY());
    System.out.println(pointB.getX()+","+pointB.getY());
  }
  
  public void displayList() {
    for(Point p : l1)
      System.out.println(p.getX()+","+p.getY());
  }
  
  public void init() {
    System.out.println("Bean has been initialised");
  }
  
  public void destroy() {
    System.out.println("Bean has been destroyed");
  }
  
}
