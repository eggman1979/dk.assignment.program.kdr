package dk.assignment.program.entities;

public enum PriorityEnum {
	CRITICA("Critical", 100),
	HIGH("High", 75),
	NORMAL("Normal", 50),
	LOW("Low", 25);
	
	PriorityEnum(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}
	
	final private String name;
	final private int ranking;
	
	public String getName() {
		return name;
	}
	
	public int getRanking() {
		return ranking;
	}
}
