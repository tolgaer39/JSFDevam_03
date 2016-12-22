package _06.inputtext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIInput;


@ManagedBean
@SessionScoped
public class inputBean {

	private String name;
	private String password;
	
	private UIInput backingBinding;
	
	public UIInput getBackingBinding() {
		return backingBinding;
	}
	public void setBackingBinding(UIInput backingBinding) {
		this.backingBinding = backingBinding;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
