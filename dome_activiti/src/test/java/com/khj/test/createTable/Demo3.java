package com.khj.test.createTable;

import org.activiti.engine.ProcessEngineConfiguration;

public class Demo3 {
    /**
     * 第三种创建表的方法
     * 
     * @param args
     */
	public static void main(String[] args) {
	 ProcessEngineConfiguration config = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
	  
	 config.buildProcessEngine();
	}
	
}
