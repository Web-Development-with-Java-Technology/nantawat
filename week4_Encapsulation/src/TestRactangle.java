public class TestRactangle {
    public static void main(String[] args) {
        Ractangle rect = new Ractangle();
        rect.height = 50;
        rect.width = 20;
        rect.name = "Rect 1";

        System.out.println("Name : " + rect.name);
        System.out.println("Width : " + rect.width + " Height : " + rect.height);
        System.out.println("Area : " + rect.computeArea());
        
    }
}
