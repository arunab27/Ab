package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orb.base.BaseClass;

public class Pojo  extends BaseClass{
public Pojo() {
	 PageFactory.initElements(driver, this);
}

@FindBy(id="username")
private WebElement txtuser;

@FindBy(id="password")
private WebElement pass;

@FindBy(id="login")
private WebElement login;


//search
@FindBy(id="location")
private WebElement loct;
@FindBy(id="hotels")
private WebElement hot;
@FindBy(id="room_type")
private WebElement romtype;
@FindBy(id="room_nos")
private WebElement romno;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;
@FindBy (id="Submit")
private WebElement submit;

// bbuttons
@FindBy(id="radiobutton_0")
private WebElement radio;
@FindBy(id="continue")
private WebElement cont;

//hotel
@FindBy(id="first_name")
private WebElement frstname;
@FindBy(id="last_name")
private WebElement lstname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement ccnum;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement expmonth;
@FindBy(id="cc_exp_year")
private WebElement expyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
//book
@FindBy(id="book_now")
private WebElement booknow;
//orderid
@FindBy(id="order_no")
private WebElement orderno;
public WebElement getTxtuser() {
	return txtuser;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}
public WebElement getLoct() {
	return loct;
}
public WebElement getHot() {
	return hot;
}
public WebElement getRomtype() {
	return romtype;
}
public WebElement getRomno() {
	return romno;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getRadio() {
	return radio;
}
public WebElement getCont() {
	return cont;
}
public WebElement getFrstname() {
	return frstname;
}
public WebElement getLstname() {
	return lstname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getExpmonth() {
	return expmonth;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
public WebElement getOrderno() {
	return orderno;
}

}

