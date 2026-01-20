public class Villa extends House implements HeatSystem {

    public Villa(int area, int roomCount) {
        super(area, roomCount);
    }

    @Override
    public void usageType() {
        System.out.println("Mustakil villa");
    }

    @Override
    public void heat() {
        System.out.println("Yerden isitma sistemi");
    }
}
