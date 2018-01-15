/hibernate_0500_CoreAPI
核心AIP-AnnotationConfiguration()不能在高版本的hibernate运行，只能使用Configuration()
执行步骤
i.Configuration()获取默认src根目录下配置文件hibernate.cfg.xml（文件名也可以在重载方法configure()指定）
ii.在配置文件中获取数据库配置信息、获取连接池连接，建立连接，即SessionFactory（相当与jdbc的Connnection）
iii.SessionFactory 产生 session ， SessionFactory里面维护数据库连接池，session里面绑定Connnection。
iiii.SessionFactory 可以通过openSession()或者getCurrentSession() 产生 session .

openSession()和getCurrentSession()区别；
u.openSession() 每次都创建一个新的连接，并且每次都手动进行关闭 	
uu.getCurrentSession() 每次从上下文（current_session_context_class）拿到连接，如果没有，创建新的。
uuu.getCurrentSession() 提交事务后就从上下文（连接池）消失，不需要进行lose。
uuuu.getCurrentSession() 界定事务边界，例如用户添加以及日志记录。


JTA
thread 使用connection 但数据库连接管理事务
jta （全称java transaction api）-java分布式事务管理（多数据库访问）
jta由中间件提供（jbossWebLogic等，tomcat不支持）

缓存：
为了提高读取效率，对经常读取的数据存放在内存的一块区域。


事务：
一．什么是事务
事务是应用程序中一系列严密的操作，所有操作必须成功完成，否则在每个操作中所作的所有更改都会被撤消。也就是事务具有原子性，一个事务中的一系列的操作要么全部成功，要么一个都不做。
事务的结束有两种，当事务中的所以步骤全部成功执行时，事务提交。如果其中一个步骤失败，将发生回滚操作，撤消撤消之前到事务开始时的所有操作。
二．事务的 ACID
事务具有四个特征：原子性（ Atomicity ）、一致性（ Consistency ）、隔离性（ Isolation ）和持续性（ Durability ）。这四个特性简称为 ACID 特性。
1 、原子性
事务是数据库的逻辑工作单位，事务中包含的各操作要么都做，要么都不做
2 、一致性
事 务执行的结果必须是使数据库从一个一致性状态变到另一个一致性状态。因此当数据库只包含成功事务提交的结果时，就说数据库处于一致性状态。如果数据库系统 运行中发生故障，有些事务尚未完成就被迫中断，这些未完成事务对数据库所做的修改有一部分已写入物理数据库，这时数据库就处于一种不正确的状态，或者说是 不一致的状态。
3 、隔离性
一个事务的执行不能其它事务干扰。即一个事务内部的操作及使用的数据对其它并发事务是隔离的，并发执行的各个事务之间不能互相干扰。
4 、持续性
也称永久性，指一个事务一旦提交，它对数据库中的数据的改变就应该是永久性的。接下来的其它操作或故障不应该对其执行结果有任何影响。

数据库系统必须维护事务的以下特性 ( 简称 ACID) ：

原子性 (Atomicity)

一致性 (Consistency)

隔离性 (Isolation)

持久性 (Durability)

原子性 (Atomicity)

事务中的所有操作要么全部执行，要么都不执行；

如果事务没有原子性的保证，那么在发生系统

故障的情况下，数据库就有可能处于不一致状

态。