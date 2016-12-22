package _03.staticnavigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class StaticNavigation {

	public String goPage3(){
		
		return "page3";
	}
	
}
