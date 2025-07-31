package Lib;

public  final class Product {
    private final String productId ;
    private final String productName ;
    private final Double price ;
    
    // Rep Inveriant (RI):
    // - producyId and productName are not null or blank.
    // - price >= 0
    // 
    // Abstraction Function (AF):
    // - AF(productId, productName, price) = A product with the 

    /**
     * ตรวจสอบว่า Rep Inveriant เป็นจริงหรือไม่
     */
    private void checkRep(){
        if(productId == null || productId.isBlank()){
            throw new RuntimeException("RI violated : productId");
        }
        if(productName == null || productName.isBlank()){
            throw new RuntimeException("RI violated : productName");
        }
        if(price < 0){
            throw new RuntimeException("RI violated : price");
        }
    }
    /**
     * สร้างอ็อบเจกต์ product
     * @param productId รหัสสินค้า ห้ามเป็นค่าว่าง
     * @param productName ชื่อสินค้า ห้ามเป็นค่าว่าง
     * @param price ราคา ต้องไม่ติดลบ
     * @throws IllgalArgumentException หากคุณสมบัติ
     */

     public Product(String productId, String productName, Double price){
        this.productId = productId ;
        this.productName = productName ;
        this.price = price ;
        checkRep(); //ตรวจสอบความถูกต้องทุกครั้งที่สร้าง
     }

     /**
      * @return รหัสสินค้า
      */
    public String getProductId(){ return productId ;}

    /**
     * @return ชื่อสินค้า
     */
    public String getProductName(){ return productName ;}

    /**
     * @return ราคาของสินค้า
     */
    public Double getPrice(){ return price ;}

}
