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
		stroke(255);

		float x = width * .25f;
		float y = 50;
		float gap = 20;
		for (int i = 0; i < 30; i ++){
			line(x, y, x, height);
			
			text(i + 1, x, y - 20);
			x += gap;

		}


		

		text("Research", 100, 100);
		text("Design", 100, 150);
		text("Phase1", 100, 200);
		text("Phase2", 100, 250);
		text("Phase3", 100, 300);
		text("Phase", 100, 350);
		text("Testing", 100, 400);
		text("Evalution", 100, 450);
		text("Release", 100, 500);
		
		float w  = 50;
		float h = 20;
		//stroke(255,0,0);
		//fill(255,0,0);
		rect(x, y, w, h);
		rect(x + 30, y, w, h);
		


		
	}
}
