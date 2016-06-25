package com.javanote.generic;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	public void drawAll (List<? extends Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(this);
		}
	}
	
	public static void main(String[] args) {
		List<Circle> circleList = new ArrayList<>();
		Circle c = new Circle();
		circleList.add(c);
		Canvas canvas = new Canvas();
		canvas.drawAll(circleList);
	}
}
