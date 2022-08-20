import java.util.Arrays;

public class AuthApp3 {
    public static void main(String[] args) {

        //String[] users = {"seop", "sehee", "mong"};
        String[][] users = {
                {"seop", "1111"},
                {"sehee", "2222"},
                {"mong", "3333"}
        };
        System.out.println("users[1] = "+Arrays.toString(users[0]));
        System.out.println("users[2] = "+Arrays.toString(users[1]));
        System.out.println("users[3] = "+Arrays.toString(users[2]));


        String inputId = args[0];
        String inputPass = args[1];

        boolean isLoginde = false;
        for (
                int i = 0;
                i < users.length; i++) {
            String[] current = users[i];
            System.out.println("users[i] = "+Arrays.toString(users[i]));
            if (
                    current[0].equals(inputId) &&
                            current[1].equals(inputPass)
            ) {
                isLoginde = true;
                break;
            }
        }
        System.out.println("hi");
        if (isLoginde) {
            System.out.println("Master !!");
        } else {
            System.out.println("Who are you?");
        }
    }
}

