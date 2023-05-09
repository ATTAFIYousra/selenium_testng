package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class RemoveTodoTest extends Setup{
	
	public RemoveTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;

	@Test
	public void iRemoveTodo() throws IOException, InterruptedException {
		
		todoPage = new TodoPage();
		todoPage.fillText(prop.getProperty("todo1"));
		todoPage.clickOnElement(TodoPage.checkbox);
		todoPage.clickOnElement(TodoPage.btnRemove);
		String pageSource = todoPage.getPageSource();
		Assert.assertFalse(pageSource.contains(prop.getProperty("todo1")));
		
	}
	

}

