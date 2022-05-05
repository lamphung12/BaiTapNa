package File;

import Manage.ManageRole;
import Model.Role;
import Model.Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUserCSV {
    public static List<Users> readFromFile() throws IOException {
        ManageRole manageRole = new ManageRole();
        File roleFile = new File("users.csv");
        List<Users> users = new ArrayList<>();
        Scanner scanner = new Scanner(roleFile);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            } else {
                String arr[] = line.split(",");
                Role role = manageRole.findById(Integer.valueOf(arr[4]));
                Users user = new Users(Integer.valueOf(arr[0]), arr[1], arr[2],arr[3],role);
                users.add(user);
            }
        }
        return users;
    }

    public static void writeToFile(List<Users> list) throws FileNotFoundException {
        File roleFile = new File("users.csv");
        PrintWriter printWriter = new PrintWriter(roleFile);
        printWriter.print("id,username,password,status,role");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        printWriter.close();
    }
}
