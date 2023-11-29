public class TestRectCons {
    public static void main(String[] args) {

        // สร้าง Object เพื่อเรียกใช้งาน Class โดยจะเรียกแบบ Constructor
        RectangleCons rect1 = new RectangleCons(); // Default Constructor
        RectangleCons rect2 = new RectangleCons(10.0, 20.0); // Overloading Constructor
        RectangleCons rect3 = new RectangleCons(-20.0, 40.0, "Rect3"); // Overloading Constructor
    
        // การใส่ค่าให้กับ Object แบบ Default ถ้าไม่ใส่มันจะดึงค่าที่อยู่ใน Class มาใช้
        rect1.setWidth(100);
        rect1.setHeight(50);
        // rect1.setSize(100, 50);
        rect1.name = "Rect1";
    
        // การใส่ค่าให้กับ name เพื่อใส่เปลี่ยนแปลงค่า ถ้าไม่เปลี่ยนก็จะดึงค่าที่อยู่ใน
        // Class มาใช้
        rect2.name = "Rect2";
    
        // เรียก Method การแสดงผลมาใช้
        rect1.displayDetail();
        rect2.displayDetail();
        rect3.displayDetail();
    
      }
}
