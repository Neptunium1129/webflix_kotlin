package com.ksm.wfx;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletReqNResUtils {
	// 단순히 ServletResponse로 들어온 값을 HttpServletResponse로 바꿔주는 클래스 입니다. 
	public static HttpServletRequest asHttpServletRequest(ServletRequest servletRequest) {
		if(!(servletRequest instanceof HttpServletRequest)) {
		throw new RuntimeException();
		}
		
		return (HttpServletRequest) servletRequest;
	}
	
	public static HttpServletResponse asHttpServletResponse(ServletResponse servletResponse) {
		return (HttpServletResponse) servletResponse;
	}
}
