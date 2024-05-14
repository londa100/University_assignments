
/**
 * Write a description of class ContractUser here.
 *
 * @author (LR_Thulo)
 * @version (03/08/2022)
 */
public class ContractPhone extends cellphoneObject
{
    private String firstName, lastName;
    private String startDate;
    private String endDate;
    private String phoneName;
    private int freeMessagesLeft;
    
    public ContractPhone()
    {
         super();
         firstName = "";
         lastName = "";
         startDate = "";
         endDate= "";
         phoneName = "";
         freeMessagesLeft = 0;
    }
    
    public ContractPhone(String fName, String lName, int postCode, String networkProvider,String sDate, String eDate, String pName, int freeMLeft)
    {
        super(fName, lName, postCode, networkProvider);
        setStartDate(sDate);
        setEndDate(eDate);
        setPhoneName(pName);
        setFreeMessagesLeft(freeMLeft);
    }
    
    public void setStartDate(String sd)
    {
         startDate = sd;   
    }
    
    public String getStartDate()
    {
         return startDate; 
    }
    
    public String getEndDate()
    {
            return endDate;    
    }

    public void setEndDate(String ed)
    {
         endDate = ed;   

    }
        
    public String getPhoneName()
    {
             return phoneName; 
    }
    
    public void setPhoneName(String pn)
    {
        phoneName = pn;
    }
    
    public int getFreeMessagesLeft()
    {
         return freeMessagesLeft;   
    }
    
    public void setFreeMessagesLeft(int fml)
    {
            freeMessagesLeft = fml; 
    }
    
    @Override
    public String displayCellphoneAccount()
    {
       return " Client Name: " + getFName()  + "\n Postal Code: " + getpostCode() + "\n Service Provider: " + getNetworkProvider() + "\n Contract Start Date: " + getStartDate()
        + "\n Phone Name: " + getPhoneName() + "\n Free Messages Left: " + getFreeMessagesLeft(); 
        
    }
    
    public String toString()
    {
         String string = super.toString();
         string = string + "Phone name: " + getPhoneName();
         return string;
    }
    
    
      
      
     
      
}
