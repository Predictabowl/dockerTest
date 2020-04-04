package com.example.predictabowl.app;

import com.example.predictabowl.docker.App;

public class Main {

	public static void main(String[] args) {
		App app = new App();
		String sOut;
		if (args.length > 0) {
			sOut = app.sayHello(args[0]);
		} else {
			sOut = app.sayHello();
		}
		System.out.println(sOut);
	}

}
