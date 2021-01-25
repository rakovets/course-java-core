public class Cat {

    String name;
    int age;
    int weight;

    public void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 5;
        barsik.name = "barsik";
        barsik.weight= 2;

        Cat pushok = new Cat();
        pushok.name="pushok";
        pushok.age=10;
        pushok.weight=15;

        System.out.println(barsik.name);
        barsik.getVolume();
        barsik.weithGain();
    }
    public int getVolume() {
        int volume = age;
        return volume;
    }

    public void weithGain(){
       int gainVolume=2;
        weight=age*gainVolume;
        System.out.println("weight: "+ weight);
    }
}
