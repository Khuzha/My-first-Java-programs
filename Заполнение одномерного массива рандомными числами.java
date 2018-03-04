public class FP {
    public static void main(String[] args){
        int k = 0;
        int massone[] = new int[101];
        for(int i = 0; i<massone.length; i++){
            massone[i] = (int)(Math.random()*10000);
            System.out.println(massone[i]);
        }
    }
}
