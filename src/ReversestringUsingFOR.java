public class ReversestringUsingFOR {
    public static void main(String[] args){
     String STR = "Adarsh Patro";
     char[] E= STR.toCharArray();
     for (int i= E.length-1;i>=0;i--)

         System.out.print(E[i]);

    }
}
