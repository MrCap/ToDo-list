import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;

public class ListHandler {

	Scanner scan= new Scanner(System.in);
	JSONArray toDoArray=null;

	ListHandler()
	{
		//System.out.println("Hello, Worldii");
		readJSONList();
	}


	public void ListTasks()
	{
		//List tasks
	}

	public void EditTask()
	{
		//Edit task
		
		System.out.println("Edit");
	}

	public void AddTask()
	{
		//Add task
		String task;
	    int priority;
	    String deadline;
	    boolean done;

	    System.out.println("Add New");
	    System.out.println("Task name: ");
	    task = scan.nextLine();

	    System.out.println("Deadline: ");
	    deadline = scan.nextLine();
	    
	    System.out.println("Priority: ");
	    priority = scan.nextInt();

	    //remove enter so it is possible to add more than one task on one run
	    scan.nextLine();

	    addTaskToList(task, priority, deadline);
	}

	public void DeleteTasks()
	{
		//Delete task
		System.out.println("Delete");
		printList();
	}

	public void MarkTaskAsDone()
	{
		//Change done to true
		System.out.println("Mark as done");
	}


	public void ListOldTasks()
	{
		//List tasks that should be ready
		System.out.println("List old tasks");
	}

	public void SendToServer()
	{
		System.out.println("Send to server");
	}

	@SuppressWarnings("unchecked")
	public void addTaskToList(String task, int priority, String deadline)
	{

        JSONObject toDoDetails = new JSONObject();
        toDoDetails.put("task", task);
        toDoDetails.put("priority", priority);
        toDoDetails.put("deadline", deadline);
        toDoDetails.put("done", false);

        toDoArray.add(toDoDetails);

	}

	public void readJSONList()
	{
		JSONParser parser = new JSONParser();
		try{
	   		toDoArray= (JSONArray) parser.parse(new FileReader("example.json"));
		}catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	public void printList()
	{
		int i=1;
	  	for (Object o : toDoArray)
	  	{
		    JSONObject toDo = (JSONObject) o;
		    System.out.println(toDo);
	  	}

	}
}