package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class HibernateJpaApplicationTests {

	
	@Test
	void contextLoads() {
		assertEquals(true, true, false);
	}

	private boolean assertEquals(boolean b, boolean c, boolean string) {
		return b==c?true:false;
		
	}

}
