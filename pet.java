public class Pet {
    public static void main(String[] args) {
        Pet pet2 = new Pet();
        pet2.setName("Charlie");
        pet2.setAge(8);
        pet2.setLocation("Quaretined");
        pet2.setType("Yorkie");
        System.out.println(pet2.getName());
        Pet pet1 = new Pet("Bam-Bam", 8, "Charlotte", "Maltesse");
        System.out.println(pet1.getName());
    }
    private String name, location, type;
    private int age;
    Pet() {
        this.name = "Capone";
        this.age = 3;
        this.location = "North Carolina";
        this.type = "Dog";
    }
    Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setType(String type) {
        this.type = type;
    }
}