package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 스프링이 스캔해서 특정 어노테이션이 붙은 클래스를 생성해서 컨테이너에서 관리해준다 
public class BlogContollerTest {

	// http://localhost:8080/test/hello 여기로 액세스 하면 됨
		@GetMapping("/test/hello")
		public String Hello() {
			return "<h1>hello spring boot!</h1>";
		}
}
