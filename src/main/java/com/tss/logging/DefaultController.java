package com.tss.logging;
/**
 * @author huzaifa bhavnagri
 */
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class DefaultController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/logger")
    public String sayHello() {
		logger.debug(">>> This is debug Logger --- ");
		logger.info(">>> This is info Logger --- ");
        return "Hello spring-boot-logging, Checkout server.log and console log to see printed logs";
    }
}
