import java.util.Scanner;

public class FP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваш текст:");
        String text = in.nextLine();
        System.out.println("Спасибо! Идет подсчет количества слов...");
        double time1 = System.currentTimeMillis();
        System.out.println("Время начала = " + time1);
        text = text.trim();
        int a1 = 0;
        int a2 = 1;
        int succes = 0;

        for(int i = 0; i < text.length(); i++){
            String t = text.substring(a1, a2);
            a1++;
            a2++;
            if(t.equals(" ")) {
                succes++;
            }
        }
        if(succes != 0)
            succes++;
        String word = "hey";

        switch (succes % 10){
            case 1:
                word = "слово";
                break;
            case 2:
                word = "слова";
                break;
            case 3:
                word = "слова";
                break;
            case 4:
                word = "слова";
                break;
            case 5:
                word = "слов";
                break;
            case 6:
                word = "слов";
                break;
            case 7:
                word = "слов";
                break;
            case 8:
                word = "слов";
                break;
            case 9:
                word = "слов";
                break;
            case 0:
                word = "слов";
                break;
        }

        System.out.println("Всего в Вашем тексте найдено " + succes + " " + word);
        double time2 = System.currentTimeMillis();
        System.out.println("Время окончания работы программы: ");
        double dtime = (time2 - time1)/1000;
        System.out.println("Прошло " + dtime + " секунд.");
    }
}
