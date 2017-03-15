import java.util.ArrayList;

public class PersonMain {

    public static void instanceAll(Person[] p){
        for (int i = 0; i< p.length; i++)
            p[i] = new Person();
    }
    public static void insert(Person[] p){

        for (int i = 0; i< p.length; i++){
            p[0].setFirstName("Sff");
            p[0].setLastName("Joff");
            p[0].setAge(90);
            p[1].setFirstName("Smith");
            p[1].setLastName("John");
            p[1].setAge(40);
            p[2].setFirstName("jjj");
            p[2].setLastName("lll");
            p[2].setAge(90);
            p[3].setFirstName("aaa");
            p[3].setLastName("aaa");
            p[3].setAge(40);
        }
    }

    public static void display(Person[] p){
        for (int i = 0; i< p.length; i++){
            System.out.println("First name: " + p[i].getFirstName() + "\n" +
                    "Last name: " + p[i].getLastName() +"\n" +
                    "Age: " + p[i].getAge() + "\n*********************************");}



    }




    public static void main(String[] args){

        Person[] p = new Person[4];
        instanceAll(p);
        insert(p);
        display(p);



    }
}
