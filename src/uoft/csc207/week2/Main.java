// password for something
// qq495142
// ahKi9eegee

package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Ark", "Jo", "K"};
	    Person p = new Person(name, "moogah");
        String[] name2 = {"faisal"};
        Person s = new Student(name2, "fai", "1095");
        System.out.println(p);
        System.out.println(s);
    }
}
