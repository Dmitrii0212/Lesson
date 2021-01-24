import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ThirdHomeWork {
    public static void main(String[] args) {
        IgraUgadaySlovo();
    }

    /*1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int chislo = random.nextInt(9);
        int Popitka = 0;
        System.out.println("Угадай число с 3 попыток!");
        while (Popitka < 3) {
            System.out.println("Введите число от 0 до 9.");
            int symbol = scanner.nextInt();
            if (symbol > chislo) {
                System.out.println("Слишком много");
                System.out.println(" ");
            } else if (symbol < chislo) {
                System.out.println("Слишком мало");
                System.out.println(" ");
            } else if (symbol == chislo) {
                System.out.println("Ты выиграл!");
                System.out.println(" ");
            }
            Popitka++;
        }
        System.out.println("Попытки закончились. Хотите повторить? нажмите 1, если нет, нажмите 0");
        String go = scanner.next();
        if (go.equals("1")) {
            main(null);
        }

    }
}
/*String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
"grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
"pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и
сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.*/

    private static void IgraUgadaySlovo() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        Scanner Human = new Scanner(System.in);
        Random comp = new Random();
        String word = words[comp.nextInt(words.length)];

        char[] s = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        do {
            char[] ss = new char[s.length];
            for (int i = 0; i < s.length; i++) {
                ss[i] = s[i];
            }
            System.out.println("Угадай слово!");
            String Ugad = Human.next();
            Human.nextLine();
            if (Human.equals(word)) {
                System.out.println("Победа!");
                break;
            }
            for (int i = 0; i < Ugad.length(); i++) {
                if (i > words.length - 1) {
                    break;
                }
                if(Ugad.charAt(i) == word.charAt(i)) {
                    ss[i] = Ugad.charAt(i);
                }
            }
            System.out.println(Arrays.toString(ss));

        } while(true);
    }
}