

public class Student implements Observer {

    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
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
        if ((this.salary < vacancy.getSalary())){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %s - %f]\n", this.name, 
            distantType,
            vacancy.getCompanyName(), 
            vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %s - %f]\n", this.name, 
             distantType,
            vacancy.getCompanyName(), 
            vacancy.getSalary());
        }
    }
}
