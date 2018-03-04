/*Определите сумму элементов массива, расположенных между минимальным и максимальным значениями. (Сами максимальное и минимальное значения в суммировании не участвуют.)
Примеры исходных данных и результатов работы программы*/

public class FP {
    public static void main(String[] args) {
        int massone[] = new int[10];
        for (int i = 0; i < massone.length; i++) {
            massone[i] = (int) (Math.random() * 10);
            System.out.println("i = " + i + "; mass = " + massone[i]);
        }
        int max = massone[0];
        int nmax = 0;
        for (int i = 0; i < massone.length; i++) {
            if (max < massone[i]) {
                max = massone[i];
                nmax = i;
            }
        }
        int min = massone[0];
        int nmin = 0;
        for (int i = 0; i < massone.length; i++) {
            if (min > massone[i]) {
                min = massone[i];
                nmin = i;
            }
        }
        int sum = 0;
        System.out.println("nmax = " + nmax + "; Макc" + max);
        System.out.println("nmin = " + nmin + "; Мин" + min);
        if (nmin < nmax) {
            for (int i = nmin; i < nmax; i++) {
                if (i == nmin)
                    continue;
                sum += massone[i];
                System.out.println(sum);
            }
        } else {
            for (int i = nmin; i > nmax; i++) {
                if (i == nmin)
                    continue;
                sum += massone[i];
                System.out.println(sum);
            }
        }
    }
}
