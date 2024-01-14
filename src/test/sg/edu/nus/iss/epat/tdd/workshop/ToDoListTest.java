package sg.edu.nus.iss.epat.tdd.workshop;

import sg.edu.nus.iss.epat.tdd.workshop.Task;
import sg.edu.nus.iss.epat.tdd.workshop.ToDoList;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ToDoListTest {
   ToDoList toDoList;
   Task tdd;
   Task junit;
   public ToDoListTest() {
      super();
   }

   @org.junit.Before
   public void setUp() throws Exception {
      tdd = new Task("Learn TDD");
      junit = new Task("Learn Junit");
      toDoList= new ToDoList();
   }

   @org.junit.After
   public void tearDown() throws Exception {
   }

   @org.junit.Test
   public void testAddTask() {
      toDoList.addTask(tdd);
      assertEquals(tdd,toDoList.getTask("Learn TDD"));
      //assertNotNull(toDoList);
      //fail("Not implemented yet");
   }

   @org.junit.Test
   public void testGetStatus() {
      toDoList.addTask(tdd);
      toDoList.completeTask("Learn TDD");
      Task tdd_ = toDoList.getTask("Learn TDD");
      //assertEquals(true,tdd_.isComplete() );
      assertTrue(tdd_.isComplete());
      // fail("Not implemented yet");
   }

   @org.junit.Test
   public void testRemoveTask() {
      toDoList.addTask(tdd);
      toDoList.addTask(junit);
      toDoList.removeTask("Learn TDD");
      assertEquals(null,toDoList.getTask("Learn TDD"));
      //fail("Not implemented yet");
   }

   @org.junit.Test
   public void testGetCompletedTasks() {
      toDoList.addTask(tdd);
      toDoList.completeTask("Learn TDD");
      ArrayList comp = (ArrayList) toDoList.getCompletedTasks();

      assertEquals(tdd, comp.get(0));
      //fail("Not implemented yet");
   }
}