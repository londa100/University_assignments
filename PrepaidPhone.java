
/**
 * Write a description of class PrepaidUser here.
 *
 * @author (LR_Thulo)
 * @version (03/08/2022)
 */
public class PrepaidPhone extends cellphoneObject
{
       private int freeMinutesBalance;
       private int amountBalance;
       
       public PrepaidPhone()
       {
         super();
         freeMinutesBalance =0;
         amountBalance = 0;
           
        }
        
        public PrepaidPhone(String fName, String lName, int postCode, String networkProvider, int freeMBalance, int amtBalance )
        {
                super(fName, lName, postCode, networkProvider);
                setFreeMinuteBalance(freeMBalance);
                setAmountBalance(amtBalance);
   
        }
        
        public void setFreeMinuteBalance(int fmb)
        {
             freeMinutesBalance = fmb;   
        }
        
        public int getFreeMinuteBalance()
        {
             return freeMinutesBalance;   
        }
        
        public void setAmountBalance(int amt)
        {
             amountBalance = amt;   
        }
        
        public int getAmountBalance()
        {
             return amountBalance;   
        }
        
        public String  displayCellphoneAccount()
        {
                String string = " Client Name: " + getFName()  + "\n Postal Code: " +
            getpostCode() + "\n Service Provider: " + getNetworkProvider() + "\n Cellphone Number: " + getCellNumber();
            return string;
        }
        
        
        public String toString()
    {
        return super.toString() + " Amount Balance: " + getAmountBalance();
    }
}
