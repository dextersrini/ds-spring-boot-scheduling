package com.ds.scheduling.Tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tasks {
	private static final Logger log = LoggerFactory.getLogger(Tasks.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void reportDateAndTime() {
		log.info("Current date and time is :" + dateFormat.format(new Date()));
	}

}
