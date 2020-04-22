package ie.tudublin;

import java.util.ArrayList;

import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

public class Gantt extends PApplet
{	
	public ArrayList<Task> Alltasks = new ArrayList<Task>();
	
	
	public void settings()
	{
		size(800, 600);
	}

	public void loadTasks()
	{
	   Table tl = loadTable("tasks.csv", "header");
	   for (TableRow row:tl.rows()){
		   Task task = new Task(row);
		   Alltasks.add(task);

	   }	
	}

	public void printTasks()
	{
		for(Task tl:Alltasks){
			System.out.println(tl);
		}
		
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
	}
}
