package CanBo;

public class Main {
    public static void main(String[] args) {
       ManageCadres manageCadres =new ManageCadres();
       manageCadres.add(new Cadres("lam",20,"male","Ha Noi"));
        manageCadres.add(new Engineer("huy",23,"female","Phu Tho","IT"));
        manageCadres.add(new Worker("Cong",31,"Male","Xuan Mai",4));
        manageCadres.add(new Staff("lam1",29,"Male","Ha Nam","cook"));
        manageCadres.display();

        manageCadres.search("huy");

      manageCadres.exit();



    }
}
