package com.lgy.spring_ex10_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//공통기능 클래스
@Aspect
public class LogAop {
//	공통기능이 적용된 범위
	@Pointcut("within(com.lgy.spring_ex10_1.*)")
	private void pointCutMethod() {}
	
//	메소드 실행 전/후, 예외처리 포함해서 공통기능 실행
	@Around("pointCutMethod()") //적용되는 메소드명
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
//		getSignature().toShortString() : 핵심기능 클래스의 메소드 정보를 가져옴
		String signatureStr = joinPoint.getSignature().toShortString();
//		공통기능 실행(advice) - 핵심기능이 start 되었다.
		System.out.println("@@@### start===>"+signatureStr);
		Object obj = null;
		
		try {
			//핵심기능 실행
			obj = joinPoint.proceed(); //예외처리 추가
			return obj;
		}finally {
//			공통기능 실행(advice) - 핵심기능이 finish 되었다.
			System.out.println("@@@### end===>"+signatureStr);		
		}
	}
}