public class Main {
    public static void main(String[] args) {
        int plus = Calculator(12,23);
        System.out.println(plus);

        String message = "Java Dünyasına Hoşgeldin! - ";
        String newMessage = newMessage();
        System.out.println(message + newMessage);
    }
    public static void Add(){
        System.out.println("Added Item");
    }
    public  static void Remove(){
        System.out.println("Removed Item");
    }
    public static void Update(){
        System.out.println("Updated Item");
    }
    public static String newMessage(){
        return "Konumuz Metod Kullanımı";
    }
    public static int Calculator(int number1, int number2){
        return number1 + number2;
    }

}