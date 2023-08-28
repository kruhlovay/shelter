public class Shelter {
    private String city;

    public int getInitialCount() {
        return initialCount;
    }

    public void setInitialCount(int initialCount) {
        this.initialCount = initialCount;
    }

    private int initialCount;
    public Shelter(String city) {
        this.city=city;
    }


    public int addAndCount(){
        int count=initialCount + 1;
        return count;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public boolean isSterilized() {
        return isSterilized;
    }

    public void setSterilized(boolean sterilized) {
        isSterilized = sterilized;
    }

    private boolean isSterilized;


}