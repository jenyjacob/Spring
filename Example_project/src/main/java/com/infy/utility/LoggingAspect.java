package com.infy.utility;

import org.apache.commons.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.infy.exception.InfyInternException;

@Aspect
@Component
public class LoggingAspect {
	private static final Log LOGGER = (Log) LogFactory.getLog(LoggingAspect.class);
	
	@AfterThrowing(pointcut = "execution(* com.infy.service.ProjectAllocationServiceImpl.*(..))", throwing="exception")
	public void logServiceException(InfyInternException exception) {
		LOGGER.error(exception.getMessage(),exception);
	}

}
