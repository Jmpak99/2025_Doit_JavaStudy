package Chapter03.sec01_operator_1.EX04_RelationOperator;

public class RelationOperator {
    public static void main(String[] args) {
        //#1. 크기비교 (<, >, <=, >=) : true, false
        System.out.println(5<2); //false
        System.out.println(5>2); //true
        System.out.println(5<5); //false
        System.out.println(5<=5); //true
        System.out.println(5>=5); //true
        System.out.println();

        //#2. 등가비교(==, !=) : true, false
        //@ 기본자료형 등가비교 (값비교)
        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a==c); //true
        System.out.println(a!=c); //false
        System.out.println();

        //@ 참조자료형 등가비교 (번지비교)
        String str1 = new String("안녕");
        String str2 = new String("안녕");
        System.out.println(str1 == str2); //false
    }
}