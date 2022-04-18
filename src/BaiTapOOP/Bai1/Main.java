package BaiTapOOP.Bai1;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
  ////---------------them-----------///
        list.add(new Person("lam",20,12434));
        list.add(new Person("huy",23,11434));
        list.add(new Person("quangCc",30,13334));
        list.add(new Person("HuyGG",28,88434));

        System.out.println("---------------------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
         //////////////-----------Sua ----------/////
        list.set(0,new Person("NamRed",12,99999));
        System.out.println("---------------------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        ///////////////----------xoa ---------////
        list.remove(1);
        System.out.println("---------------------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //////-----timm theo ten-------////
        System.out.println("-----------------");
         int indexOf = -1;
        for (int i = 0; i <list.size() ; i++) {
           if(list.get(i).getName().equals("lam")){
               indexOf = i;
           }

        }
        System.out.println(indexOf);

        /////-----in ra thanh vien nho tuoi nhat -------////
        System.out.println("--------------");
          int minAge= list.get(0).getAge();
        for (int i = 0; i <list.size() ; i++) {
           if(minAge>list.get(i).getAge()){
               minAge=list.get(i).getAge();
           }
        }
        System.out.println(minAge);
    }
}
