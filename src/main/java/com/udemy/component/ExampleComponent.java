package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ExampleComponent")
public class ExampleComponent {
	
	private static final Log LOG =LogFactory.getLog(ExampleComponent.class);

	public void sayhello(){
		LOG.info("example for tazaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
	}
	
	
}
