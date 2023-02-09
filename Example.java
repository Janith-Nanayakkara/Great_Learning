interface StringExample{
        String reverse(String x);
        static void m1(){
            
        }
}
class StringImpl implements StringExample{
    @Override
    public String reverse(String x){
        String c1 = "";
        for(int i = x.length()-1;i>=0;i--){
            c1 = c1+x.charAt(i);
        }
        return c1;
    }
}
public class Example {
    public static void main(String a1[]) {
        StringImpl e = new StringImpl();
        System.out.println(e.reverse("Hello"));
    }
}
