package _01.expression.language;

public class Notes {

	// JSF te 2 tane expression language yapisi vardir.
	// 1-JSP Expression Language
	// 2-JSF Expression Language
	
	// JSP Expression Language $(dolar) karekteri ile baslar.
	// JSF Expression Language #(diyez/sarp) karakteri ile baslar.
	
	// JSP Expression Language 
	// Sadece getter methodunu calistirir.
	
	// JSF Expression Language duruma gore getter veya setter methodunu tetikler.
	// login.xhtml gelirken getter methodu calisir. submit edildiginde setter methodu calisir.
	// welcome.xhtml de gosterirken de getter methodu calisir.
	
	// JSP Expression Language immediate evalution --> hemen cevrilir/degerlendrilir.
	// JSF Expression Language deferred evalution --> gecikmeli cevrilir/degerlendirilir.
	
	// hepsi ayni anlama gelir....
	// ${person.name}
	// ${person['name']}
	// ${person["name"]}
	
	// #{map.key}
	// #{map['key']}
	
}
