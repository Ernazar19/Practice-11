import java.time.LocalDate;
import java.util.Locale;

public class Pasport {

    String lastName;
    String firstName;
    LocalDate date = LocalDate.of(2003,01,19);
    String gender;
    String countryOfBirth;
    int id;
    void getinfo(){
        System.out.println("Last name        "+lastName);
        System.out.println("First name       "+firstName);
        System.out.println("Year of birth    "+date);
        System.out.println("Gender           "+gender);
        System.out.println("Country Of Birth "+countryOfBirth);
        System.out.println("                           id"+id);




    }
}
