public class Exercise3 {
    public static void main(String[] args){
        //Пункт3
        int result = getSum(1,3,10,2);
        System.out.println(result);
    }

    static int getSum (int a, int b, int c, int d){
        return a*(b+(c/d));
    }
}
