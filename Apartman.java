public class Apartman extends House implements HeatSystem {

    public Apartman(int area, int roomCount) {
        super(area, roomCount);
    }

    @Override
    public void usageType(){
        System.out.println("Apartman dairesi");
    }

    @Override
    public void heat(){
        System.out.println("Kombi ile isiniyor");
    }
}
