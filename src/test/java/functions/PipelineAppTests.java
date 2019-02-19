package functions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties="handler=upper&main=functions.PipelineApp")
public class PipelineAppTests {

	@Test
	public void contextLoads() {
	}

}

