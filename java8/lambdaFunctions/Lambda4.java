package java8;

interface MakeOperation{
    int operation(int a,int b);
}

public class Lambda4 {
    public static void main(String[] args) {
        MakeOperation addition=(int aa,int bb)->{
            return aa+bb;
        };
        MakeOperation substraction=(int aa,int bb)->(aa-bb);
        int result1=addition.operation(86,90);
        int result2=substraction.operation(100,50);
        System.out.println("Addition is:"+result1+". Substraction is: "+result2);
    }
}
