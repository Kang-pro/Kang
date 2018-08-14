package com.jk.myspring.entity;

import com.jk.myspring.dao.Color;
import com.jk.myspring.dao.Size;

public class Print {

	private Color color;
	private Size size;
	public void setColor(Color color) {
		this.color = color;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public void print() {
		System.out.println("打印"+color.setColor()+size.setSize()+"的纸");
	}
	public static void main(String[] args) {
		Print print = new Print();
		print.print();
	}
}
