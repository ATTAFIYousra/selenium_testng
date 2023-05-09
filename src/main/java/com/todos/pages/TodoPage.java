package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {

		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy*/
	@FindBy(how = How.XPATH, using = "//input[@ng-model='newTodo']")
	public static WebElement fieldText;
	
	@FindBy(how = How.XPATH, using = "/html/body/ng-view/section/section/ul/li[1]/div/label")
	public static WebElement todo1;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static WebElement checkbox;
	
	@FindBy(how = How.XPATH, using = "//button[@class='clear-completed']")
	public static WebElement btnRemove;
	
	
	/*Methods*/
	public Boolean isElementDisplayed(WebElement element) {
		
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}
	
	public void fillText(String todo) {
		fieldText.sendKeys(todo);
		fieldText.sendKeys(Keys.ENTER);
	}
	
	public String checkElementContain(WebElement element) {
		String elementTodo = element.getText();
		return elementTodo;
	}
	
	public boolean isCheckboxSelected(WebElement element) {
		Boolean isCheckboxSelected = element.isSelected();
		return isCheckboxSelected;
		
	}
	
	public String getPageSource() {
		String element = driver.getPageSource();
		return element;
	}
	
	public void clickOnElement(WebElement element) {
		element.click();
	} 
	
}


