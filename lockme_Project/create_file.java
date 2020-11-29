package lockme_Project;
import java.io.IOException;
import java.io.File;

public class create_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("User.txt");
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
			boolean b =file.delete();
			if (b==true) {
				System.out.println("file deleted");
				
			}
			else {
				System.out.println("file not deleted");
			}
			}
		catch(Exception e)
		{
			e.getStackTrace();
		}
			
		}

	}


