//Defining the project name
package FileUtitlity;
//importing the FileWriter class
import java.io.FileWriter;
import java.io.IOException;
//defining the class name of this program
public class FileAppend 
{
	//defining the main method of this program
	public static void main(String args[])
	{
		//Defining the string variable that is going to be appended to the file
		String text="I am studying in GFGC -Domlur college and now doing internship from CodeTech IT solution";
		//try-catch block for exception handling
		try {
			//creating object for the String that is going to be added in to the file
			FileWriter writing=new FileWriter("CodeTechFile.txt",true);
			writing.write(text);
			writing.close();
			//specifying that the file is appended
			System.out.println("text is appended successfully");
			
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

}
