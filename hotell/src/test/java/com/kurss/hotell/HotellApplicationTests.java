package com.kurss.hotell;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(classes = HotellApplication.class)
class HotellApplicationTests {


	@Autowired
	private PasswordEncoder encoder;

	@Test
	void contextLoads() {

//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		String encode = encoder.encode("123");
		System.out.println(encode);
	}

}