package BaiTapOOP.Bai1;

public class HoGiaDinh extends Person{
    private String address;
    private int soThanhVien;

    public HoGiaDinh(String name, int age, int numberCMND, String address, int soThanhVien) {
        super(name, age, numberCMND);
        this.address = address;
        this.soThanhVien = soThanhVien;
    }

    public HoGiaDinh() {
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
    public String toString() {
        return "HoGiaDinh{" +super.toString()+
                "address='" + address + '\'' +
                ", soThanhVien=" + soThanhVien +
                '}';
    }

}
