package com.fis.app.util;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class NewComplience {
		// public void doLogging()
		@Before("execution(public * do*())")
		public void doThis()
		{
			System.out.println("---->> Process Compilence Called ");
		}
	}


