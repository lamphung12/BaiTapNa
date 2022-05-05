
import File.FileUserCSV;
import Manage.ManageRole;
import Manage.ManageUsers;
import Model.Role;
import Model.Users;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ManageRole manageRole = new ManageRole();
        ManageUsers manageUsers = new ManageUsers();
        Scanner scanner= new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Dang nhap!");
            System.out.println("2. Dang ky!");
            System.out.println("Nhap vao lua chon!");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Dang nhap");
                    System.out.println("Nhập vào usn: ");
                    scanner.nextLine();
                    String usn = scanner.nextLine();
                    System.out.println("Nhập vào pass: ");
                    String pass = scanner.nextLine();
                    if(manageUsers.login(usn,pass)==-1){
                        int choice1 = -1;
                        while (choice!=0) {
                            System.out.println("Menu Customer");
                            System.out.println("0. Log out");
                            System.out.println("1. Xem thông tin");
                            System.out.println("2. Đổi pass");
                            if (ManageUsers.currentUser.getRole().getName().equals("Admin")) {
                                System.out.println("3. Thêm sửa xoá Role");
                            }

                            System.out.println("Nhập vào lựa chọn!");
                             choice1 = scanner.nextInt();
                            switch (choice1) {
                                case 1:
                                    System.out.println("1. Xem thông tin");
                                    break;
                                case 2:
                                    System.out.println("Nhập pass mới");
                                    scanner.nextLine();
                                    String newPass = scanner.nextLine();
                                    ManageUsers.currentUser.setPassword(newPass);
                                    FileUserCSV.writeToFile(manageUsers.getUsersList());
                                    break;
                                case 0:
                                    ManageUsers.currentUser = null;
                                    break;
                            }
                        }

                    }
                break;
                case 2:
                    System.out.println("Dang ky");
                    System.out.println("Nhập vào id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập vào usn: ");
                    String username = scanner.nextLine();
                    System.out.println("Nhập vào pass: ");
                    String password = scanner.nextLine();
                    String status = "1";
                    System.out.println("Nhập vào id role: ");
                    manageRole.show();
                    int idRole = scanner.nextInt();
                    Role role = manageRole.findById(idRole);
                    Users users = new Users(id,password,username,status,role);
                    manageUsers.add(users);
                    FileUserCSV.writeToFile(manageUsers.getUsersList());
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
            }
            System.out.println("----------------------------------------------");
        }

//        System.out.println(manageUsers.getUsersList().get(1).getRole());
//        FileRoleCSV.readFromFile();
//        ManageRole manageRole= new ManageRole();
    }
}
