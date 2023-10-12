package java_basic_07;

import java_basic_07.Outer2.Inner2;

class Outer2{
	static class Inner2{
		int iv=200;
	}
}
public class java_basic_07_07 {
	public static void main(String[] args) {
		Inner2 i=new Outer2.Inner2();
		System.out.println(i.iv);
	}
}
