
/**
 * Abstract class CellphoneObject - write a description of the class here
 *
 * @author (LR_Thulo)
 * @version (03/08/2022)
 */
public abstract class cellphoneObject
{
    private String fName;
    private String lName;
    private int postCode;
    private String networkProvider;
    private double cellNumber;
    
    protected cellphoneObject()
    {   
    }
    
    protected cellphoneObject(String fName, String lName, int postCode, String networkProvider)
    {
    setfName(fName);
    setlName(lName);
        setPostCode(postCode);
        setNetworkProvider(networkProvider);
        setCellNumber(cellNumber);
    }
    
    public String getFName()
    {
         return fName;   
    }
    
    public void setfName(String firstName)
    {
         this.fName = fName;   
    }
    
    public String getLName()
    {
         return lName;   
    }
    
    public void setlName(String lName)
    {
         this.lName = lName;   
    }
    
    public int getpostCode()
    {
         return postCode;   
    }
    
    public void setPostCode(int postCode)
    {
         this.postCode = postCode;   
    }
    
    public String getNetworkProvider()
    {
         return networkProvider;   
    }
    
    public void setNetworkProvider(String networkProvider)
    {
         this.networkProvider = networkProvider;   
    }
    
    public double getCellNumber()
    {
         return cellNumber;   
    }
    
    public void setCellNumber(double cellNumber)
    {
         this.cellNumber = cellNumber;   
    }
    
    @Override
    public String toString() 
    {
         return   "User Names: " + getFName() + getLName()+ "Cell Number: " + getCellNumber();
    }
    
    public abstract String displayCellphoneAccount();
}
