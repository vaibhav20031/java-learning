public class animalname extends animal {
    String speciesname;
    public animalname(String name) {
        super("roar");
        speciesname = name;
    }

    public void showname() {
        System.out.println("animal name:" + speciesname);
    }
}
