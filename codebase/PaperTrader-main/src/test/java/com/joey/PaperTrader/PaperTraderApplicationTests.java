package com.joey.PaperTrader;

import com.joey.PaperTrader.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class PaperTraderApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void validateUserWorks() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/validateUser")).andExpect(MockMvcResultMatchers.status().isOk());

	}
}
