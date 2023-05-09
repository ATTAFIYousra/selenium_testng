package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;

	@Test
	public void iAddTodo() throws IOException, InterruptedException {
		todoPage = new TodoPage();
		Thread.sleep(3000);
		// Check if todo field is displayed
		boolean result = todoPage.isElementDisplayed(TodoPage.fieldText);
		Assert.assertTrue(result);
		todoPage.fillText(prop.getProperty("todo1"));
		
		String elementTodo = todoPage.checkElementContain(TodoPage.todo1);
		Assert.assertTrue(elementTodo.contains((prop.getProperty("todo1"))));
		
		boolean checkbox = todoPage.isCheckboxSelected(TodoPage.checkbox);
		Assert.assertFalse(checkbox);
	}

}
