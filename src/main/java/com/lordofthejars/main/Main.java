package com.lordofthejars.main;

import com.lordofthejars.bar.BarComponent;
import com.lordofthejars.foo.FooComponent;

public class Main {

	public static void main(String args[]) {
		long times = 10000;
		long beginTime = System.currentTimeMillis();
		for(int i=0;i<times;i++) {
			BarComponent barComponent = new BarComponent();
			barComponent.bar();

			FooComponent fooComponent = new FooComponent();
			fooComponent.foo();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("执行"+times+"次，耗时："+(endTime-beginTime)/1000+"秒");
	}
	
}
