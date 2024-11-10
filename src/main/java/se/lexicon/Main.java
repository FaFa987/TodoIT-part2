package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AppUser user1 = new AppUser("John ", "Doe " , AppRole.ROLE_APP_USER);
        AppUser user2 = new AppUser("Peter", "Will");

        System.out.println(user1);
        System.out.println(user1.hashCode());
        System.out.println(user1.toString());
        System.out.println(user1.equals(user2));









        }
    }