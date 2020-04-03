package com.jse.app;

import java.util.Scanner;

public class Kaup {
	private double height;
	private double weight;

	public void setHeight(double height) {
		this.height = height;
	}

	public double geteigt() {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String kaup() {
		String result = "";
		double kaup = weight / (height * height) / 100 ;
		
		if (19 < kaup && kaup < 22) {
			result = "비만입니다";
		} else if (15 < kaup && kaup< 19) {
			result = "정상입니다";
		} else if (10 < kaup && kaup< 13) {
			result = "저체중입니다";
		}else {
			result = "잘못된 값입니다";
		}
	
		return result;
	
	}
}