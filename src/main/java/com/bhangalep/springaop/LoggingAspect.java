package com.bhangalep.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("target(com.bhangalep.springaop.service.EmployeeService)")
	public void employeeServiceMethods() {};
	
	@Before("employeeServiceMethods()")
	public void logMethods(JoinPoint jp) {
		  String methodName = jp.getSignature().getName();
	      System.out.println("Before " + methodName);
	}
}
