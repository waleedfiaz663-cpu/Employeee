public class Employeee {
    
    private String name;
    
    private double salary;
    
    private int hours;
    
    
    public void setname(String name){
        
        if(name.isEmpty())
        {
            
            throw new IllegalArgumentException("Name cannot be empty");
            
        }
            
        else{
            
            this.name=name;
            
        }
    }

    
    public void setsalary(double salary){
        
        if(salary<0)
        {
            
            throw new IllegalArgumentException("Salary cannot be negative");
            
        }

            
        else{
            
            this.salary=salary;
            
        }
    }

    
    public void sethours(int hours){
        
        if(hours<1||hours>12) {
            
            throw new IllegalArgumentException("hours should between 1 and 12");
            
        }

            
        else {
            
            this.hours=hours;
            
        }
    }

    
    public String getname()
    {
        return name;
    }

    
    public double getsalary()
    {
        return salary;
    }

    
    public int gethours()
    {
        return hours;
    }

    
    public static void main(String[]args){
        
        Employeee E=new Employeee();
        
        try{
            
        E.setname("Waleed");
            
        E.setsalary(20000);
            
        E.sethours(7);
            
        System.out.println(E.getname());
            
        System.out.println(E.getsalary());
            
        System.out.println(E.gethours());
            
        }
            
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
    }
}
