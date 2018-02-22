package com.khj.activiti.demo;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;

public class Demo3 {
 
	  public static void main(String[] args) {
		  ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		  
		  TaskService taskService = engine.getTaskService();
		  
		  TaskQuery query = taskService.createTaskQuery();
		  //任务列表
		  List<Task> list =  query.list();
		  
		  for (Task task : list) {
			  //任务id
			  System.out.println(task.getId());
			  //任务名字
			  System.out.println(task.getName());
			  //任务创建时间
			  System.out.println(task.getCreateTime());
		}
	}
}
