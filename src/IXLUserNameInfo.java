import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class UserDataCollector {
    private String userName;
    private static String filePath;
    private ArrayList<String> users;

    public UserDataCollector(String userName) {
        this.userName = userName;
        users = new ArrayList<String>();
       // filePath = "C://Users//BT_1E10_30//relyganesh//src//userdata.txt";
     filePath = "C://Users//O761823//IdeaProjects//Tester//src//main//java//IXL//userdata.txt";
    }


    public void createNewUserData() {
       // if (isNewUserData()) {
            try {
                File f = new File(filePath);
                f.createNewFile();
                FileWriter fw = new FileWriter(f,true);
                fw.write(userName+ "\n");
              //  users.add(userName);
                fw.close();

            } catch (IOException e) {
                System.out.println("Unable to create file");
                e.printStackTrace();
            }
        }
  //  }

    public boolean isNewUserData(){
        //
        //        Scanner read = new Scanner(filePath);
        //        while (read.hasNext()) {
        //            String line = read.nextLine();
        //            if (line.indexOf(userName) != -1) {
        //                System.out.println("This is a returning user");
        //                return false;
        //            }
        //        }
        //        System.out.println("This is a new user");
        //        return true;
//        File file = new File(filePath);
//
//        try (FileReader fr = new FileReader(file))
//        {
//            int content;
//            while ((content = fr.read()) != -1) {
//                char name = (char) content;
//                System.out.println(name);
//                if (name == userName){
//                    return false;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return true;
    }

    public String getUserInfo() {
        String name = userName;
        if (isNewUserData()) {
            Scanner read = new Scanner(filePath);
            while (read.hasNext()) {
                if (read.nextLine().indexOf(userName) != -1) {
                    return "Welcome back " + name;
                }
            }
                return "New user: Welcome!" + name;

        }
        return "";
    }
    public String getLastUser(){
        return users.get(users.size()-1);
    }
    public static void fileReader() {
//        File file = new File(filePath);
//
//        try (FileReader fr = new FileReader(file))
//        {
//            int content;
//            while ((content = fr.read()) != -1) {
//                System.out.print((String)content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("hi");
        Scanner read = new Scanner(filePath);
            while (read.hasNext()) {
          System.out.println(read.nextLine());
         }
    }
    public static void main(String[] args) {
        UserDataCollector udc = new UserDataCollector("riely");
        udc.createNewUserData();
        UserDataCollector uda = new UserDataCollector("rely");
        uda.createNewUserData();
        UserDataCollector udb = new UserDataCollector("riely");
        udb.createNewUserData();
        fileReader();
    }
}
