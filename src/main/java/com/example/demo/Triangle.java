package com.example.demo;

import java.util.List;

public class Triangle {
	private List<Point> points;
	private List<Integer> numbers;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }
  
  public void display() {
    for(Point p : points)
      System.out.println("("+p.getX()+","+p.getY()+")");
  }
  
}


