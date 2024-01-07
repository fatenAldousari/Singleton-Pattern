public class IPhoneSettings {
    private static IPhoneSettings instance;
    private int brightness;
    private boolean wifi = true;

    private IPhoneSettings() {
}

public static IPhoneSettings getInstance() {
    if (instance == null) {
        instance = new IPhoneSettings();
    }
    return instance;
}

public int getbrightness() {
    return brightness;
}

public boolean getwifi() {
    return wifi;
}
public void setbrightness(int brightness) {
    this.brightness = brightness;

}
public void setwifi(boolean wifi){
    this.wifi = wifi;
}

// public void setAge(int age) {
//     if (age > 0) {
//         this.age = age;
//     }

// public int getbrightness() {
//     return brightness;
// }
// public void setbrightness(int newbrightness){
//     brightness

// }



}