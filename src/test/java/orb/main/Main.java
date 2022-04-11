package orb.main;

import java.io.IOException;

import org.pojo.Pojo;

import orb.base.BaseClass;

public class Main extends BaseClass {
	public static void main(String[] args) throws IOException {

	launchbrowser();
	launchurl("http://adactinhotelapp.com/");
	maxwindow();
	towait();
	Pojo p=new Pojo();
	
	//loginpage
	
	filltextbox(p.getTxtuser(), readexcel(0, 0));
	filltextbox(p.getPass(), readexcel(1, 0));
	clk(p.getLogin());
	
// search hotel
	Select(p.getLoct(), readexcel(0, 1));
	Select(p.getHot(), readexcel(1, 1));
	Select(p.getRomtype(), readexcel(2, 1));
	Select(p.getRomno(), readexcel(3, 1));
	Select(p.getAdult(), readexcel(4, 1));
	Select(p.getChild(), readexcel(5, 1));
	
	//button
     clk(p.getSubmit());
     clk(p.getRadio());
     clk(p.getRadio());
     clk(p.getCont());
     
     //details
  filltextbox(p.getFrstname(), readexcel(0, 2));
  filltextbox(p.getLstname(), readexcel(1, 2));
  filltextbox(p.getAddress(), readexcel(2, 2));
  filltextbox(p.getCcnum(),readexcel(3, 2));
  
  //select bank details
  Select(p.getCctype(), readexcel(4, 2));
  Select(p.getExpmonth(), readexcel(5, 2));
  Select(p.getExpyear(), readexcel(6, 2));
  
  //cv
  filltextbox(p.getCvv(), readexcel(7, 2));
  //book
  clk(p.getBooknow());
  
  //to display order now
  String t = gettext(p.getOrderno());
     System.out.println(t);
     

	}
}
