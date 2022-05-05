package File;

import Model.Role;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRoleCSV {
    public static List<Role>readFromFile() throws IOException {
        File roleFile = new File("role.csv");
        List<Role> roles = new ArrayList<>();
        Scanner sc= new Scanner(roleFile);
        sc.nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }else{
                String arr[] = line.split(",");
                roles.add(new Role(Integer.valueOf(arr[0]), arr[1], arr[2]));
            }
        }
     return roles;
    }
    public static void writeToFile(List<Role>list) throws FileNotFoundException {
        File roleFile = new File("users.csv");
        PrintWriter printWriter = new PrintWriter(roleFile);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        printWriter.close();
    }
}
