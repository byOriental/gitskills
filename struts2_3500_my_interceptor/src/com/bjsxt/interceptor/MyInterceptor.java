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
		long start = System.currentTimeMillis();// ��my���action�Ž���
		String r = invocation.invoke();// �ڴ˴�ִ��Action��TestAction���ķ���excute,����success
		long end = System.currentTimeMillis();
		System.out.println("action time = " + (end - start));
		System.out.println(r);
		return r;
	}

}
