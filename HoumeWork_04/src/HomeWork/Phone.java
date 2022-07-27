package HomeWork;

public class Phone<N, P> {
    private N name;
    private P phoneNumber;


    //записать
    void add(N name, P phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    //позвонить
    void callUp() {
        System.out.println("Звоним на номер " + phoneNumber + " с именем: " + name);

    }

    void sendSMS(String text) {
        System.out.println("На номер " + phoneNumber + " (" + name + ") отправлено сообщение:  ");
        System.out.println(text);
    }

    public N getName() {
        return name;
    }

    public P getPhoneNumber() {
        return phoneNumber;
    }
}
