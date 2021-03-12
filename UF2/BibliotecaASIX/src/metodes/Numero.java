/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 * Mètodes utilitzats en els projectes de m3 sobre números. Per exemple: mcd,
 * suma de Naturals, potències...
 *
 * @author alumne: Alba Rius
 */
public class Numero {

    /**
     * Calcula de forma recursiva el màxim comú divisor de dos números enters.
     *
     * @param a Primer número enter per a fer el mcd
     * @param b Segon número enter per a fer el mcd
     * @return El màxim comú divisor dels dos números
     * @throws StackOverflowError si els paràmetres {@code a} o {@code b} són
     * massa gran
     */
    public static int mcdRecursiu(int a, int b) {
        //Tractament negatius i tractamjent 0
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        if (a == 0 || b == 0) {
            return 0;
        }

        if (a == b) {
            return a;
        }
        if (a > b) {
            return mcdRecursiu(a - b, b);
        }
        /*if(a<b)*/
        return mcdRecursiu(a, b - a);

    }

    /**
     * Calcula el màxim comú divisor de dos números enters.
     *
     * @param a Primer número enter per a fer el mcd
     * @param b Segon número enter per a fer el mcd
     * @return El màxim comú divisor dels dos números
     */
    public static int mcdIteratiu(int a, int b) {
        //Tractament negatius i tractament 0
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        if (a == 0 || b == 0) {
            return 0;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    /**
     * Calcula recursivament la suma dels números naturals des de n a 0. Si el
     * paràmetre és negatiu retorna -1.
     *
     * @param n el valor a calcular
     * @return La suma dels números naturals des de n a 0
     * @throws StackOverflowError si el paràmetre {@code n} és massa gran
     */
    public static int sumaNaturals(int n) {
        //Tractament cas especial
        if (n < 0) {
            return -1;
        }

        //Cas de parada
        if (n == 0) {
            return 0;
        }

        //Cas iteratius
        return n + sumaNaturals(n - 1);
    }

    /**
     * Calcula la suma dels números naturals des de n a 0. Si el paràmetre és
     * negatiu retorna -1
     *
     * @param n el valor a calcular
     * @return La suma dels números naturals des de n a 0
     */
    public static int sumaNaturalsIteratiu(int n) {
        //Tractament cas especial
        if (n < 0) {
            return -1;
        }
        int suma = 0;

        while (n != 0) {
            if (suma + n < suma) {
                return -2;
            }
            suma += n;
            n -= 1;
        }

        return suma;

    }

    /**
     * Calcula de forma recursiva la potència d'un double base elevat a l'enter
     * exponent. Si el paràmetre base és massa gran retyorna infinit.
     *
     * @param base Enter del que es fa la potència
     * @param exponent Número al que s'eleva l'enter
     * @return La potència de la base elevada a l'exponent
     */
    public static double potenciaRec(double base, int exponent) {

        //Cas de parada
        if (exponent == 0) {
            return 1.0;
        }

        //Tractaments recursius
        if (exponent > 0) {
            return base * potenciaRec(base, --exponent);
        }
        return 1.0 / potenciaRec(base, exponent * -1);

    }

    /**
     * Calcula la potència d'un double base elevat a l'enter exponent.
     *
     * @param base Enter del que es fa la potència
     * @param exponent Número al que s'eleva l'enter
     * @return La potència de la base elevada a l'exponent
     */
    public static double potenciaInt(double base, int exponent) {
        int potencia = 1;

        //Cas de parada
        while (exponent != 0) {
            if (exponent > 0) {
                potencia *= base;
                exponent--;
            }
        }

        return potencia;

    }

    /**
     * Calcula de forma recursiva el factorial d'un número enter.
     *
     * @param num Enter del qual es calcularà el factorial
     * @return El factorial del número
     * @throws StackOverflowError si el paràmetre {@code num} és massa gran
     */
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            return -1;
        }
        return num * factorial(num - 1);
    }

    /**
     * Calcula el factorial d'un número enter.
     *
     * @param num Enter del qual es calcularà el factorial
     * @return El factorial del número
     */
    public static int factorialIteratiu(int num) {

        if (num < 0) {
            return -1;
        }

        int resultat = 1;

        while (num > 1) {
            resultat *= num--;
        }
        return resultat;

    }

    /**
     * Calcula recursivament la potència d'℮ elevat al paràmetre x sumant n
     * térmes. Com més térmes més presisció. Ho fa gairebé perfecte en n=10 o
     * n=11.
     *
     * @param x Número al que s'eleva ℮
     * @param n Número de termes de la fòrmula per a elevar ℮
     * @return La potència d'℮ elevat al paràmetre x sumant n térmes
     * @throws StackOverflowError si el paràmetre {@code n} és massa gran
     */
    public static double potenciaE2params(int x, int n) {
        double resultat = 1.0;

        for (int i = 1; i < n; i++) {
            resultat += potenciaInt(x, i) / factorial(i);

        }

        return resultat;
    }

    /**
     * Calcula de forma recursiva la potència d'℮ elevat al paràmetre
     * especificat. Si el paràmetre x és massa gran retorna infinit.
     *
     * @param x Enter al que s'elevarà ℮
     * @return La potència d'℮ elevat a x
     */
    public static double potenciaE(int x) {

        return potenciaE2params(x, 11);
    }

    public static boolean primer(int num) {
        int cont = 0;

        //Números menors que dos no seran primers
        if (num < 2) {
            return false;
        } else { //Mirem núms més grans o igual a 2
            for (int i = 1; i <= num && cont <= 2; i++) {
                if (num % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

//    public static int seguentPrimer (int num){
//        
//        if(num<2) return 2;
//        while (!primer(++num));
//        
//        return num;
//    }
    }
