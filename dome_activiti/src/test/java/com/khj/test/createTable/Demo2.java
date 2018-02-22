package com.khj.test.createTable;

import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 第二种创建表
 * @author lenovo
 *
 */
public class Demo2 {
     
	   public static void main(String[] args) {
		   //加载spring驱动
		   ClassPathXmlApplicationContext factroy = new ClassPathXmlApplicationContext("activiti.cfg.xml");
		   //加载spring配置
		   StandaloneProcessEngineConfiguration config = (StandaloneProcessEngineConfiguration) factroy.getBean("processEngineConfiguration");
		   //创建引擎
           config.buildProcessEngine();	
           //关闭资源
		   factroy.close();
		   
	}
}
