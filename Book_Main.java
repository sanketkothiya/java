class Book
{
 String author, title;
 Book(String a, String t)
 {
  author = a;
  title = t;
 }
}
class BookDetails extends Book
{
 float price;
 int stock_position;
 int purchase;
 int sell;
 BookDetails(String a, String t,float amt, int pur, int s)
 {
  super(a, t);
  price = amt;
  purchase = pur;
  sell = s;
  stock_position = purchase - sell;
 }
 void show()
 {
  System.out.println("\nBook Details:\n");
  System.out.println("Title: " + title);
  System.out.println("Author: " + author);
  System.out.println("Price: " + price);
  System.out.println("Purchase: " + purchase);
  System.out.println("Sell: " + sell);
  System.out.println("Stock Available: " + stock_position);
 }
}
class Book_Main
{
 public static void main(String[] args) 
 {
  BookDetails ob1 = new BookDetails("Herbert Schildt", "Complete Reference", 2359.50F, 500, 370);
  BookDetails ob2 = new BookDetails("Ulman", "system programming", 359.50F, 400, 198);
  BookDetails ob3 = new BookDetails("Pressman", "Software Engg", 879.50F, 1000, 674);
  ob1.show();
  ob2.show();
  ob3.show();
 }
}