package _02.jstl;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="JSTLBean")
@SessionScoped
public class JSTLBean {

	private String property1;
	private Map<String, String> myMap = new HashMap<String,String>();

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	
}
