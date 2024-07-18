
public class Vehicle
{   
    //declearing the Variables
    private int vehicleID;
    private String vehiclename;
    private String vehiclecolor;
    private String vehicleweight;
    private String vehiclespeed;
    
    // parameterized constructor with attributes vehicleID, vehiclename, vehiclecolor and vehicleweight
    public Vehicle (int vehicleID, String vehiclename, String vehiclecolor,String vehicleweight) 
    { 
        this.vehicleID=vehicleID;
        this.vehiclename=vehiclename;
        this.vehiclecolor=vehiclecolor;
        this.vehicleweight=vehicleweight;
    } 
    
    //acessor method for each attributes.
    public int getVehicleID()
    {
         return this.vehicleID;
    }
     
    public String getvehicleName()
    {
        return this.vehiclename;
    }
    
    public String getvehicleweight()
    {
        return this.vehicleweight;
    }
    
    public String getVehiclecolor()
    {
         return this.vehiclecolor;
    }
    
    public String getVehiclespeed()
    {
         return this.vehiclespeed;
    }
    
    //setter method for mentioned variables
    public void setvehiclecolor(String vehiclecolor)
    {
        this.vehiclecolor= vehiclecolor;
    } 
    
    public void setvehiclespeed(String vehiclespeed)
    {
        this.vehiclespeed= vehiclespeed;
    } 
    
    public void display()
    {
        //display method to print the statements.
        System.out.println("The VehicleID is "+vehicleID);
        System.out.println("The Vehiclename is "+vehiclename);
        System.out.println("The Vehiclespeed is "+vehiclespeed);
        System.out.println("The Vehicleweight is "+vehicleweight);
        System.out.println("The Vehiclecolor is "+vehiclecolor);
        
        if (this.vehicleweight=="")
        {
            System.out.println("Empty");
        }
        
        }
        
    } 


