import java.util.ArrayList;
import java.util.List;

public class ActionInvocation {
	List<Interceptor> interceptors = new ArrayList<Interceptor>();
	int index = -1;
	Action a = new Action();

	public ActionInvocation() {
		this.interceptors.add(new FirstInterceptor());
		this.interceptors.add(new SecondInterceptor());

	}

	// 面向切面编程思想
	public void invoke() {
		index++;
		if (index >= this.interceptors.size()) {// 拦截器循环完成开始调用用户定义action的execute()方法
			a.execute();
		} else {

			this.interceptors.get(index).intercept(this);
		}
	}
}
