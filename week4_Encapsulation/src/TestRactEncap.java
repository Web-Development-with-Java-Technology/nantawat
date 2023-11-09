public class TestRactEncap {
    public static void main(String[] args) {
        RactEncap rectt = new RactEncap();
        rectt.setWidth(100);
        rectt.setHeight(50);
        rectt.name = "Rect 1";

        System.out.println("Object name: " + rectt.name);
        System.out.println("Width = " + rectt.getWidth() + "Height = " + rectt.getHeight());
        System.out.println("Area = " + rectt.computeArea());

    }
    
}
