package br.com.springboot.curso_jdev_treinamento.requests;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.junit4.*;


import com.hackerrank.test.utility.TestWatchman;
import com.hackerrank.test.utility.*;


@RunWith(OrderedTestRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class GreetingsControllerTest {

	
	@ClassRule
	public static final SpringClassRule springClassRule = new SpringClassRule();
	
	
	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();
	
	@Rule
	public TestWatcher watchman = TestWatchman.watchman;
	
	@Autowired
	private MockMvc mockmvc;
	
	
	@BeforeClass
	public static void setUpClass() {
		TestWatchman.watchman.registerClass(GreetingsControllerTest.class);
	}
	
	
	
	
}
