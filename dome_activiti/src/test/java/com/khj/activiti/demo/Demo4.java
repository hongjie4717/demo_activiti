package com.khj.activiti.demo;


import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;


public class Demo4 {
   public static void main(String[] args) {
	   ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		  
		TaskService taskService = engine.getTaskService();
		//提交任务  获取查询出来的id  提交后就到了下一个流程
		taskService.complete("10002");
		  
}
}
