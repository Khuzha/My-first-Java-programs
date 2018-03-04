public class FP {
    public static void main(String[] args) {
        int massone[] = {651, 684, 1381, 684, 164, 1365, 4861, 1};
        int k = massone[0];
        for (int i = 0; i < massone.length; i++) {
            if(k > massone[i])
                k = massone[i];
            System.out.println(k);
        }
    }
}
