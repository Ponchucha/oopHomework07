public class Vacancy {
    private String companyName;
    private double salary;
    private boolean distantWork;    

    public Vacancy(String companyName, double salary, boolean distantWork){
        this.salary = salary;
        this.distantWork = distantWork;
        this.companyName = companyName;
    }


    protected String getCompanyName(){
        return companyName;
    }


    protected double getSalary(){
        return salary;
    }


    protected boolean getDistantWork(){
        return distantWork;
    }
    
}
