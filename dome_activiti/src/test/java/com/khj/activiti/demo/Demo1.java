package com.khj.activiti.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;

public class Demo1 {
     /**
      * 部署流程
      * @param args
      */
	   public static void main(String[] args) {
		//创建流程引擎对象
		//调用这个方法自动加载activiti.cfg.xml文件
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
	    //repositoryService 进行流程部署
		RepositoryService repositoryService = engine.getRepositoryService();
		//部署对象 
		DeploymentBuilder createDeployment = repositoryService.createDeployment();
	    //想设值的话就给这个对象加属性
		createDeployment.name("请假流程");
		
		//加载文件
		createDeployment.addClasspathResource("leaveProcess.bpmn");
	    //加载图片
		createDeployment.addClasspathResource("leaveProcess.png");
	    //持久化数据库
		Deployment deploy = createDeployment.deploy();
		
		System.out.println(deploy.getId()+"========"+deploy.getKey());
	   
	   }
}
