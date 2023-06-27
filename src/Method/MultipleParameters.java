package Method;

public class MultipleParameters {
    static  void  myMethod(String firstname , int age , String town){
        System.out.println("I am " + firstname + ". " + "I am " + age + ". " + "I live in " + town );
    }
    public static void main(String[] args) {

        myMethod("Slavena" , 18 , "Varna");
        myMethod("Ivana" , 55 , "Gabrovo");
        myMethod("Pesho" , 13 , "Shumen");
        myMethod("Simona" , 38 , "Sofia");

    }
}
