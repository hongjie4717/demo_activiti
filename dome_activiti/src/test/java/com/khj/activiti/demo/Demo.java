package com.khj.activiti.demo;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Before;
import org.junit.Test;

public class Demo {
    
	private RepositoryService repositoryService;
	private RuntimeService runtimeService;
	private TaskService taskService;
	
	//初始化引擎
	 @Before
     public void init() {
		 //得到默认引擎
    	 ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
    	 //得到发布的 service
    	 repositoryService = engine.getRepositoryService();
    	 //开启流程
    	 runtimeService = engine.getRuntimeService();
    	 //开启发布任务
    	 taskService = engine.getTaskService();
     }
	 
	 //发布
	 @Test
	 public void deployment() {
		 
		 DeploymentBuilder deployment = repositoryService.createDeployment();
		 
		 deployment.name("学生请假");
		 //发布文件 和 图片
		 deployment.addClasspathResource("leaveProcess.bpmn");
		 deployment.addClasspathResource("leaveProcess.png");
	     //部署
		 deployment.deploy();
	 }
	 
	 
	 //创建流程实例
	 @Test
	 public void createPI() {
		 ProcessInstance PI = runtimeService.startProcessInstanceByKey("leaveProcess");
	     System.out.println(PI.getId());
	 
	 }
	 
	 //查询任务
	 @Test
	 public void queryTask() {
		 List<Task> list = taskService.createTaskQuery().list();
		 for (Task task : list) {
			System.out.println("部署id =" +task.getId());
			System.out.println(task.getName());
			System.out.println(task.getCreateTime());
			System.out.println("==================");
		}
	 }
	 
}
