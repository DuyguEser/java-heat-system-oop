public class TestHouse {
    public static void main(String args[]) {

        House h1 = new Apartman(90,3);
        House h2 = new Villa(250,6);

        House[] houses = {h1,h2};

        for(House h : houses) {
            h.bilgiGoster();
            h.usageType();

            if(h instanceof HeatSystem){
                ((HeatSystem) h).heat();
            }

            System.out.println("------------------");
        }
    }
}
