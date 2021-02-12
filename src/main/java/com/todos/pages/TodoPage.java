package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.By;
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

	/*Locators*/
	final static String INPUT_TEXT = "//input[@ng-model='newTodo']";
	final static String ELEMENT_TODO = "//label[@class='ng-binding']";
	final static String CHECK_BOX = "//input[@type= 'checkbox']";

	/*@FindBy*/
	//@FindBy(id = INPUT_TEXT)
	//private WebElement inputText;
	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	@FindBy(how = How.XPATH, using = ELEMENT_TODO)
	public static WebElement elementTodo;
	@FindBy(how = How.XPATH, using = CHECK_BOX)
	public static WebElement checkBox;

	/*Methods*/
	public void submitTodo(String todo) {
		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);
	}

	public Boolean isElementDiplayed(WebElement element) {

		Boolean isElementDiplayed = element.isDisplayed();
		return isElementDiplayed;	
	}

	public String checkElementContains(WebElement element) {

		String elementToGet = element.getText();
		return elementToGet;
	}
	
	public Boolean isCheckBoxSelected(WebElement element) {

		Boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected;
	}
	}
