public class ReverseString {
    public static void main(String[] args){
        String A = "Adarsh Patro";
        int C= 256;
       StringBuilder B =new StringBuilder();
       StringBuilder D=new StringBuilder();
       B.append(A);
        D.append(C);
            B=B.reverse();
            D=D.reverse();
        System.out.println(B);
        System.out.println(D);
    }
}
