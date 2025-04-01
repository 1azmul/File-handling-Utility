//Define the package name
package FileUtitlity;
//imported fileWriter class  for file writing operations
import java.io.FileWriter;
// Importing IOException to handle input/output errors
import java.io.IOException;
//Declare the public class
public class FileWriting 
{
	//main method for the entry point of the program
	public static void main(String args[])
	{
		//Define the text to be written into the file
		String text="My name is Nazmul hussain Mozumder and I am doing Internship from Code Tech IT solution";
		//Using try-catch block to handle the exceptions in program
		try {
		//Create a file writer object to write to the file	
		//write the text in to the file
		FileWriter writing=new FileWriter("CodeTechFile.txt");
		writing.write(text);
		//Notify the user that the file has been created successfully
		System.out.println("file has been Written successfully");
		//Close the file writer to release the resources
		writing.close();
	}
	catch(IOException e)
	{
		//Handle the exception that may occur
		System.out.println("An error has been occured");
	}

}}
