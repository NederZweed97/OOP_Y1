package week2.cat;

public class Main {


    public static void main(String[] args){
        Cat duuk = new Cat("Duuk", 3.4);
        Owner saar = new Owner();
        Owner frank = new Owner();
        saar.adoptCat(duuk);
        System.out.println(saar.petCat());
        frank.petUnknownCat(duuk);
        System.out.println(saar.happinessCheck());
        System.out.println(saar.petCat());
        System.out.println(saar.happinessCheck());
    }

}
