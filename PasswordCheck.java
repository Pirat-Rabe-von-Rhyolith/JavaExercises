package passwordcheck;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password, password2;
        char z;
        int zaehlerK = 0;
        int zaehlerG = 0;
        int zaehlerS = 0;
        int zaehlerN = 0;
        int testWert = zaehlerK * zaehlerG * zaehlerS * zaehlerN;
        int ascii;

        System.out.println("Bitte Passwort zweimal eingeben. Die Passwörter müssen übereinstimmen!");
        do {
            password = sc.next();
            password2 = sc.next();
            if (!password2.equals(password)) {
                System.out.println("Hinweis: Die Passwörter müssen übereinstimmen.");
            }
        } while (!password2.equals(password));

        if (password.equals(password2)) {
            for (int i = 0; i < password.length(); i++) {

                z = password.charAt(i);
                ascii = (int) z;
                if (ascii >= 97 && ascii <= 122) {
                    zaehlerK = zaehlerK + 1;
                }
                if (ascii >= 65 && ascii <= 90) {
                    zaehlerG = zaehlerG + 1;
                }
                if (ascii >= 33 && ascii <= 47) {
                    zaehlerS = zaehlerS + 1;
                }
                if (ascii >= 48 && ascii <= 57) {
                    zaehlerN = zaehlerN + 1;
                }

            }
            do {
                System.out.println("Das Passwort muss zwischen 8 und 14 Zeichen haben. Bitte neu eingeben:");
                do {
                    password = sc.next();
                    password2 = sc.next();
                    if (!password2.equals(password)) {
                        System.out.println("Hinweis: Die Passwörter müssen übereinstimmen.");
                    }
                } while (!password2.equals(password));

            } while (password.length() < 8 || password.length() > 14);

            if (testWert < 1) {
                System.out.println("Passwort muss Groß-& Kleinbuchstaben, Sonderzeichen und Zahlen enthalten! Bitte neu eingeben:");
                do {
                    password = sc.next();
                    password2 = sc.next();
                    if (!password2.equals(password)) {
                        System.out.println("Hinweis: Die Passwörter müssen übereinstimmen.");
                    }
                } while (!password2.equals(password));
            }
        }
        System.out.println("Eingabe erfolgreich!");

    }

}

