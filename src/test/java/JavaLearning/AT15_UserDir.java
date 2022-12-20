package JavaLearning;

import org.junit.Test;

public class AT15_UserDir {
    @Test
    public void UserDirectory(){
        System.out.println(System.getProperty("user.dir"));

       // C:\Users\softw\IdeaProjects\MamthaProject_STL\src\test\java\screenshots
        System.out.println(System.getProperty("user.dir")+"//screenshots//capture-1.jpeg");
    }
}
