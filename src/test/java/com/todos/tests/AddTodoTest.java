package com.todos.tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
		boolean elementText = todoPage.isElementDiplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String element = todoPage.checkElementContains(TodoPage.elementTodo);
		Assert.assertTrue(element.contains(prop.getProperty("todo1")));
		boolean boxCheck = todoPage.isCheckBoxSelected(TodoPage.checkBox);
		Assert.assertFalse(boxCheck);
	}
}
