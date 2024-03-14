import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1.

        System.out.println("----------------1.------------------");

        String name = "Dovydas";
        String lastName = "Jauniškis";
        int yOfBirth = 2005;
        int currentYear = 2024;


        int age = currentYear - yOfBirth;
        System.out.println("Aš esu " + name + " " + lastName + ". Man yra " + age + " metų");

        int first;
        int second;

        // 2.

        System.out.println("----------------2.------------------");

        int num1 = (int) Math.round(Math.random() * 4);
        int num2 = (int) Math.round(Math.random() * 4);
        int result = 0;

        if (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                result = num1 / num2;
            } else {
                result = num2 / num1;
            }
        } else {
            System.out.println("Dalyba is 0 negalima.");
        }

        System.out.println(Math.round(result * 100.0) / 100.0);

        // 3.

        System.out.println("----------------3.------------------");


        int a = (int) (Math.random() * 25);
        int b = (int) (Math.random() * 25);
        int c = (int) (Math.random() * 25);
        double middleValue;


        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            middleValue = a;
        } else if ((a <= b && b <= c) || (c <= b && b <= a)) {
            middleValue = b;
        } else {
            middleValue = c;
        }


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(middleValue);


        // 4.

        System.out.println("----------------4.------------------");

        int A = (int) (Math.random() * 10) + 1;
        int B = (int) (Math.random() * 10) + 1;
        int C = (int) (Math.random() * 10) + 1;

        // System.out.println(A);
        // System.out.println(B);
        // System.out.println(C);


        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            System.out.println("Trikampį galima sudaryti.");
        } else {
            System.out.println("Trikampio negalima sudaryti.");
        }

        // 5.

        System.out.println("----------------5.------------------");

        int n1 = (int) Math.round(Math.random() * 2);
        int n2 = (int) Math.round(Math.random() * 2);
        int n3 = (int) Math.round(Math.random() * 2);
        int n4 = (int) Math.round(Math.random() * 2);

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        if (n1 == 0) {
            countZero++;
        } else if (n1 == 1) {
            countOne++;
        } else if (n1 == 2) {
            countTwo++;
        }

        if (n2 == 0) {
            countZero++;
        } else if (n2 == 1) {
            countOne++;
        } else if (n2 == 2) {
            countTwo++;
        }

        if (n3 == 0) {
            countZero++;
        } else if (n3 == 1) {
            countOne++;
        } else if (n3 == 2) {
            countTwo++;
        }

        if (n4 == 0) {
            countZero++;
        } else if (n4 == 1) {
            countOne++;
        } else if (n4 == 2) {
            countTwo++;
        }

        System.out.println("The numbers: " + n1 + " " + n2 + " " + n3 + " " + n4);
        System.out.println("Number of 0s: " + countZero);
        System.out.println("Number of 1s: " + countOne);
        System.out.println("Number of 2s: " + countTwo);


        // 6.

        System.out.println("----------------6.------------------");

        int nr1 = (int) Math.round(-10 + Math.random() * 20);
        int nr2 = (int) Math.round(-10 + Math.random() * 20);
        int nr3 = (int) Math.round(-10 + Math.random() * 20);

        // int nr1 = (int) (min + (Math.random() * max - min));


        if (nr1 < 0) {
            System.out.print("[" + nr1 + "], ");
        } else if (nr1 > 0) {
            System.out.print("{" + nr1 + "}, ");
        } else {
            System.out.print("(" + nr1 + "), ");
        }

        if (nr2 < 0) {
            System.out.print("[" + nr2 + "], ");
        } else if (nr2 > 0) {
            System.out.print("{" + nr2 + "}, ");
        } else {
            System.out.print("(" + nr2 + "), ");
        }

        if (nr3 < 0) {
            System.out.print("[" + nr3 + "]\n");
        } else if (nr3 > 0) {
            System.out.print("{" + nr3 + "}\n");
        } else {
            System.out.print("(" + nr3 + ")\n");
        }

        // 7.

        System.out.println("----------------7.------------------");

        int zvakes = (int) Math.round(5 + Math.random() * 3000);
        int kaina = 1;

        if (zvakes > 1000 && zvakes < 2000) {
            System.out.println(zvakes + " žvakių kainuos " + Math.round((zvakes * kaina * 0.97) * 100.0) / 100.0 + " eur.");
        } else if (zvakes > 2000) {
            System.out.println(zvakes + " žvakių kainuos " + Math.round((zvakes * kaina * 0.96) * 100.0) / 100.0 + " eur.");
        } else {
            System.out.println(zvakes + " žvakių kainuos " + zvakes + " eur.");
        }


        // 8.

        System.out.println("----------------8.------------------");

        double k1 = Math.random() * 100;
        double k2 = Math.random() * 100;
        double k3 = Math.random() * 100;

        int zeros = 0;
        int n = 3;

        System.out.println("Visų reikšmių vidurkis: " + Math.round((k1 + k2 + k3) / 3));

        if (k1 <= 10 || k1 >= 90) {
            k1 = 0;
            zeros++;
        }
        if (k2 <= 10 || k2 >= 90) {
            k2 = 0;
            zeros++;
        }
        if (k3 <= 10 || k3 >= 90) {
            k3 = 0;
            zeros++;
        }

        // System.out.println(k1);
        // System.out.println(k2);
        // System.out.println(k3);

        // System.out.println(zeros);

        double avg = (k1 + k2 + k3) / (n - zeros);

        System.out.println(n - zeros + " reikšmių vidurkis: " + Math.round(avg));

        // 9.

        System.out.println("----------------9.------------------");

        int h = (int) Math.round(Math.random() * 24);
        int min = (int) Math.round(Math.random() * 60);
        int s = (int) Math.round(Math.random() * 60);

        System.out.println("Pradiniai duomenys: " + h + " h. " + min + " min " + s + " s.");

        int bonusS = (int) Math.round(Math.random() * 300);

        System.out.println("Pridedamų s. kiekis: " + bonusS);
        s += bonusS;

        while (s >= 60) {
            if (s >= 60) {
                s -= 60;
                min += 1;
            }
            if (min >= 60) {
                min -= 60;
                h += 1;
            }
        }


        System.out.println("Laikais su pridėtomis sekundėmis: " + h + " h. " + min + " min " + s + " s.");

        // 10.

        System.out.println("----------------10.------------------");

        int a1 = (int) Math.round(1000 + Math.random() * 8999);
        int a2 = (int) Math.round(1000 + Math.random() * 8999);
        int a3 = (int) Math.round(1000 + Math.random() * 8999);
        int a4 = (int) Math.round(1000 + Math.random() * 8999);
        int a5 = (int) Math.round(1000 + Math.random() * 8999);
        int a6 = (int) Math.round(1000 + Math.random() * 8999);


//        --global user.name "dovydasjau";
//        --global user.email "dovydasjau@gmail.com";


    }
}