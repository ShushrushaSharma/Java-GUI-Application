
public class AutoRickshaw extends Vehicle
{
    //declearing the variables
    private int enginedisplacement;
    private String torque;
    private int numberofseats;
    private int fueltankcapacity;
    private String groundclearence;
    private int chargeamount;
    private String bookeddate;
    private boolean isbooked;
    
    /*Creating parameterized constructor with attributes vehicleID, vehiclename, vehicleweight, vehcilespeed, enginedisplacement,
    torque, fueltankcapacity and groundclearence */
    public AutoRickshaw (int vehicleID, String vehiclename, String vehiclecolor,String vehicleweight, String 
    vehiclespeed, int engineDisplacement, String torque, int fueltankcapacity, String groundclearence)
    {
        //using super keyword to call the constructor of parent class to display it's attributes
        super(vehicleID,vehiclename,vehiclecolor,vehicleweight);
        
        this.enginedisplacement= engineDisplacement;
        this. torque= torque;
        this. fueltankcapacity= fueltankcapacity;
        this.groundclearence= groundclearence;
        this. isbooked= false;
        setvehiclespeed (vehiclespeed);
        setvehiclecolor (vehiclecolor);
    }
    
    // accessor methods for each attributes of class AutoRickshaw
    public int getengineDisplacement()
    {
         return this.enginedisplacement;
    }
    
    public String gettorque()
    {
         return this.torque;
    }
    
    public int getfueltankcapacity()
    {
         return this.fueltankcapacity;
    }
    
    public String getgroundclearence()
    {
         return this.groundclearence;
    }
    
    public int getchargeamount()
    {
         return this.chargeamount;
    }
    
    public String getbookeddate()
    {
         return this.bookeddate;
    } 
    
    public boolean getisbooked()
    {
         return this.isbooked;
    }
    
    public int getnumberofseats()
    {
         return this.numberofseats;
    }
    
    //setter methods for particular mentioned variables.
    public void  setchargeamount(int chargeamount)
    {
        this.chargeamount= chargeamount;
    } 
    
    public void  setnumberofseats(int numberofseats)
    {
        this.numberofseats= numberofseats;
    } 
    
    //this is a method to book an Autorikshaw
    public void bookAutoRikshaw(String Bookeddate, int chargeamount, int numberofseats) 
    {
        /*initializing the attribute booked date with the parameter value,calling the method, seeting it's isbooked status as true 
        with an appropriate message including car id is booked when isbooked is false*/
        if(this. isbooked== false)
        {
            this.bookeddate= Bookeddate;
            setchargeamount(chargeamount);
            setnumberofseats(numberofseats);
            System.out.println("The"+ getVehicleID()+ "is booked");
            this.isbooked= true;
        }
        /* otherwise displaying the status of isbooked and a message such as auto rickshaw is already 
        booked */
        else 
        {
            System.out.println("The AutoRiskhaw is already booked");
        }
    }
    
    
    // method to display the details of Autorikshaw class
    public void display()
    {
        super.display(); //this displays the attributes of parentclass 
        if(this. isbooked== true)
        {
            System.out.println("This is EngineDisplacement "+ enginedisplacement);
            System.out.println("This is Torque "+ torque);
            System.out.println("This is Fueltankcapacity "+ fueltankcapacity);
            System.out.println("This is Groundclearence "+ groundclearence);
            System.out.println("Booked date is "+ this.bookeddate);
        }
        //displaying charge amount is not set when chargeamount is zero
        if(this. chargeamount==0)
        {
          System.out.println("The Chargeamount is not set");
        }
    
        //otherwise displaying the chargeamount
        else
        {
          System.out.println("This is Chargeamount " +chargeamount);
        }
        
        //displaying numberofseats is empty when the numerofseats is zero
        if(this.numberofseats==0)
        {
          System.out.println("Numberofseats is empty");
        }
        
        //otherwise displaying the numberofseats
        else
        {
            System.out.println("This is number of seats " +numberofseats);
        }
    
    }
}
