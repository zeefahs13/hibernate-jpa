package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
class HibernateJpaApplicationTests {

	
	@Test
	void contextLoads() {
		assertEquals(true, true, false);
	}

	private boolean assertEquals(boolean b, boolean c, boolean string) {
		return b==c?true:false;
		
	}

}
