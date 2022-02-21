//Write a java program that shows the usage of try, catch throws and finally

class Main {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
        finally{
            System.out.println("oops!");
        }
    }
}
