package com.pratama;

import javax.jws.WebService;

@WebService(endpointInterface = "com.pratama.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}