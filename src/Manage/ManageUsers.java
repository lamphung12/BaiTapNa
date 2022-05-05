package Manage;

import File.FileUserCSV;
import Model.Users;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageUsers {
    private List<Users> usersList = new ArrayList<>();
    public static Users currentUser=null;

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    public ManageUsers() throws IOException {
        usersList= FileUserCSV.readFromFile();
    }

    public static Users getCurrentUser(){
        return currentUser;
   }

   public static void setCurrentUser(Users currentUser){
        ManageUsers.currentUser=currentUser;

   }

   public void add(Users users){
        usersList.add(users);
   }

   public Users findById(int id){
        return usersList.get(findIndexOfId(id));
   }

   public void edit(int id, Users users){
        usersList.set(findIndexOfId(id),users);
   }

   public void delete(int id){
        usersList.remove(findById(id));
   }

   public void findAll(){
       for (int i = 0; i < usersList.size() ; i++) {
           System.out.println(usersList.get(i));
       }
   }

   public int findIndexOfId(int id){
       for (int i = 0; i < usersList.size() ; i++) {
           if(usersList.get(i).getId()==id){
               return i;
           }
       }
        return -1;
   }

    public int login(String username, String password) {
        for (Users user : usersList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                return 1;
            }
        }
        return 0;
    }


}
