package javalang;


public class objectclass {
    public static void main(String [] args){
        Object o1=new Object();
        Object o2=o1;
        class myclass{
            public String toString(){
                return "MY STRING TEST";
            }
        }
        myclass o3=new myclass();
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.toString());
    }
}
