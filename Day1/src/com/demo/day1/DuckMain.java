package com.demo.day1;

public class DuckMain {
	public String getInfo(){
		return "this is a Java Class";
	}
	public static void main(String[] args) {
		Duck d1 = new Duck();
		Duck d2 = new Duck();
		Duck d3 = new Duck();
		Duck d4 = new Duck();
		Duck d5 = new Duck();
		
		System.out.println(Duck.duckCount);
		
		System.out.println(new DuckMain().getInfo());
		
		new AbsDemo(){
			@Override
			public void hello() {
				this.hel = 710;
				
			}
		}.hello();
		
		new AbsDemo().show();
		
	}
}
