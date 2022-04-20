package HoGiaDinh1;

import java.util.ArrayList;
import java.util.List;

public class Family implements Interface<Person1>{
   private List<Person1> PersonList = new ArrayList<>() ;

    private String address;
    private int soThanhVien;

    public Family() {
    }

    public Family(String address) {
        this.address = address;
        this.soThanhVien = soThanhVien;
    }

    public Family(List<Person1> personList, String address, int soThanhVien) {
        PersonList = personList;
        this.address = address;
        this.soThanhVien = soThanhVien;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    @Override
    public void add(Person1 person1) {
       PersonList.add(person1);
       this.soThanhVien++;
    }

    @Override
    public void edit(int id ,Person1 person1) {
      if(findByName(id) !=-1){
         PersonList.set(findByName(id),person1);
      }else {
          System.out.println("Khong co trong danh sach");
      }
    }

    @Override
    public void delete(int id) {
        if(findByName(id) !=-1){
            PersonList.remove(findByName(id));
            this.soThanhVien--;
        }else{
            System.out.println("Khong co trong danh sach");
        }
    }


    @Override
    public void display() {
        System.out.println("Dia chi:"+ address + "So thanh vien" + soThanhVien);
        for (int i = 0; i < PersonList.size(); i++) {
            System.out.println(PersonList.get(i));
        }
        System.out.println("--------------------");
    }

    @Override
    public int findByName(int id) {
        for (int i = 0; i < PersonList.size(); i++) {
            if(PersonList.get(i).getId()==id){
               return i;
            }
        }
        return -1;
    }
    public void printSmallAge(){
        int minAge = PersonList.get(0).getAge();
        int inDexOfMin = 0;
        for (int i = 0; i <PersonList.size() ; i++) {
            if(minAge > PersonList.get(i).getAge()){
                minAge = PersonList.get(i).getAge();
            inDexOfMin = i;
            }
        }
        System.out.println(PersonList.get(inDexOfMin));

//        for (int i = 0; i <PersonList.size() ; i++) {
//            if(minAge > PersonList.get(i).getAge()){
//                System.out.println(PersonList);
//
//            }
//        }

    }

}
