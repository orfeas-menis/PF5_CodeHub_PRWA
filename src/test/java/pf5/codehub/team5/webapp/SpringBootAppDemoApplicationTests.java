package pf5.codehub.team5.webapp;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pf5.codehub.team5.webapp.config.SecurityConfig;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringBootAppDemoApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAppDemoApplicationTests.class);
	List<String> passwordsToBeHashed = Arrays.asList("pass123","pass456","pass789");

	@Autowired
	private SecurityConfig securityConfig;

	@Test
	public void contextLoads() {
		passwordsToBeHashed.forEach(password ->
				LOGGER.info("Hash value of password " + password + "is :" + securityConfig.passwordEncoder().encode(password)));

	}

}
