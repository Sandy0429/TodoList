package com.sandy.springboot.toDoList.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ToDoService {
	
	private static int todosCount =0;
	
//	@Autowired
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(++todosCount,"Sandy","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todosCount,"Sandy","Learn DevOps",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todosCount,"Sandy","Learn Java",LocalDate.now().plusYears(3),false));
		}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean isItDone) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,isItDone);
		todos.add(todo);
	}

	public void deleteById(int id) {
		
		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		// TODO Auto-generated method stub
		todos.removeIf(predicate );
		
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
		
	}

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	
}
