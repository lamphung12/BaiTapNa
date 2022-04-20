package HoGiaDinh1;

import java.util.ArrayList;
import java.util.List;

public class Town implements Interface<Family>{
    private List<Family> familyList= new ArrayList<>();

    public Town() {
    }

    public Town(List<Family> familyList) {
        this.familyList = familyList;
    }

    @Override
    public void add(Family family) {
        familyList.add(family);

    }

    @Override
    public void edit(int ad, Family family) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void display() {
        for (int i = 0; i < familyList.size(); i++) {
            System.out.println(familyList.get(i));
        }
        System.out.println("--------------------");
    }

    @Override
    public int findByName(int id) {
        return 0;
    }
}
