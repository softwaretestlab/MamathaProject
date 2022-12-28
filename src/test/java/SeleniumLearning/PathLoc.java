package SeleniumLearning;

import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

public class PathLoc {
//test
    @Test
    public void pathlocs() throws IOException {
        System.out.println(System.getProperty("user.dir")+ ReadPropertiesFile.PropFile("ExcelLocation"));
    }
}
