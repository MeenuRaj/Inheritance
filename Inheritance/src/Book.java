// This is the book class corrected
public class Book extends Product
{
    private String author;

    public Book()
    {
    	super();
        count++;
        author = "";
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return author;
    }


    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }
}