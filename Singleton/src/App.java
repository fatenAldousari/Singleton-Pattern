public class App {
    public static void main(String[] args) throws Exception {
    
       IPhoneSettings settings = IPhoneSettings.getInstance();
       settings.setbrightness(10);
       System.out.println("brightness= " + settings.getbrightness());
       System.out.println("wifi connected? " + settings.getwifi() );


    }
}
