public class Main {
    public static void main(String[] args) {
    /*    AddCat cat = new AddCat("Gdansk");
        cat.catrace();
        cat.setName("Amily");
        cat.setAge(5);
        cat.setSterilized(true);
        cat.catInfoCollector(cat);


        AddDog dog = new AddDog("Warsaw");
        dog.size();
        dog.chooseDogHouse(dog);
        dog.dograce();
        dog.height();*/


       Reptiles reptile = new Reptiles("Lodz");
        reptile.defineAnimal();
        reptile.addAnimal();
        reptile.defineAnimal();
        reptile.addAnimal();
        System.out.println("Is vet required? "+reptile.isVetRequired());


        Hosts host = new Hosts();
        host.collectInfo();

    }
}