public class Listing {
   // These are examples properties
   private String title;
   private double price;

   // TODO: Add more properties
   private String brand;
   private String description;
   private double origPrice;
   private double discPrice;
   private double rating; 

   // Title
   public String getTitle() {
      return title; 
   }

   public void setTitle(String title) {
      this.title = title;
   }

   // Price
   public String getPrice() {
      return price; 
   }

   public void setPrice(double price) {
      this.price = price;
   }

   // Brand
   public String getBrand() {
      return brand; 
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   // Description
   public String getDescription() {
      return description; 
   }

   public void setDescription(String description) {
      this.description = description;
   }

   // Rating
   public double getRating() {
      return rating;
   }

   public void setRating(double rating) {
      this.rating = rating;
   }

   // Original Price
   public double getOrigPrice() {
      return origPrice;
   }

   public void setOrigPrice(double origPrice) {
      this.origPrice = origPrice;
   }

   // Discounted Price
   public double getDiscPrice() {
      return discPrice; 
   }

   public void setDiscPrice(double discPrice) {
      this.discPrice = discPrice ;
   }

   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("Brand: " + brand);
      System.out.println("Description: " + description);
      System.out.println("Rating: " + rating); 
      if(price != discPrice) { 
         System.out.println("\tOld Price: " + origPrice); 
         System.out.println("\tSpecial Price: " + discPrice);
      }
      else { System.out.println("\tPrice: " + price); }
   }
}