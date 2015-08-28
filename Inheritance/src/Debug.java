import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected 
                                      // static variable

    public Product()			//Products to Product
    {
        code = "";
        description = "";
        price = 0;
    }
    public String getFormattedPrice()
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override 		//Changed it from Overrides to Override
   
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    // create public access for the count variable
    public static int getcount()   
    {                              
        return count;
    }
}