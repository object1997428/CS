package java_basic_07;

import java_basic_07.Outer.Inner;

class Outer{
	class Inner{
		int iv=100;
	}
}

public class java_basic_07_06 {
	public static void main(String[] args) {
		
		Outer outer=new Outer();
		Inner inner=outer.new Inner();
		System.out.println(inner.iv);
		
	}
}
