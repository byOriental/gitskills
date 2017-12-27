自定义拦截器：
1、在开发包xwork中找到Interceptor类(接口)。
2、将此类下定义的方法复制自定义的Interceptor中。
3、展开struts-core，找到struts-default.xml，copy两项；
a.<interceptor-ref name="defaultStack"></interceptor-ref>（相当于父类，不能少）、<interceptor-ref name="拦截action引用"></interceptor-ref><!--在action中-->
b.<interceptors><!-- 在package包中 -->
		<interceptor name="引用名" class="所在类">所拦截action</interceptor>
  </interceptors>
  
  拦截器体现一种编程思想，即面向切面编程思想（AOP），可以对用户访问权限、敏感字符等操作进行拦截。
