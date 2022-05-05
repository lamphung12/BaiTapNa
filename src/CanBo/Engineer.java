package CanBo;

public class Engineer extends Cadres{
    private String specialized;

    public Engineer(String name, int age, String gender, String address, String specialized) {
        super(name, age, gender, address);
        this.specialized = specialized;
    }

    public Engineer(String specialized) {
        this.specialized = specialized;
    }
    public Engineer(){}

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString()+
                "specialized='" + specialized + '\'' +
                '}';
    }
}
