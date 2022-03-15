import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//to read property file we need to use property class
		Properties prop=new Properties();
		prop.load(new FileInputStream(".\\conf\\conf.properties"));
		 //to read key from property file we use getProperty
		System.out.println(prop.getProperty("browsername"));
		
           prop.setProperty("url", "facebook.com");
          
           System.out.println(prop.getProperty("url"));
           
           FileOutputStream test =new  FileOutputStream(".\\\\conf\\\\conf.properties");
           prop.store(test,"changing value");
           
	}

}
