package com.product.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspects {

	@Before(" execution(*  *(..))")
	public void f1(JoinPoint jp) {
		// file log4J api
		System.out.println("Service method is statted executing.... " + jp.getSignature());
	}

	@After(" execution(*  *(..))")
	// @After(" execution(* com.product.service.*ServiceImpl.find*(..))")
	public void f2(JoinPoint jp) {
		System.out.println("Service method is execution is completed  .... " + jp.getSignature());
	}

}
