package ie.atu.productv3;

import ie.atu.productv3.Book;
import ie.atu.productv3.Software;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myProduct = null;

        ie.atu.productv3.Book myBook = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
        }


        ie.atu.productv3.Software mySoftware = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
        }
        ie.atu.productv3.Tv myTv = null;
        if (productCode.equalsIgnoreCase("Sony")) {
            myTv = new ie.atu.productv3.Tv();
            myTv.setCode(productCode);
            myTv.setDescription("4K ultra HD TV");
            myTv.setPrice(250.99);
            myTv.setManufacture("Sony");
            myTv.setScreensize(" 24' ");
            myProduct = myTv;
        }

        if (productCode.equalsIgnoreCase("LG")) {
            myTv = new ie.atu.productv3.Tv();
            myTv.setCode(productCode);
            myTv.setDescription("4K ultra HD, GigaPixel TV");
            myTv.setPrice(509.99);
            myTv.setManufacture("LG");
            myTv.setScreensize(" 65' ");
            myProduct = myTv;
        }

        if (productCode.equalsIgnoreCase("Samsung")) {
            myTv = new ie.atu.productv3.Tv();
            myTv.setCode(productCode);
            myTv.setDescription("8K ultra HD, Gigapixel, 144Hz TV");
            myTv.setPrice(1200.99);
            myTv.setManufacture("Samsung");
            myTv.setScreensize(" 65' ");
            myProduct = myTv;
        }

        ie.atu.productv3.Music myMusic = null;
        if (productCode.equalsIgnoreCase("Mj")) {
            myMusic = new ie.atu.productv3.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("His Best hit of all time");
            myMusic.setPrice(50);
            myMusic.setArtist(" Billy Jean ");
            myMusic.setLabel(" King of pop");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("Post Malone")) {
            myMusic = new ie.atu.productv3.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("His Best hit of all time");
            myMusic.setPrice(40);
            myMusic.setArtist(" Rockstar ");
            myMusic.setLabel("Steeltown, Motown, Epic, Legacy, Sony, MJJ Productions");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("Eminem")) {
            myMusic = new ie.atu.productv3.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("His Best hit of all time");
            myMusic.setPrice(50);
            myMusic.setArtist(" SlimShady ");
            myMusic.setLabel("Through Shady Reconds ");
            myProduct = myMusic;
        }

        return myProduct;
    }
}
    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}

