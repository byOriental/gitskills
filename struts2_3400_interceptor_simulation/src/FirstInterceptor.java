public class FirstInterceptor implements Interceptor {

	public void intercept(ActionInvocation invocation) {
		System.out.println(1); // 相当于一系列的初始化
		invocation.invoke();
		System.out.println(-1);
	}

}
