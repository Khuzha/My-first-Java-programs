public class FP {
    public static void main(String[] args){
        int massone[] = new int[101];
        for(int i = 0; i<massone.length; i++){
            massone[i] = (int)(Math.random()*10000);
        }
        int k = massone[0];
        for(int i = 0; i < massone.length; i++){
            if(k < massone[i])
                k = massone[i];
            System.out.println(k);
        }
    }
}
