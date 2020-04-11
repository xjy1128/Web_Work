
架构报告
	本诗文网站采用jsp + servlet实现，前端用html/css/js等技术，后端采用java语言，数据库为Mysql。
	网站结构可分为三层：
	
	表示层：
		即视图层，前台对应MVC中的View，用于实现和用户的交互，界面显示等；		后台对应MVC中的Controller，用户控制逻辑跳转，调用业务逻辑层的Servelt；
	业务逻辑层：
		即Service层，接收从表示层传来的请求，允许其调用。同时组装数据访问层			的操作（增删改查）；
	数据层：
		即Dao（data access object）层，处于底层，直接访问数据库，执行原子操作。

	三层之间的关系：
		上层调用下层，下层处理后返回给上层，上层依赖下层。


![image](https://github.com/yue-1998/Web_Work/blob/master/%E6%95%B0%E6%8D%AE%E5%BA%93/Image/jiagou1.png)

子系统架构：
	网站的业务逻辑可细化为几个子系统：用户系统、诗文系统、管理员系统等。每个子系统又对应自己的功能。
  
  ![image](https://github.com/yue-1998/Web_Work/blob/master/%E6%95%B0%E6%8D%AE%E5%BA%93/Image/jiagou2.png)
  
