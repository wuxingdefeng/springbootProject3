package com.jueke;

import com.jueke.entity.USERS;
import com.jueke.rabbit.HelloSender;
import com.jueke.rabbit.fanout.FanoutSender;
import com.jueke.rabbit.many.NeoSender;
import com.jueke.rabbit.many.NeoSender2;
import com.jueke.rabbit.object.ObjectSender;
import com.jueke.rabbit.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStudy1ApplicationTests {
	@Autowired
	private HelloSender helloSender;
	@Autowired
	private NeoSender neoSender;
	@Autowired
	private NeoSender2 neoSender2;
	@Autowired
	private ObjectSender objectSender;
	@Autowired
	private TopicSender topicSender;

	@Autowired
	private FanoutSender fanoutSender;
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

}
