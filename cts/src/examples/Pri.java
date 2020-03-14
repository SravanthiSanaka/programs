package examples;

public class Re{
    Re(){
 int i = 100;
 System.out.println(i);
    }
}

public class Pri extends Re{
    static int i = 200;
    public static void main(String argv[]){
 Pri p = new Pri();
 System.out.println(i);
    }
}
