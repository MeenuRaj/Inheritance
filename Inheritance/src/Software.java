//this is the software class corrected
public class Software extends Product
{
    private String version;

    public Software()
    {
        super();
        count++;
        version = "";
    }

    public void setVersion(String version)
    {
        this.version = version;
    }
    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
    }
}