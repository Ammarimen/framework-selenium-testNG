package com.todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup{

	public AddTodoTest() throws IOException {
		super();	
	}
	
	TodoPage todoPage;
	
	@Test(priority = 1 )
	public void iCanAddTodo() throws IOException {
		
		todoPage = new TodoPage();
		todoPage.submitTodo(prop.getProperty("todo1"));
	}
}
