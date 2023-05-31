public class DistantWorker implements Observer{
    private String name;
    private double salary;
    private boolean distantWork;

    public DistantWorker(String name){
        this.name = name;
        this.salary = 40000;
        this.distantWork = true;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        String distantType;
        if (vacancy.getDistantWork() == true){
            distantType = "Удалённая работа";
        }
        else{
            distantType = "Работа на территории работодателя";
        }
        if ((this.salary < vacancy.getSalary()) && (this.distantWork == vacancy.getDistantWork())){
            System.out.printf("Удалённый работник %s >>> Мне нужна эта работа! [%s - %s - %f]\n", this.name, 
            distantType,
            vacancy.getCompanyName(), 
            vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Удалённый работник %s >>> Я найду работу получше! [%s - %s - %f]\n", this.name, 
            distantType,
            vacancy.getCompanyName(), 
            vacancy.getSalary());
        }
    }    
}
