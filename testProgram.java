
/**
 * Write a description of class testProgram here.
 *
 * @author (LR Thulo)
 * @version (03/08/2022)
 */
public class testProgram
{
    public static void main (String [] args)
    {       
        cellphoneObject [] users = new cellphoneObject[3];
        //users[0] = ContractPhone(0,"Londa Thulo",1920," Vodacom", "11/08/2021", "Samsung",2);
        //users[1] = new PrepaidPhone("Dwayne Jansen ","9 langrand", "Vanderbijlpark",2500, "Vodacom","08335423123","13/2/17", "Weekend plus100", "Nokia", 64,2);
        //users[2] = new PrepaidPhone("Castor Semenya","7 Fastlane", "Mahikeng",1234,"MTN","0823542333",300,55,6);
        
        System.out.println(" All Users");
        
        for(int i = 0; i <3; i++)
        {
            System.out.println("\n");
            System.out.println(users[i]);
            System.out.println("\n");
            System.out.println(users[i].displayCellphoneAccount());
        }
    }
}
