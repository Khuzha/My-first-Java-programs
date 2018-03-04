public class FP {
    public static void main(String[] args){
        int k = 0;
        int massone[] = new int[101];
        for(int i = 0; i<massone.length; i++){
            massone[i] = (int)(Math.random()*1000000);
        }
        int r = (int)(Math.random()*100);
        int n = massone[r];
        int s = -111;
        for(int i = 0; i<massone.length; i++) {
            if (n == massone[i])
                s = i;
        }
        if(s != -111)
            System.out.println("Номер элемента массива massone[], равный числу massone[r](" + r + "): s = " + s);
        else
            System.out.println("Ошибка. Эллемента в массиве massone[], равного числу massone[r], не найдено.");
    }
}