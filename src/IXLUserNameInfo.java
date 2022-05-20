import java.io.File;
import java.io.IOException;

public class IXLUserNameInfo {
private String userName;
    public IXLUserNameInfo(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public static boolean checkUserExistence() {
        try {
            File myObj = new File("UserNameData.txt");
            if (myObj.createNewFile()) {
                System.out.println("Ready to start practicing those math skills? " + myObj.getName().substring(0, myObj.getName().length() - 4));
                return false;

            }
            else {
                System.out.println("Ready for more practice? :)");
                return true;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }

    }
}
