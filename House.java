public abstract class House {
    protected int area;
    protected int roomCount;

    public House(int area, int roomCount) {
        this.area = area;
        this.roomCount = roomCount;
    }

    public void bilgiGoster() {
        System.out.println("Alan: " + area + " m^2  Oda: " + roomCount);
    }

    public abstract void usageType();
}
