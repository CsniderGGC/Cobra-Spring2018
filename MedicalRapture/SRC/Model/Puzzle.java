package Model;

public class Puzzle {

	private String name;
	private String description;
	private String solution;
	private String hint;
	
public Puzzle(String name, String description, String solution, String hint){
	this.name = name;
	this.description = description;
	this.solution = solution;
	this.hint = hint;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getSolution() {
	return solution;
}
public void setSolution(String solution) {
	this.solution = solution;
}
public String getHint() {
	return hint;
}
public void setHint(String hint) {
	this.hint = hint;
}
}
