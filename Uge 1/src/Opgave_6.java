public class Opgave_6 
{
    public static void main(String[] args) 
    {
    	jonas32();
    	jonas16();
    	jonas2();
    }
    public static void jonas() {
    	System.out.println("DTU - Det bli'r til noget!");
    }
    public static void jonas2() {
    	jonas();
    	jonas();
    }
    public static void jonas16() {
    	jonas2();
    	jonas2();
    	jonas2();
    	jonas2();
    	jonas2();
    	jonas2();
    	jonas2();
    	jonas2();
    }
    public static void jonas32() {
    	jonas16();
    	jonas16();
    }
}

