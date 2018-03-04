public class FP {
    public static void main(String[] args){
        int sum = 68526;
        System.out.print("У Вас ");
        switch (sum % 10){
            case 1:
                System.out.println(sum + " рубль");
                break;
            case 2:
                System.out.println(sum + " рубля");
                break;
            case 3:
                System.out.println(sum + " рубля");
                break;
            case 4:
                System.out.println(sum + " рубля");
                break;
            case 5:
                System.out.println(sum + " рублей");
                break;
            case 6:
                System.out.println(sum + " рублей");
                break;
            case 7:
                System.out.println(sum + " рублей");
                break;
            case 8:
                System.out.println(sum + " рублей");
                break;
            case 9:
                System.out.println(sum + " рублей");
                break;
            case 0:
                System.out.println(sum + " рублей");
                break;
        }
    }
}