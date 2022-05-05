package Manage;

import File.FileRoleCSV;
import Model.Role;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageRole {
    private List<Role> roleList = new ArrayList<>();

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public ManageRole() throws IOException {
        roleList = FileRoleCSV.readFromFile();
    }

    public void addRole(Role role) {
        roleList.add(role);
    }

    public void edit(int id, Role role) {
        int viTRiSua = findIndexById(id);
        if(viTRiSua==-1){
            System.out.println("Ko tim thay ");
        }else{
           roleList.set(viTRiSua,role);
        }

    }

    public void delete(int id){
      int index = findIndexById(id);
      if(index==-1){
          System.out.println("Ko tim thay ");
      }else{
     roleList.remove(index);
      }

    }
    public Role findById(int id){
        return roleList.get(findIndexById(id));
    }

    public void show(){
        for (int i = 0; i < roleList.size() ; i++) {
            System.out.println(roleList.get(i));
        }
    }
    public int findIndexById(int id) {
        for (int i=0; i<roleList.size(); i++) {
            if (roleList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
