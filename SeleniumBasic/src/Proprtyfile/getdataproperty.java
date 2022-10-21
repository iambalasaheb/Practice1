package Proprtyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getdataproperty {

	public static void main(String[] args) throws IOException {
   //file name and locaton absolute path
		String filepath="D:\\Workplace\\SeleniumBasic\\SignupDetails.properties";
		//or relative path
		String filepath1=".\\SignupDetails.properties";
		//or 
		String filepath2=System.getProperty("user.dir")+"\\SignupDetails.properties";
		//creating instance of fileinputstream class by passing file location to its constructor
		FileInputStream file=new FileInputStream(filepath);	
        //create an instance of properties class
		Properties prop=new Properties();
		//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
       prop.load(file);
     //in order to read data from property file use getProperty(String key) of Properties class
       System.out.println("application url= "+prop.getProperty("appUrl"));
       System.out.println("username is= "+prop.getProperty("username"));
       System.out.println("password is= "+prop.getProperty("password"));
       System.out.println("confirm password= "+prop.getProperty("confirmPassword"));
       System.out.println("first name= "+prop.getProperty("firstname"));
       System.out.println("last name= "+prop.getProperty("lastname"));
       System.out.println("phone number= "+prop.getProperty("phonenumber"));
       System.out.println("emailid= "+prop.getProperty("emailid"));
		
	}

}
