//$Id$
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
	@RequestMapping("/hello")
	public String getHello(HttpServletRequest request) {
		String ipAddress = request.getHeader("HTTP_FORWARDED_FOR");  
		System.out.println(request.getRemoteAddr());
		return ipAddress;
	}
	@RequestMapping("/hii")
	public String getHi() {
		return "hii";
	}
}
