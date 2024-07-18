
public class ElectricScotter extends Vehicle
{
    //declearing the variables for the class Electricscotter
    private int range;
    private int batterycapacity;
    private int price;
    private String chargingtime;
    private String brand;
    private String mileage;
    private boolean haspurchased;
    private boolean hassold;
    
    /* Creating parameterized Constructor with attributes vehicleID, vehiclename, vehicleweight, vehcilespeed,vehiclecolor and
    batterycapacity */
    
    public ElectricScotter(int vehicleID, String vehiclename, String vehiclecolor,String vehicleweight,String 
    vehiclespeed,int batterycapacity)
    {
    
       //using superkeyword to call superclass constructor of parentclass
       super(vehicleID,vehiclename,vehiclecolor,vehicleweight); 
       
       this.range=0;
       this.batterycapacity= batterycapacity;
       this.price=0;
       this.brand= "";
       this.mileage="";
       this.haspurchased= false;
       this.hassold= false;
       super.setvehiclespeed(vehiclespeed);
       super.setvehiclecolor(vehiclecolor);
    }
    
    // accessor method for each attributes.
    public int getrange()
    {
         return this.range;
    }
    
    public int getbatterycapacity()
    {
         return this.batterycapacity;
    }
    
    public int getprice()
    {
         return this.price;
    }
    
    public String getchargingtime()
    {
         return this.chargingtime;
    }
    
    public String getbrand()
    {
         return this.brand;
    }
    
    public String mileage()
    {
         return this.mileage;
    }
    
    public Boolean gethaspurchased()
    {
         return this.haspurchased;
    }
    
    public Boolean gethassold()
    {
         return this.hassold;
    }
    
    
    
    // settermethod for each mentioned arrributes.
    public void  setbrand(String brand)
    {
    if(haspurchased == false)
    {
        this.brand= brand;
    }
    else
    {
        System.out.println("Electricscotter is already purchased and brand cannot be changed"+ this.haspurchased);
    }
    }  
    
    //Following is the method to purchase an electric scotter
    public void purchase(int price, int range, String chargingtime, String mileage, String brand)
    {
        if(this.haspurchased== false)
        {
            setbrand(brand);
            this.price = price;
            this.chargingtime = chargingtime;
            this.mileage= mileage;
            this.range= range;
            haspurchased= true;
        }
    }
    
    //Following is the method to sell an electricscotter
    public void sell(int price)
    {
        if(this.hassold== false)
        {
            price= price;
            range= 0;
            chargingtime="";
            mileage="";
            batterycapacity=0;
            hassold= true;
            haspurchased= false;
        }
        
        else
        {
            System.out.println("The electric scotter is already sold");
        }
    }
    
    //Following is the method to display the details of Electricscotter
    public void display()
    {
        super.display();
        if(this.haspurchased==true)
        {
            System.out.println("This is a Brand "+this.brand);
            System.out.println("This is a Price "+this.price);
            System.out.println("This is a Range "+this.range);
            System.out.println("This is a Chargingtime "+this.chargingtime);
            System.out.println("This is a Mileage "+this.mileage);
            System.out.println("This is a Batterycapacity "+this.batterycapacity);
        }
    }
    
    
}   

