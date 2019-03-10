import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Scanner;

class SimpleUIForTesting {

    SimpleUIForTesting() {
    }

    Scanner keyboard = new Scanner(System.in);
    int myint=0;
    char command=' ';

    public void RunUI()
    {
        for(;;)
        {

            System.out.println("---------------------");
            System.out.println("UI For testing");
            System.out.println("---------------------");
            System.out.println("1. Selite 2. Priority 3.Deadline 4. Suoritettu");
            GetJSON();
            System.out.println("(A)dd new (E)dit (D)elete (M)ark as done (L)ist old e(X)it (S)ave");
            
            command = keyboard.next().charAt(0);

            if(command=='x'||command=='X')break;

            switch(command){
                case 'A':
                case 'a':
                    System.out.println("Add New");
                    break;
                case 'E':
                case 'e':
                    System.out.println("Edit");
                    break;
                case 'D':
                case 'd':
                    System.out.println("Delete");
                    break;
                case 'M':
                case 'm':
                    System.out.println("Mark as done");
                    break;
                case 'L':
                case 'l':
                    System.out.println("List old tasks");
                    break;
                case 'S':
                case 's':
                    System.out.println("Send to server");
                    break;

            }


        }
    }


    public void GetJSON()
    {
    	JSONObject jsonObject=null;
    	JSONHandler jsonhandler = new JSONHandler();
    	try{
        	 jsonObject = (JSONObject) jsonhandler.readJsonSimpleDemo("C:/Ohjelmointi/koodit/topcon/example.json");
       	}catch(Exception ex){System.out.println(ex);}

    	System.out.println(jsonObject);
	 	//System.out.println(jsonObject.get("task"));
    }

}