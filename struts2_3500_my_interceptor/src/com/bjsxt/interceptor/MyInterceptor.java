package com.bjsxt.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		long start = System.currentTimeMillis();// 将my这个action放进来
		String r = invocation.invoke();// 在此处执行Action（TestAction）的方法excute,返回success
		long end = System.currentTimeMillis();
		System.out.println("action time = " + (end - start));
		System.out.println(r);
		return r;
	}

}
