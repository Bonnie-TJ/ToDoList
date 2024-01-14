package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      // Add code here
      tasks.put(task.getDescription(),task);
   }

   public void completeTask(String description) {
      // Add code here
      tasks.get(description).setComplete(true);
   }

   public boolean getStatus(String description) {
      // Add code here
      boolean isCompleted = getTask(description).isComplete();
      return isCompleted;
   }

   public Task getTask(String description) {
      // Add code here
      return tasks.get(description);
   }

   public Task removeTask(String description) {
      // Add code here
      return tasks.remove(description);
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      Collection<Task> allTasks =  getAllTasks();
      Collection<Task> completedTasks = new ArrayList<Task>();
      for (Task task: allTasks) {
         if (task.isComplete()==true)
            completedTasks.add(task);
      }
      for (int i = 0; i < tasks.size(); i++) {

      }
      return completedTasks;
   }
}
