public class ExceoptionApp {
    public static void main(String[] args) {
        int[] scores = {10,20,30};

        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2/0);
            System.out.println(4);
        } catch (Exception e){
            System.out.println("오류가 발생했습니다");
        }
        System.out.println(5);
    }
}
