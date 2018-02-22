package com.khj.test.createTable;

import org.activiti.engine.ProcessEngineConfiguration;
/**
 * 通过java代码 工作流 自动生成表
 * @author lenovo
 *
 */
public class Demo1 {
     
	public static void main(String[] args) {
		//创建Activiti对象的实例
		ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
	    //设置数据库地址
		configuration.setJdbcUrl("jdbc:mysql://localhost:3306/activiti5");
		//jdbc驱动
		configuration.setJdbcDriver("com.mysql.jdbc.Driver");
		//数据库名称
		configuration.setJdbcUsername("root");
		//数据库密码
		configuration.setJdbcPassword("root");
		//数据库建表策略
		configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		//创建引擎对象
		configuration.buildProcessEngine();
	}
	
}
