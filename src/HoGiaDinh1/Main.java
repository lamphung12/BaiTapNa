package HoGiaDinh1;

public class Main {
    public static void main(String[] args) {
      Family family= new Family("Ha Noi");
      family.add(new Person1("lam",23,123));
      family.add(new Person1("huy",20,113));
      family.add(new Person1("kho",23,133));
      family.add(new Person1("lad",23,223));
      family.display();
     family.delete(113);
     System.out.println("Gia dinh sau khi xoa");
//     family.display();
     Family family1=new Family("Vinh Phuc");
     family1.add(new Person1("ha",12,1));
     family1.add(new Person1("na",12,2));
     family1.add(new Person1("ha1",12,6));
     family.display();

     family1.findByName(1);
     family1.display();

      family.printSmallAge();

      family.edit(1,new Person1("long",20,111));
      family.display();

      Town town = new Town();
      town.add(family);
      town.add(family1);
      town.display();







    }
}
