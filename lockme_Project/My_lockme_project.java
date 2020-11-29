package lockme_Project;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class My_lockme_project {
	void option() 
	{
				System.out.println("Press 1: To add a file");
			System.out.println("Press 2: To search a file");
			System.out.println("Press 3: To delete a file");
			System.out.println("Press 4: To exit");
			System.out.println("Press 5: To Sort files in ascending order");
			Scanner in= new Scanner(System.in);
			int ch=in.nextInt();
			myfile t=new myfile();
			switch(ch){
			case 1:
				t.NewFile();
			break;
				
			case 2:
				t.SearchFile();
			break;	
			case 3:
				t.Delete();
			break;
			case 4:
			break;	
			case 5:
				t.FileSort();
				break;
			default:
				System.out.println("Wrong option entered please try again");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_lockme_project t1=new My_lockme_project();
		t1.option();
		
		
	}
}
class myfile extends My_lockme_project{
	
	//function for creating the file
	void NewFile() {
		
		try {
			System.out.println("Enter the file name");
			Scanner s1 = new Scanner(System.in);
		      String f = s1.next();
			File file=new File(f);
			if(file.createNewFile()) {
				System.out.println("new file created");}
				else 
				{
					if(file.exists()) {
						
					System.out.println("file already exists");
					System.out.println("file path"+file.getAbsolutePath());
					System.out.println("file name "+file.getName());
					System.out.println("file parent class "+file.getParent());
					System.out.println("file Last modified on "+file.lastModified());
					}
					else
					{
						System.out.println("file dont exists!!!!!!");
					}
				}
			
			}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		option();	
	}
	//Function for searching the file
	void SearchFile() {
		
		try {
			int c=0;
			System.out.println("Enter the file name you want to search");
			Scanner s1 = new Scanner(System.in);
		      String f = s1.next();
			File p= new File("C:\\Users\\VIPRA TYAGI\\eclipse-workspace\\JAVA_Learning\\");
			if(p.isDirectory()){
		         File[] listOfFiles = p.listFiles();
		         if (listOfFiles.length < 1)
		        	 System.out.println( "There is no File inside Folder");
		         else 
		         {
		         String [] list1=p.list();
		         for (int i = 0; i < list1.length; i++) {
		             if (list1[i].equals(f))
		             {
		            	 c=1;
		             }
			}
		           if(c==1)  System.out.println("File founded "+p+" "+f);
		             
		          else {
		            	 System.out.println("File not founded"); 
		             }
		         /*
		         for (File file : listOfFiles) 
		         {
		            if(!file.isDirectory())
		            	System.out.println(file.getCanonicalPath().toString());
		         }*/
		         }}
		      else System.out .println("There is no Folder @ given path :" + p);
		}
		
		
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	option();
	
	}
	
	
	//function for deleting the file
	
	void Delete() {
		try {
			
			System.out.println("Enter the file name");
			Scanner s1 = new Scanner(System.in);
		      String f = s1.next();
			File file=new File(f);

					if(file.exists()) 
					{
						boolean b =file.delete();
						if (b==true)
						{
							System.out.println("file deleted");
							
						}
						else {
							System.out.println("file not Found!!!!!");
						}
						}
							
		}
						catch(Exception e)
						{
							e.getStackTrace();
						}
		option();			
			
	}

	void FileSort(){
		try {
		File p= new File("C:\\Users\\VIPRA TYAGI\\eclipse-workspace\\JAVA_Learning\\");
		File[] l = p.listFiles();
		Arrays.sort(l);
		System.out.println("Sorting by filename in ascending order");
		for(File s:l){
			System.out.println(s);
		}}
		catch(Exception e)
		{
			e.getStackTrace();
		}
option();			

	}
}