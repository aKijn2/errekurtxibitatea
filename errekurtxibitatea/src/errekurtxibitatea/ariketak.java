package errekurtxibitatea;

public class ariketak {
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        /* 1. Ariketa */
        System.out.print("agertzenDaA:");
        String agertzenDaA = sc.next();

        if (agertzenDaA(agertzenDaA)) {
            System.out.println("Agertzen da.");
        } else {
            System.out.println("Ez da agertzen.");
        }

        /* 2. Ariketa */
        System.out.print("alderantziz:");
        String alderantziz = sc.next();
        String alderantzizBuelta = alderantziz(alderantziz);
        System.out.println(alderantzizBuelta);

        /* 3. Ariketa */
        System.out.print("agertzenDaAA:");
        String agertzenDaAA = sc.next();

        if (agertzenDaAA(agertzenDaAA)) {
            System.out.println("Agertzen da.");
        } else {
            System.out.println("Ez da agertzen.");
        }

        /* 4. Ariketa */
        System.out.print("agerpenKopuruaA:");
        String agerpenKopuruaA = sc.next();
        int kopurua = agerpenKopuruaA(agerpenKopuruaA);
        System.out.println("A letra " + kopurua + " aldiz agertu da.");

        /* 5. Ariketa */
        System.out.print("berredura:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Ez da posible.");
        } else {
            int emaitza = berredura(n);
            System.out.println("2^" + n + " = " + emaitza);
        }

        // Ariketa gehigarriak:

        /* 6. Ariketa*/
        System.out.println("potentzia, m^n:");
        int m = sc.nextInt();
        int n1 = sc.nextInt();

        if (n1 >= 0) {
            int erantzuna = calcularPotencia(m, n1);
            System.out.println(m + "^" + n1 + " = " + erantzuna);
        } else {
            System.out.println("Ez da posible.");
        }

        sc.close();
    }

    /* 1. Ariketa */
    public static boolean agertzenDaA(String letraA) {
        return letraA.toLowerCase().contains("a");
    }

    /* 2. Ariketa */
    public static String alderantziz(String ald) {
        return new StringBuilder(ald).reverse().toString();
    }

    /* 3. Ariketa */
    public static boolean agertzenDaAA(String agertzenDaAA) {
        return agertzenDaAA.toLowerCase().equals("aa");
    }

    /* 4. Ariketa */
    public static int agerpenKopuruaA(String letraA) {
        int kopurua = 0;
        for (char karakterea : letraA.toLowerCase().toCharArray()) {
            if (karakterea == 'a') {
                kopurua++;
            }
        }
        return kopurua;
    }

    /* 5. Ariketa */
    public static int berredura(int n) {
        return (int) Math.pow(2, n);
    }

    // Ariketa gehigarriak

    /* 6. Ariketa */
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            int erantzuna = 1;
            for (int i = 0; i < exponente; i++) {
                erantzuna *= base;
            }
            return erantzuna;
        }
    }
}
