package a.b.c;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV)container.getBean("tv");
		tv.volumeUp();
		tv.volumeDown();
	}

}
