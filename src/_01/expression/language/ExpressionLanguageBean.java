package _01.expression.language;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="elBean")
@SessionScoped
public class ExpressionLanguageBean {
	
	private String key;
	private String value;
	private String selectedFramework;
	private Map<String, Object> frameworkMap;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSelectedFramework() {
		return selectedFramework;
	}
	public void setSelectedFramework(String selectedFramework) {
		this.selectedFramework = selectedFramework;
	}
	public Map<String, Object> getFrameworkMap() {
		return frameworkMap;
	}
	public void setFrameworkMap(Map<String, Object> frameworkMap) {
		this.frameworkMap = frameworkMap;
	} 
	
	// ManagedBean objesi olustuktan sonra ilk caliscak kisimdir. Bunu @PostConstruct annotation sagliyor. 
	@PostConstruct
	public void init(){
		
		frameworkMap = new HashMap<String, Object>();
		frameworkMap.put("cocuk", "child");
		frameworkMap.put("adam", "man");
		frameworkMap.put("kadýn", "woman");
	}
	
	public void addFramework(String key, String value){
		if(key!="" && value!=""){
			frameworkMap.put(key, value);
		}
	}

}
