class Encapsulate {
    
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public int getAge() {
        return geekAge;
    }
    public int getRoll() {
        return geekRoll;
    }
    public String getName() {
        return geekName;
    }

    public void setName(String newName) {
        geekName = newName;
    }
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
    public void setAge(int newAge) {
        geekAge = newAge;
    }
}



public class TestEncapsulation {
    public static void main(String[] args){

        Encapsulate obj = new Encapsulate();
        obj.setName("Harish");
        obj.setAge(18);
        obj.setRoll(53);

        System.out.println("geek name :" + obj.getName());
        System.out.println("geek age :" + obj.getAge());
        System.out.println("geek roll :" + obj.getRoll());

    }
}