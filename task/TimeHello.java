
// 📌 В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// 📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// 📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// 📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// 📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalDateTime;
import java.util.Scanner;

public class TimeHello {
    public static void main(String[] args) {
        System.out.println("Введите свое имя: ");
        Scanner scanner = new Scanner(System.in, "ibm866");
        String name = scanner.nextLine();
        scanner.close();

        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Доброй ночи, %s!", name);
        }

        
    }
}
