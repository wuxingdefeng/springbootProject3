package com.jueke;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStudy1ApplicationTests {
	/*@Autowired
	private HelloSender helloSender;
	@Autowired
	private NeoSender neoSender;
	@Autowired
	private NeoSender2 neoSender2;H
	@Autowired
	private ObjectSender objectSender;
	@Autowired
	private TopicSender topicSender;

	@Autowired
	private FanoutSender fanoutSender;
	@Autowired
	private HelloQueueSender helloQueueSender;

	@Test
	public void contextLoads() {
		helloSender.sendHello("你好");
	}

	@Test
	public void oneToMany(){
		for(int i=0;i<100;i++){
			neoSender.send(i);
		}
	}
	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<100;i++){
			neoSender.send(i);
			neoSender2.send(i);
		}
	}

	@Test
	public void objectSend(){
		USERS users = new USERS();
		users.setAge(12);
		users.setJob("工程师");
		users.setName("欧德志");
		users.setUserId("34sdffsafasdfadf");
		objectSender.send(users);
	}

	@Test
	public void topicSend() throws Exception{
		topicSender.send();
	}
	@Test
	public void topicSend1() throws Exception{
		topicSender.send1();
	}@Test
	public void topicSend2() throws Exception{
		topicSender.send2();
	}

	@Test
	public void fanoutSender() throws Exception {
		fanoutSender.send();
	}

	@Test
	public void helloQueueSend(){
		helloQueueSender.sendString();
	}*/
}
