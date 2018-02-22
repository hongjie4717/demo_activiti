package com.khj.activiti.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

public class Demo2 {

	 public static void main(String[] args) {
	       
		 ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
         //开启流程 getRuntimeService
		 RuntimeService runtimeService = engine.getRuntimeService();
		 //开启那个流程 就开启那个流程的ID 得到一个流程实例
		 ProcessInstance key = runtimeService.startProcessInstanceByKey("leaveProcess");
	     //最后跳到(班主任) 下个流程
	 }
	
}
