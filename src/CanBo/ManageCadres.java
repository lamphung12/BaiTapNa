package CanBo;

import java.util.ArrayList;

public class ManageCadres implements interface1<Cadres>{
    private ArrayList<Cadres> arrayList = new ArrayList<>();

    public ManageCadres(ArrayList<Cadres> arrayList) {
        this.arrayList = arrayList;
    }

    public ManageCadres() {
    }

    @Override
    public void add(Cadres cadres) {
        arrayList.add(cadres);
    }

    @Override
    public void search(String name) {
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getName().equals(name)){
                System.out.println(arrayList.get(i));
            }
        }

    }

    @Override
    public void display() {
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-------------");
    }

    @Override
    public void exit() {
       System.exit(0);
    }
}
