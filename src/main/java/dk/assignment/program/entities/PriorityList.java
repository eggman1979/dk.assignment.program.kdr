package dk.assignment.program.entities;

import java.util.ArrayList;
import java.util.List;

public class PriorityList {
	
	private Entry currentJob;
	final private List<Entry> todoList = new ArrayList<>();
	final private List<Entry> doneList = new ArrayList<>();
	
	public Entry createTodo(String name, String description, int estimatedTime, List<Entry> dependencies, PriorityEnum priority){
		Entry todo = new Entry(name, description, estimatedTime, dependencies, priority);
		todoList.add(todo);
		return todo;
	}
	
	public void moveTodoToDone(Entry todo){
		 todoList.remove(todo);
		 doneList.add(todo);
	}
	
	public boolean deleteTodo(Entry todo){
		for (Entry e: todoList ) {
			if(e.getDependencies().contains(todo))
				return false;
		}
		todoList.remove(todo);
		return true;
	}
	
	public Entry getTodo(String name){
		for (Entry e : todoList) {
			if(e.getName().equalsIgnoreCase(name)){
				return e;
			}
		}
		return null;
	}
	
}
