package CanBo;

public class Staff extends Cadres{
    private String cook;

    public Staff(String name, int age, String gender, String address, String cook) {
        super(name, age, gender, address);
        this.cook = cook;
    }

    public Staff(String cook) {
        this.cook = cook;
    }
    public Staff(){

    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString()+
                "cook='" + cook + '\'' +
                '}';
    }
}
