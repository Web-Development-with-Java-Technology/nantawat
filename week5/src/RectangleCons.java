public class RectangleCons {
    // สร้าง Properties ซึ่งส่วนนี้เป็น Private มีการซ่อนเอาไว้
  private double width;
  private double height;
  String name;

  // สร้าง Method พิเศษ ที่เรียกว่า Constructor

  // ค่าเริ่มต้น
  public RectangleCons() {
    this.width = 1.0;
    this.height = 1.0;
    this.name = "Rectangle";
  }

  // Overloading Constructor
  public RectangleCons(double width, double height) {
    this.setSize(width, height);
    this.name = "This is Rectangle";
  }

  public RectangleCons(double width, double height, String name) {
    this.setSize(width, height);
    this.name = name;
  }

  // Setter()
  public void setWidth(double width) {
    // มีการเช็คเงื่อนไขเพื่อตรวจสอบว่าค่าที่ใส่เข้าไปเป็นบวกหรือไม่
    if (width == 0)
      this.width = 1.0;
    else
      this.width = Math.abs(width); // width is always positive
  }

  public void setHeight(double height) {

    if (height == 0) // height เท่ากับ 0 ให้ใส่ค่าเป็น 1
      this.height = 1.0;
    else
      this.height = Math.abs(height); // มีการแปลงค่า ถ้าใส่ค่าติดลบ(-10)เข้ามา มันจะแปลงเป็นค่าบวก(10)
  }

  // ใช้สำหรับเรียกใช้งานเพื่อรับค่า Width กับ height ในครั้งเดียว
  public void setSize(double width, double height) {
    this.setWidth(width);
    this.setHeight(height);
  }

  // Getter()
  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  // Function คำนวณ
  public double computeArea() {
    return this.width * this.height;
  }

  // Function การแสดงผล
  public void displayDetail() {
    System.out.println(" === Class Rectangle ===");
    System.out.println("Name: : " + this.name);
    System.out.println("Width  : " + this.width);
    System.out.println("Height : " + this.height);
    System.out.println("Area    : " + this.computeArea());
  }
}
