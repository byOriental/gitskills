public class FirstInterceptor implements Interceptor {

	public void intercept(ActionInvocation invocation) {
		System.out.println(1); // �൱��һϵ�еĳ�ʼ��
		invocation.invoke();
		System.out.println(-1);
	}

}
