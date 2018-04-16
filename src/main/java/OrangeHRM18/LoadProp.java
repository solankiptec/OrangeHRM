package OrangeHRM18;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop;
    static String fielName="Config.properties";
    static String filelocation="C:\\Users\\Welcome\\IdeaProjects\\OrangeHRM18\\src\\test\\Resources\\Config.properties";
    static FileInputStream input;

    public String getProperty(String key)
    {
        prop=new Properties();
        try
        {
            input=new FileInputStream(filelocation+fielName);
            prop.load(input);
            input.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
