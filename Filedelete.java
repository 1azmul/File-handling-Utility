package FileUtitlity;
//importing the File classes for file related operations
import java.io.File;
//Defining the public class for file delete
public class Filedelete
{
	//main method of the program
	public static void main(String args[])
	{
		//creating object for the file that is going to delete
		File myFile=new File("2ndfile.txt");
		//file delete method to delete the file
		if(myFile.delete())
		{
			//Specifying the message that the file has been deleted
			System.out.println("The File has been deleted succesfully");
		}
		else
		{
			//specifying that fail to deleted the file
			System.out.println("faild to dele the file");
		}
	}
	

}
