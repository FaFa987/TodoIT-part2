package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AppUser user1 = new AppUser("John", "Doe");

        System.out.println("hashCode is: " + user1.hashCode());
        System.out.println(user1.toString());
        user1.generatePassword();
        System.out.println(user1.userInfo());
        System.out.println("------------");
        AppUser user2 = new AppUser("Peter", "Will");
        System.out.println("hashCode is: " + user2.hashCode());
        System.out.println("generatePassword is: " + user2.toString());







        }
    }