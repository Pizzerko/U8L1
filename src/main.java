import java.util.*;
public class main {
    public static void main(String[] args) {
        String[][] names = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "fred", "Jill", "Matt"}};

        names[1][2] = "Paul";

        String rem = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = rem;

        String[] temp = names[0];
        names[0] = names[1];
        names[1] = temp;

        for(String[] students : names) {
            System.out.println(Arrays.toString(students));
        }
        System.out.println(names[0][2] + names[2][0]);
    }

}
