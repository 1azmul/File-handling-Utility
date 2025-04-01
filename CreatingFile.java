//Define the package name
package FileUtitlity;
//importing the File class that is needed to create the file
import java.io.File;
//Importing IOException to handle input/output errors
import java.io.IOException;
//Create class for creating File
public class CreatingFile {
	//main method of this program
public static void main(String args[])
{
	File myFile=new File("CodeTechFile.txt");
	try {
	if(myFile.createNewFile())
	{
		System.out.println("This new  File has been created");
		
	}
	else
	{
		System.out.println("The File is already Exist");
	}
	}
	catch(IOException e) {
		System.out.println("File error");
		
		
	}
}}
