package com.example.demo2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Demo2Application.class);
	}

	public String abcd(){
		return "abc";
	}

	public String abcd2(){
		return "abc";
	}

	public String abcd3(){
		return "abc";
	}

	public String abcd4(){
		return "abc";
	}

	public String abcd5(){
		return "abc";
	}

	public String abcd6(){
		return "abc";
	}

	public String abcd7(){
		return "abc";
	}

	public String abcd8(){
		return "abc";
	}

	public String abcd9(){
		return "abc";
	}

	public String abcd10(){
		return "abc";
	}
}
