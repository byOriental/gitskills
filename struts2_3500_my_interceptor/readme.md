�Զ�����������
1���ڿ�����xwork���ҵ�Interceptor��(�ӿ�)��
2���������¶���ķ��������Զ����Interceptor�С�
3��չ��struts-core���ҵ�struts-default.xml��copy���
a.<interceptor-ref name="defaultStack"></interceptor-ref>���൱�ڸ��࣬�����٣���<interceptor-ref name="����action����"></interceptor-ref><!--��action��-->
b.<interceptors><!-- ��package���� -->
		<interceptor name="������" class="������">������action</interceptor>
  </interceptors>
  
  ����������һ�ֱ��˼�룬������������˼�루AOP�������Զ��û�����Ȩ�ޡ������ַ��Ȳ����������ء�
