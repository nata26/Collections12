import java.util.ArrayList;

public class PersonArray {

    Person[] p = new Person[4];
    public void insert(String FirstName, String LastName, int age){

        for (int i = 0; i< p.length; i++)
            p[i] = new Person();

        for (int i = 0; i< p.length; i++){
            p[i].setFirstName(FirstName);
            p[i].setLastName(LastName);
            p[i].setAge(age);

        }
    }

    public void display(){
        for (int i = 0; i< p.length; i++){
            System.out.println("First name: " + p[i].getFirstName() + "\n" +
                    "Last name: " + p[i].getLastName() +"\n" +
                    "Age: " + p[i].getAge() + "\n*********************************");}



    }


}
