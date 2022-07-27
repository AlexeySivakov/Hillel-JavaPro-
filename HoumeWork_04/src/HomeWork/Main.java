package HomeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - <Integer, Integer>:");
        Phone<Integer, Integer> phone1 = new Phone<>();
        phone1.add(101, 101);
        System.out.println("Номер: " + phone1.getPhoneNumber());
        System.out.println("Имя: " + phone1.getName());
        phone1.callUp();

        System.out.println();
        System.out.println("2 - <String, String>:");
        Phone<String, String> phone2 = new Phone<>();
        phone2.add("Полиция", "102");
        System.out.println("Номер: " + phone2.getPhoneNumber());
        System.out.println("Имя: " + phone2.getName());
        phone2.callUp();

        System.out.println();
        System.out.println("3- <Integer, String>:");
        Phone<Integer, String> phone3 = new Phone<>();
        phone3.add(103, "103");
        System.out.println("Номер: " + phone3.getPhoneNumber());
        System.out.println("Имя: " + phone3.getName());
        phone3.sendSMS("Тестовое смс");

        System.out.println();
        System.out.println("4- <String, Integer>:");
        Phone<String, Integer> phone4 = new Phone<>();
        phone4.add("Служба газа 104", 104);
        System.out.println("Номер: " + phone4.getPhoneNumber());
        System.out.println("Имя: " + phone4.getName());
        phone4.callUp();
    }
}
