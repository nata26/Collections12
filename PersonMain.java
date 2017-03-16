public class PersonMain {

    public static void instanceAll(Person[] p){
        for (int i = 0; i< p.length; i++)
            p[i] = new Person();
    }
    public static void insert(Person[] p){

        for (int i = 0; i< p.length; i++){
            p[0].setFirstName("Steve");
            p[0].setLastName("Jobs");
            p[0].setAge(60);
            p[1].setFirstName("Smith");
            p[1].setLastName("John");
            p[1].setAge(45);
            p[2].setFirstName("Mocanu");
            p[2].setLastName("Nata");
            p[2].setAge(21);
            p[3].setFirstName("Colins");
            p[3].setLastName("Ariel");
            p[3].setAge(36);
        }
    }

    public static void display(Person[] p){
        for (int i = 0; i< p.length; i++){
            System.out.println("First name: " + p[i].getFirstName() + "\n" +
                    "Last name: " + p[i].getLastName() +"\n" +
                    "Age: " + p[i].getAge() + "\n*********************************");}

    }

    public static int find (Person[] p, String LastName){

       int index = -1;
       for (int i=0; i<p.length;i++)
        if (p[i].getLastName().equals(LastName)){
           index = i;
            System.out.println("Elementul este pe pozitia: " + i);
            break;
        } else {
            System.out.println("Next!!!");
        }

        return index;
    }

    public static void delete(Person[] p, String LastName,int index){
        System.out.println(index);

        int size = 4;
        int poz = index;
        Person[] p1 = new Person[size];
        for (int i = 0; i < size; i++){
            if (i == poz) continue;
            p1[i]=p[i];
        System.out.println(p1[i].getLastName());
        }






    }



    public static void main(String[] args){

        Person[] p = new Person[4];
        instanceAll(p);
        insert(p);
        display(p);
        //find(p,"John");
        delete(p, "John", find(p, "John"));




    }
}
