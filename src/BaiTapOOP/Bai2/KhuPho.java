package BaiTapOOP.Bai2;

import BaiTapOOP.Bai1.HoGiaDinh;
import BaiTapOOP.Bai1.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KhuPho extends HoGiaDinh {
    public KhuPho(String name, int age, int numberCMND, String address, int soThanhVien) {
        super(name, age, numberCMND, address, soThanhVien);
    }
    public KhuPho(){};

}
class test{
    public static void main(String[] args) {
        ArrayList<HoGiaDinh> khuPhoArrayList =new ArrayList<>();

        ///////--------them ho gia dinh --------///
        khuPhoArrayList.add(new HoGiaDinh("Huy",32,33333,"Tam Duong",3) );
        khuPhoArrayList.add(new HoGiaDinh("QuangCc",42,35533,"Tam Nong",4) );
        khuPhoArrayList.add(new HoGiaDinh("HuSS",22,33999," Duong Thanh",5) );
        khuPhoArrayList.add(new HoGiaDinh("NamNN",65,86512,"Tuong Duong",6) );
        System.out.println("------------------");
        for (int i = 0; i < khuPhoArrayList.size(); i++) {
            System.out.println(khuPhoArrayList.get(i));
        }
        ////----------Sua----------/////
        khuPhoArrayList.set(0,new HoGiaDinh("Lam",20,11335,"Tan Tien",2));
        System.out.println("------------------");
        for (int i = 0; i < khuPhoArrayList.size(); i++) {
            System.out.println(khuPhoArrayList.get(i));
        }
        ///////--------Xoa--------///
        khuPhoArrayList.remove(1);
        System.out.println("---------------------");
        for (int i = 0; i <khuPhoArrayList.size() ; i++) {
            System.out.println(khuPhoArrayList.get(i));
        }
        /////----------in ra ho gia dinh co nhieu nguoi nhat----///
        System.out.println("--------------");
        int maxPerson = khuPhoArrayList.get(0).getSoThanhVien();
        for (int i = 0; i < khuPhoArrayList.size() ; i++) {
            if(maxPerson < khuPhoArrayList.get(i).getSoThanhVien()){
                maxPerson = khuPhoArrayList.get(i).getSoThanhVien();
            }
        }
        System.out.println(maxPerson);
        ////--------in ra danh sach ho gd theo so thanh vien tang dan-----///
        System.out.println("-----------------");
      Collections.sort(khuPhoArrayList, new Comparator<HoGiaDinh>() {
          @Override
          public int compare(HoGiaDinh o1, HoGiaDinh o2) {
              return o1.getSoThanhVien()-o2.getSoThanhVien();
          }
      });
           for (int i = 0; i <khuPhoArrayList.size() ; i++) {
            System.out.println(khuPhoArrayList.get(i));
           }
        }
    }

