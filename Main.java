import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.awt.geom.Path2D.contains;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!!!");
//        System.out.println("  *");
//        System.out.println(" ***");
//        System.out.println("*****");
//        System.out.println(" ***");
//        System.out.println("  *");
//        System.out.println("     J      a    V         V   a");
//        System.out.println("      J    a  a   V       V  a   a");
//        System.out.println("J     J   aaaaaaa   V   V   aaaaaaa");
//        System.out.println("  J J   a         a   V   a         a");

//        System.out.println("          +          *0");
//        System.out.println("         +++         *1");
//        System.out.println("        +++++        *2");
//        System.out.println("       +++++++       *3");
//        System.out.println("      +++++++++      *4");
//        System.out.println("     +++++++++++     *5");
//        System.out.println("    +++++++++++++    *6");
//        System.out.println("   +++++++++++++++   *7");
//        System.out.println("  +++++++++++++++++  *8");
//        System.out.println(" +++++++++++++++++++ *9");
//        System.out.println("+++++++++++++++++++++*10");

//        System.out.println("(a)          (b)          (c)          (d)       ");
//        System.out.println("*            **********   **********            *");
//        System.out.println("**           *********     *********           **");
//        System.out.println("***          ********       ********          ***");
//        System.out.println("****         *******         *******         ****");
//        System.out.println("*****        ******           ******        *****");
//        System.out.println("******       *****             *****       ******");
//        System.out.println("*******      ****               ****      *******");
//        System.out.println("********     ***                 ***     ********");
//        System.out.println("*********    **                   **    *********");
//        System.out.println("**********   *                     *   **********");


//        System.out.println(5+6);
//        int a = 5;
//        int b = 7;
//        int c = a*b;
//        System.out.println(c);
//        int age = 18;
//        System.out.println("Ваш возраст: " + age);
//        float price =0.02656f;
//        int quantity = 20000;
//        System.out.println(price*quantity);


//        int a = 4;
//        int b=2;
//        int c =5;
//        int f = a+b+c;
//        float d = f/3.0f;
//        System.out.println(d);


//        float length = 16.5f;
//        float width = 8.2f;
//        float square = length*width;
//        System.out.println(square);

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Введите ваш возраст:");
//        int age = scanner.nextInt();
//        System.out.printf("Мой возраст:%d", age);

//        int num1 = 45;
//        int num2 = 34;
//        int num3 = num1;
//        num1 = num2;
//        num2 = num3;
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.printf("Сейчас у меня %d сом есть\n ",1000);
//        System.out.printf("Сегодня урок начнется в %f\n", 11.5);
//        System.out.printf("Hi, my name is %s, мне %d", "Abu",22);


        // \r выводит только те данные которыу стоят после него

//        System.out.println("Hello w\rorld");

        // \t два пробела ставит
//        System.out.println("Hello w\t\torld");

        // \n ставит на следующую строку всё, что стоит после него
//        System.out.println("Привет, меня зовут\t\t\t Адыл, мне \n23 года!");

//        System.out.println("Добро пожаловать в калькулятор!");
//        System.out.println("1. +");
//        System.out.println("2. -");
//        System.out.println("3. *");
//        System.out.println("4. /");
//        System.out.println("5. (");
//        System.out.println("6. )");
//        System.out.println("Введите первое число:");
//        Scanner scanner = new Scanner(System.in);
//        int a= scanner.nextInt();
//        System.out.println("Введите второе число:");
//        int b= scanner.nextInt();
//        System.out.println(a+b);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ввите имя");
//
//        String a = scanner.nextLine();
//        System.out.println("Введите пароль");
//        int b= scanner.nextInt();
//        System.out.println("Вы зарегистрировались");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ваше ФИО:");
//        String a = scanner.nextLine();
//        System.out.println("Введите ваш возраст:");
//        int b= scanner.nextInt();
//        System.out.println("Введите ваш пол:");
//        String c = scanner.next();
//        System.out.println("Введите ваш адрес проживания:");
//        String d = scanner.next();
//        System.out.println("Выберите анализ, который хотите сдать:\n 1. Общий\n 2. Биохимический \n 3. Иммунологический \n 4. Гармональный");
//        int e = scanner.nextInt();
//        System.out.println("\nВаши данные:\n\n" +"Ваше ФИО:"+ a+ "\nВаш возраст:" +b + "\nВаш пол:" + c+  "\nВаше место проживания:" + d+ "\nКуда вы записались:" + e);
//        System.out.println("Вы успешно зарегистрировались и записались!\nЖдём вас 12.10.2023 в кабинете Илона Маска на 2 этаже\nНаш адрес: Бишкек, Гражданская, 119.\n(На счет лечения ничего не обещаем, но научим вам пользоваться компьютером и много чему ещё :) )");


////         \b - удаляет 1 символ перед

//         \0 - знак пустоты
//      System.out.println("Hello wor\0d");

//         \" - ставит кавычки внутри

//         \' - тоже самое

//         """_""" - тройные кавычки помогают ставить отступы
//        System.out.println("""
//                ef[wefpmvpdmpwrm
//                sdkvmskvm
//                ;sdvmspkmv
//                dskvmwskvm
//                """);

////        \\ - пробел 1 символ


////          String text = "      Cut string";


//        text.trim();
//        System.out.println(text);

//         text = text.trim();
//        System.out.println(text);

//        System.out.println(text.trim());

////        .trim - убирает пробелы


////        конкатенация - соединение двух переменных
//        String a = "efs";
//        String b = "gerg";
//        System.out.println(a.concat(b));
////      System.out.println(a+b);


////    Сравнение строк   true or false

//        String a = "abc";
//        String b = "def";
//        String c = "abc";
//        String d = "def";
//
//        System.out.println(a.equals(b));
//
//      System.out.println(a.equals(c));


//        String a = "abc";
//        String b = "def";
//        String c = "abc";
//        String d = "def";
//
//   _     boolean e ;  - позволяет продолжать писать код
//
//        System.out.println(a.equals(b));
//
////    System.out.println(a.equals(c));


////        toUpperCase  and  toLowerCase


////    Длинна строки lenght() - показывает кол-во строк в консоли
//        String a = "sdf";
////      System.out.println(a.length());


////      substring - выводит на консоль только 2 символа
//        String a = "fderger";
////      System.out.println(a.substring(2,4));


////           math operations:
////        % -      5%2=1  - показывает остаток от деления


////               Инкремент и декремент
//          инкремент ++ (плюс 1)
////        декремент -- (минус 1)


////                         Постфикс и префикс:
//
//            Префикс:
//        int a = 8;
//        System.out.println(--a);
//        System.out.println(++a);

//          Постфикс:
//        int b = 8;
//        int c = b++/--;
//        System.out.println(c);
////      System.out.println(b++/--);

////      int x = 5;
//        System.out.println(--x);
//        System.out.println(++x);
//        System.out.println(x++);
////      System.out.println(x--);


////                Операторы присовения/Assigment operations:
//        int a = 4;
//        a +=5; // a = 4 + 5 = 6;
////      a *=5; // a = 4 * 5 = 20;


////               Методы класса Math / Math class
//
//        double a = Math.sqrt(2); - возводит в квадрат
//
//        double b = Math.pow(3,4); - возводит в степень
//
//        double c = Math.round(3.5); - округляет до целого
//
//        double d = Math.ceil(3.1); - округляет до мин
//
//        double e = Math.floor(3.7); - округляет до мах
//
//        double e = Math.abs(-45); - модуль


////                   Random:
//        Random random = new Random();
//        int a= random.nextInt(2,9);
////      System.out.println(a);


////        float a= 35.34f;
////        System.out.println((int)a);

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(a+4);
//        int b = scanner.nextInt();
//        System.out.println(b+9);
//
//        int num = scanner.nextInt();
//        int s = num/100;
//        int c = num%100;
//        int f = c/10;
//        int g = num%10;
//
//        System.out.println(s +f +g);

//        Random random = new Random();
//        float a= random.nextFloat(0,1);
//        float b= random.nextFloat(0,1);
//        float c= random.nextFloat(0,1);
//        System.out.println(Math.round(a));
//        System.out.println(Math.ceil(b));
//        System.out.println(Math.floor(c));

//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int d = num/100;
//        int c = num%100;
//        int f = c/10;
//        int g = num%10;
//        int v = g*100;
//        int m = f*10;
//        int y = v+m+d;
//        System.out.println(y-=20);

//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int c = num%100;
//        int f = c/10;
//        int g = num%10;
//        int v = g*10;
//        int y = v+f;
//        System.out.println(y+=8);


////                       If and else:
//
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a>=0)
//            System.out.println("Positive");
//        else
//            System.out.println("Negative");

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a>=0){
//            System.out.println("Positive");     если есть две логики
//            System.out.println("csce");
//        }
//        else{
//            System.out.println("Negative");
//        }

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a>b){
//            System.out.println("sdc");
//        } else if (b>a) {
//            System.out.println("cfs");
//        } else {
//            System.out.println("a=b");
////


////           && - и
//             || - или
////           ! - не равно


////      System.out.println("Введите ваш бал:");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (90 <= a && a <=100) {
//            System.out.println("Оценка: \"A\"");
//            } else if (a>=70  && a<=89){
//            System.out.println("Оценка: \"B\"");
//        } else if (a>=50 && a<=69){
//        System.out.println("Оценка: \"C\"");
//        } else if (a>=40 && a<=59){
//            System.out.println("Оценка: \"D\"");
//        } else if (a<=39){
//            System.out.println("Оценка: \"E\"");
////      }


////      Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int c = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a>c && a>b){
//            System.out.println(a);
//        } else if (b>c && b>a){
//            System.out.println(b);
//        } else if (c>b && c>a){
//            System.out.println(b);
////      }

////      System.out.println("балл за экзамен:");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a>50)
//            System.out.println("You win!");
//        else if (a<50)
////          System.out.println("You lose");


////               Switch case:

////      switch (1){
//            case "USD":                           ИНФА
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Default");
////      }


////      switch (1){
//            case 1:
//                System.out.println("USD = 88.85");
//                return;
//            case 2:
//                System.out.println("EUR = 93.6");
//                break;
//            case 3:
//                System.out.println("RUB = 0.875");
//                break;
//            case 4:
//                System.out.println("LIRA = 3.23");
//            default:
////     }


////            Тёрнарный оператор:
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        String b = a>=0 ? "Positive" : "Negative";
////      System.out.println(b);

////      Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        String b = a%2 == 0 ? "Positive" : "Negative";
////      System.out.println(b);

//        Scanner scanner = new Scanner(System.in);
//        int b = scanner.nextInt();
//        if (b>=18)
//            System.out.println("Вы совершеннолетний");
//        else
//            System.out.println("Вы несовершеннолетний");


//        Random random = new Random();
//        int a = random.nextInt(1,11);
//        if( a>=1 && a<=3)
//            System.out.println(a);
//        else
//            System.out.println("-");

//       Random random = new Random();
//        int num = random.nextInt(1000,10000);
//        int i= num/1000;
//        int d = num/100;
//        int y = d%10;
//        int c = num%100;
//        int f = c/10;
//        int g = num%10;
//
//         if (i==g && y==f)
//             System.out.println("Это число является палиндромом");
//         else
//             System.out.println("Это число не является палиндромом");
//         if (i==g && i==y && i==f && f==g && g==y && y==f)
//             System.out.println("Это число является палиндромом");
//         else
//             System.out.println("Это число не является палиндромом");
//        System.out.println(num);


        //// Лабораторка

//        System.out.println("Начало дня");
//        System.out.println(" # | Действие");
//        System.out.println("---|----------------------------------------");
//        Random random = new Random();
//        int a = random.nextInt(1,3);
//        switch (a) {
//            case 1:
//                System.out.println("* | Поднимаюсь с кровати с левой ноги");
//                int b = random.nextInt(1,11);
//                switch (b){
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                    case 5:
//                    case 6:
//                    case 7:
//                        System.out.println("* | Падаю с кровати");
//                        int d = random.nextInt(1,13);
//                        switch (d){
//                            case 1:
//                            case 2:
//                            case 3:
//                            case 4:
//                            case 5:
//                            case 6:
//                            case 7:
//                            case 8:
//                                System.out.println("* | Варю крепкий кофе");
//                                int g = random.nextInt(1,6);
//                                switch (g){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int p = random.nextInt(1,9);
//                                        switch (p){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int q = random.nextInt(1,9);
//                                        switch (q){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                            case 9:
//                            case 10:
//                            case 11:
//                            case 12:
//                                System.out.println("* | Готовлю плотный завтрак");
//                                int h = random.nextInt(1,6);
//                                switch (h){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int r = random.nextInt(1,9);
//                                        switch (r){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int s = random.nextInt(1,9);
//                                        switch (s){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                        }
//                        break;
//                    case 8:
//                    case 9:
//                    case 10:
//                        System.out.println("* | Пробежка по аллее");
//                        int e = random.nextInt(1,13);
//                        switch (e){
//                            case 1:
//                            case 2:
//                            case 3:
//                            case 4:
//                            case 5:
//                            case 6:
//                            case 7:
//                            case 8:
//                                System.out.println("* | Варю крепкий кофе");
//                                int j = random.nextInt(1,6);
//                                switch (j){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int t = random.nextInt(1,9);
//                                        switch (t){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int u = random.nextInt(1,9);
//                                        switch (u){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                            case 9:
//                            case 10:
//                            case 11:
//                            case 12:
//                                System.out.println("* | Готовлю плотный завтрак");
//                                int k = random.nextInt(1,6);
//                                switch (k){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int r = random.nextInt(1,9);
//                                        switch (r){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int u = random.nextInt(1,9);
//                                        switch (u){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                        }
//                        break;
//
//                }
//                break;
//            case 2:
//                System.out.println("* | Поднимаюсь с кровати с правой ноги");
//                int c = random.nextInt(1,7);
//                switch (c){
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                        System.out.println("* | Пробежка по аллее");
//                        int e = random.nextInt(1,13);
//                        switch (e){
//                            case 1:
//                            case 2:
//                            case 3:
//                            case 4:
//                            case 5:
//                            case 6:
//                            case 7:
//                            case 8:
//                                System.out.println("* | Варю крепкий кофе");
//                                int l = random.nextInt(1,6);
//                                switch (l){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int r = random.nextInt(1,9);
//                                        switch (r){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u) {
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Неудачный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int u = random.nextInt(1,9);
//                                        switch (u){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                            case 9:
//                            case 10:
//                            case 11:
//                            case 12:
//                                System.out.println("* | Готовлю плотный завтрак");
//                                int m = random.nextInt(1,6);
//                                switch (m){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int r = random.nextInt(1,9);
//                                        switch (r){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int u = random.nextInt(1,9);
//                                        switch (u){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                        }
//                        break;
//                    case 5:
//                    case 6:
//                        System.out.println("* | Физ. зарядка на балконе");
//                        int f = random.nextInt(1,5);
//                        switch (f){
//                            case 1:
//                                System.out.println("* | Готовлю плотный завтрак");
//                                int o = random.nextInt(1,6);
//                                switch (o){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int r = random.nextInt(1,9);
//                                        switch (r){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int u = random.nextInt(1,9);
//                                        switch (u){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                            case 2:
//                            case 3:
//                            case 4:
//                                System.out.println("* | Достаю вчерашний салат");
//                                int i = random.nextInt(1,6);
//                                switch (i){
//                                    case 1:
//                                    case 2:
//                                        System.out.println("* | Спустило колесо");
//                                        int r = random.nextInt(1,9);
//                                        switch (r){
//                                            case 1:
//                                            case 2:
//                                                System.out.println("* | Добираюсь на работу пешком");
//                                                int u = random.nextInt(1,9);
//                                                switch (u){
//                                                    case 1:
//                                                    case 2:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 3:
//                                                    case 4:
//                                                    case 5:
//                                                    case 6:
//                                                    case 7:
//                                                    case 8:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Добираюсь на работу на маршрутке");
//                                                int w = random.nextInt(1,3);
//                                                switch (w){
//                                                    case 1:
//                                                        System.out.println("* | Прихожу вовремя");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                    case 2:
//                                                        System.out.println("* | Опаздываю на работу");
//                                                        System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                        break;
//                                                }
//                                                break;
//                                        }
//                                        break;
//                                    case 3:
//                                    case 4:
//                                    case 5:
//                                        System.out.println("* | Добираюсь на работу на своём авто");
//                                        int u = random.nextInt(1,9);
//                                        switch (u){
//                                            case 1:
//                                            case 2:
//                                            case 3:
//                                            case 4:
//                                            case 5:
//                                                System.out.println("* | Прихожу вовремя");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Удачный""");
//                                                break;
//                                            case 6:
//                                            case 7:
//                                            case 8:
//                                                System.out.println("* | Опаздываю на работу");
//                                                System.out.println("""
//                                                                * | Конец
//
//                                                                В целом день: Нейтральный""");
//                                                break;
//                                        }
//                                        break;
//                                }
//                                break;
//                        }
//                        break;
//                }
//                break;
//
//
//
////            }


////                                                Циклы
////                                      while
////                                      for


////        int a = 0;
//        while (a<10) {
//            System.out.println("Hello");
//            a++;
////        }


////        while loop - выполняется то тех пор пока выходит true, а когда она закончится то выведет faalse и престанет работать


////        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        while (s>0){
//            System.out.println(s);
////            s--;

//        Scanner scanner = new Scanner(System.in);
//        long s = scanner.nextInt();
//        while (s>0){
//            if (s<1000000000)
//                System.out.println("dvaer");
//            else
//                System.out.println();

//        }


////                    do and while
//        int a = 6;
//        int b =10;
//        do {
//            ++a;
//            System.out.println(Math.pow(a,2));
//
////       } while (a<10);


////                 for and loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
////        }

////        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Введите число");
//            int a = sc.nextInt();
//            if (a==0)
//                break;
//
////        }

////        for (;;)
////            System.out.println("иди в жопу");   -  бесконечность не предел


////        for (int i = 0; i < 10; i++) {
//            if (i%2==0) {
//                continue; - когда у нас остаток равняется 1 то переходим к следующей логике снизу,
//            }               а когда она равняется 0, то заново возвращаемся к первой логике
//
//            i = i+2;
//            System.out.println(i);
//            System.out.println("-----");
////        }


////        Scanner scanner = new Scanner(System.in);
//        for (int i = 0, j=0; i < 10; i++) {
//            if (i%2==1) {
//                j++;
//                System.out.println("j=" + j);
//            }
//            if (j==4) {
//                System.out.println("stopppp");
//                break;
//            }
////        }

////        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        while (a>=b){
//            System.out.println(a);
//            a--;
////        }


////        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        while (a<=b){
//            System.out.println(a+"*"+c+"="+(a*c));
//            a++;
////        }


////        char s;
//        for (s='a'; s<='z'; s++) {
//            System.out.println(s);
//
////        }


////        for (int i = 1; i <=255; i++) {
//            System.out.println((char) i); чар заменил цифры на символы
//
////        }


////        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("*");
//            }
//            System.out.println();
////        }


////        Scanner scanner = new Scanner(System.in);
//        String qwe = "";
//        do {
//            System.out.println("Введите первое число:");
//            int a = scanner.nextInt();
//            System.out.println("Введите второе число:");
//            int b = scanner.nextInt();
//            System.out.println(a+"+"+b+"="+(a+b));
//            System.out.println("Повторить процедуру ?");
//            qwe = scanner.next();
//
//        }while
////        (qwe.equals("да"));

////      System.out.println("Угадайте, что это за число:");
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int a = random.nextInt(1,21);
//        int b;
//        do {
//             b = scanner.nextInt();
//            if (b>a)
//                System.out.println("Слишком много, попробуйте ещё");
//            else if (b<a)
//                System.out.println("Слишком мало, попробуйте ещё");
//        }while (a!=b);
////      System.out.println("Правильно");


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int s;
//        for (s=1; s<=n; s++) {
//            System.out.println(s);
//
//        }

//        char s;
//        for (s='a'; s<='z'; s--) {
//            System.out.println(s);
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int s;
//        for (s=1; s<=n; s++) {
//            System.out.println(s);
//        }


//        for (int i = 1; i < 15; i+=2) {
//            for (int j = 0; j < (15 - i)/2; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 15; i >0; i-=2) {
//            for (int j = (15-i)/2; j > 0; j--) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //// massiv array


////        int a = 4;
//        int b = 5;
//        int c = 6;
//        char d = 'f';
//        String e= "dgdgd";
//                          0  1  2 3  4 5 6  7
//        int [] numbers = {3,45,56,3, a,b,c};
//        for (int i = 0; i < 10; i++) {
//            System.out.println(numbers[i]);
////        }

//        int a = 4;
//        int b = 5;
//        int c = 6;
//        char d = 'f';
//        String e = "dgdgd";
//
//        int g = 0;
////                        0  1  2   3  4 5 6  7  == i
//        int[] numbers = {3, 45, 56, 3, a, b, c};
//        for (int i = 0; i < 7; i++) {
//            g = numbers[i + 1];
//            g += numbers[i];
//            System.out.println(g);
//        }
//        numbers[1] = 9;
//        System.out.println(numbers[1]); // 9
//        System.out.println(numbers[2]); // 56
//        System.out.println(numbers[3] + 7);


////        for (int i = 0; i < 6; i++) {
////            System.out.println(numbers[i]);


//        int[] array = {3, 45, 56, 3, a, b, c};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0)
//                System.out.println(array[i]);
//
//
//        }


//        int[] array = {19, 19, 56, 3, 19};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[i+1])
//                System.out.println(true);
//            else
//                System.out.println(false);
//            break;
//        }

//        int[] array = {3, 45, 56, 3, 19'' };
//        boolean found = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 19) {
//                found = true;
//            }

//    }
//        if (!found)
//            System.out.println(found);
//        else
//            System.out.println(found);


//        int[] array = {3, 45, 56, 3 };
//        boolean found = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] + array[i] == 48  ) {
//                int f = i + 1;
//                System.out.println(i + " " + f);
//            }
//            }// индексы показывает
//
//        String[] cats = "cscdc", "csecs" , "sdvrefgre";

//        Random random = new Random();
//        int [] massive = new int[11];
//        for (int i = 0; i < massive.length; i++) {
//            massive[i] = random.nextInt(1,11);


        // Лабораторка

//        System.out.println("""
//                У вас есть аккаунт ?
//                1. Да
//                2. Нет""");
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        if (a.equals("1")) {
//            System.out.println("Введите логин:");
//            String b = scanner.nextLine();
//            System.out.println("Введите пароль:");
//            String c = scanner.nextLine();
//            Random random = new Random();
//            long o = random.nextLong(1000000000000000L, 9999999999999999L);
//            System.out.println(o);
//            long dfg = 1231231231231231L;
//            while (true) {
//                System.out.println("""
//
//                                 Меню:
//                        1. Проверить баланс
//                        2. Снять деньги
//                        3. Перевести деньги
//                        4. Пополнить баланс
//                        5. Взять кредит
//                        6. Конвертация
//                        7. Получить инфо об аккаунте
//                        8. Выйти""");
//                int n = scanner.nextInt();
//                int r = 50000;
//                int ac = 0;
//                int x = 0;
//                switch (n) {
//                    case 1:
//                        System.out.println("На вашем балансе: " + r + " сом");
//                        break;
//                    case 2:
//                        System.out.println("Укажите, сколько вы хотите снять:");
//                        int u = scanner.nextInt();
//
//                        while (true) {
//                            int w = r - u;
//                            if (w >= 0) {
//                                System.out.println("На вашем балансе " + w + " сом");
//                                System.out.println("Возьмите деньги");
//
//
//                            } else {
//                                System.out.println("На вашем счёте недостаточно средств");
//                                break;
//                            }
//                        }
//                        continue;
//                    case 3:
//                        System.out.println("Введите номер карты получателя");
//                        long p = scanner.nextLong();
//
//                        if (p != dfg) {
//                            System.out.println("Такой карты не существует");
//                        } else {
//                            System.out.println("Введите сумму, которую хотите перевести:");
//                        }
//                        int s = scanner.nextInt();
//                        while (true) {
//                            int t = r - s;
//                            if (t < 0)
//                                System.out.println("На вашем счёте недостаточно средств");
//                            else
//                                System.out.println("Перевод успешно прошёл");
//                            System.out.println(t);
//                            break;
//                        }
//                        break;
//                    case 4:
//                        System.out.println("Внесите наличные:");
//                        int q = scanner.nextInt();
//                        System.out.println(r + q);
//                        break;
//                    case 5:
//                        System.out.println("Введите сумму кредита");
//                        ac = scanner.nextInt();
//                        System.out.println("На саколько вы хотите его оформить ? (3,5,7,12)");
//                        int sdf = scanner.nextInt();
//                        while (true) {
//                            if (sdf == 2 || sdf == 6 || sdf == 8 || sdf == 13) {
//                                System.out.println("Mы не можем выдать вам кредит на столько месяцев");
//                                break;
//                            } else if ((sdf == 3)) {
//                                System.out.println("Процентная ставка:3%");
//                                System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                int ad = r + ac;
//                                System.out.println("Ваш баланс: " + ad);
//                                System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                String dfr = scanner.next();
//                                float dfe = r - ac * 0.03f;
//                                if (dfr.equals("да")) {
//                                    if (dfe < 0) {
//                                        System.out.println("На вашем счёте недостаточно средств");
//                                        break;
//                                    } else
//                                        System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                    break;
//                                } else
//                                    System.out.println(" ");
//                                break;
//                            } else if ((sdf == 5)) {
//                                System.out.println("Процентная ставка:3%");
//                                System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                int ad = r + ac;
//                                System.out.println("Ваш баланс: " + ad);
//                                System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                String dfr = scanner.next();
//                                float dfe = r - ac * 0.03f;
//                                if (dfr.equals("да")) {
//                                    if (dfe < 0) {
//                                        System.out.println("На вашем счёте недостаточно средств");
//                                        break;
//                                    } else
//                                        System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                    break;
//                                } else
//                                    System.out.println(" ");
//                                break;
//                            } else if ((sdf == 7)) {
//                                System.out.println("Процентная ставка:3%");
//                                System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                int ad = r + ac;
//                                System.out.println("Ваш баланс: " + ad);
//                                System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                String dfr = scanner.next();
//                                float dfe = r - ac * 0.03f;
//                                if (dfr.equals("да")) {
//                                    if (dfe < 0) {
//                                        System.out.println("На вашем счёте недостаточно средств");
//                                        break;
//                                    } else
//                                        System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                    break;
//                                } else
//                                    System.out.println(" ");
//                                break;
//                            } else if ((sdf == 12)) {
//                                System.out.println("Процентная ставка:3%");
//                                System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                int ad = r + ac;
//                                System.out.println("Ваш баланс: " + ad);
//                                System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                String dfr = scanner.next();
//                                float dfe = r - ac * 0.03f;
//                                if (dfr.equals("да")) {
//                                    if (dfe < 0) {
//                                        System.out.println("На вашем счёте недостаточно средств");
//                                        break;
//                                    } else
//                                        System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                    break;
//                                } else
//                                    System.out.println(" ");
//
//                            }
//                        }
//                        break;
//                    case 6:
//                        System.out.println("Укажите свою валюту, в которую хотите конвертировать деньги");
//                        System.out.println("""
//                                1. Рубль
//                                2. Доллар
//                                3. Евро""");
//                        x = scanner.nextInt();
//                        switch (x) {
//                            case 1:
//                                System.out.println("1. Рубль - 0.91");
//                                float y = r * 0.91f;
//                                System.out.println("На вашем балансе: " + y + " рублей");
//                            case 2:
//                                System.out.println("2. Доллар - 89.25");
//                                float z = r * 89.25f;
//                                System.out.println("На вашем балансе: " + z + " долларов");
//                            case 3:
//                                System.out.println("3. Евро - 94.0");
//                                float ab = r * 94.0f;
//                                System.out.println("На вашем балансе: " + ab + " евро");
//
//                        }
//                        break;
//                    case 7:
//                        System.out.println("Ваш баланс: " + r + ac);
//                        System.out.println("Ваш кредит: " + ac);
//                        if (x == 1)
//                            System.out.println("Ваша валюта: Рубль");
//                        else if (x == 2) {
//                            System.out.println("Ваша валюта: Доллар");
//                        } else if (x == 3) {
//                            System.out.println("Ваша валюта: Евро");
//                        }
//                        break;
//                    case 8:
//                        return;
//                }
//            }
//        } else if (a.equals("2")) {
//            System.out.println("Хотите зарегистрироваться ?\n1. Да\n2. Нет");
//            String d = scanner.nextLine();
//            if (d.equals("1")) {
//                System.out.println("Введите ниже данные:");
//                System.out.println("ФИО");
//                String e = scanner.nextLine();
//                System.out.println("Введите свой ИНН:");
//                while (true) {
//                    String f = scanner.nextLine();
//                    if (f.length() != 16) {
//                        System.out.println("ИНН должен состоять из 16 цифр");
//                    } else {
//                        System.out.println("Введите ваш возраст:");
//                        break;
//                    }
//                }
//                while (true) {
//                    byte g = scanner.nextByte();
//                    if (g < 16 || g > 126)
//                        System.out.println("Возраст отрицательный либо превышает норму");
//                    else {
//                        System.out.println();
//                        break;
//                    }
//                }
//                System.out.println("Введите номер телефона:");
//                while (true) {
//                    String k = scanner.next();
//                    if (k.length() == 13 && k.contains("+996") || k.contains("0")) {
//                        System.out.println("Введите почту:");
//                        break;
//                    } else {
//                        System.out.println("Номер введен некорректно и код страны должен быть KG");
//                    }
//                }
//                String i;
//                while (true) {
//                    i = scanner.next();
//                    if (i.contains("@gmail.com") || i.contains("@mail.ru") || i.contains("@outlook.com") || i.contains("@aol.ca") || i.contains("@peaksoft.us")) {
//                        System.out.println();
//                        break;
//                    } else {
//                        System.out.println("Почта введена некорректно");
//
//                    }
//                }
//                System.out.println("Создайте пароль:");
//                String hd;
//                while (true) {
//                    hd = scanner.next();
//                    if (hd.length() >= 8 && hd.contains("!") || hd.contains("@") || hd.contains("#") || hd.contains("$")) {
//                        System.out.println(" ");
//                        break;
//                    } else {
//                        System.out.println("Создайте надёжный пароль используя символы, цифры и буквы");
//
//                    }
//                }
//                System.out.println("Войти в аккаунт");
//                System.out.println("Логин:");
//                while (true) {
//                    String j = scanner.next();
//                    if (j.equals(i)) {
//                        System.out.print("");
//                        break;
//                    } else {
//                        System.out.println("Неверный логин");
//                    }
//                }
//                System.out.println("Пароль:");
//                while (true) {
//                    String l = scanner.next();
//
//                    if (l.equals(hd)) {
//                        System.out.println("Номер вашей карты:");
//                        break;
//                    } else {
//                        System.out.println("Неверный пароль");
//
//                    }
//                }
//                Random random = new Random();
//                long o = random.nextLong(1000000000000000L, 9999999999999999L);
//                System.out.println(o);
//                long dfg = 1231231231231231L;
//                while (true) {
//                    System.out.println("""
//
//                                     Меню:
//                            1. Проверить баланс
//                            2. Снять деньги
//                            3. Перевести деньги
//                            4. Пополнить баланс
//                            5. Взять кредит
//                            6. Конвертация
//                            7. Получить инфо об аккаунте
//                            8. Выйти""");
//                    int n = scanner.nextInt();
//                    int r = 50000;
//                    int ac = 0;
//                    int x = 0;
//                    switch (n) {
//                        case 1:
//                            System.out.println("На вашем балансе: " + r + " сом");
//                            break;
//                        case 2:
//                            System.out.println("Укажите, сколько вы хотите снять:");
//                            int u = scanner.nextInt();
//                            while (true) {
//                                int w = r - u;
//                                if (w >= 0) {
//                                    System.out.println("На вашем балансе " + w + " сом");
//                                    System.out.println("Возьмите деньги");
//
//                                } else {
//                                    System.out.println("На вашем счёте недостаточно средств");
//                                }
//                            }
//                        case 3:
//                            System.out.println("Введите номер карты получателя");
//                            long p = scanner.nextLong();
//
//                            if (p != dfg) {
//                                System.out.println("Такой карты не существует");
//                            } else {
//                                System.out.println("Введите сумму, которую хотите перевести:");
//                            }
//                            int s = scanner.nextInt();
//                            while (true) {
//                                int t = r - s;
//                                if (t < 0)
//                                    System.out.println("На вашем счёте недостаточно средств");
//                                else
//                                    System.out.println("Перевод успешно прошёл");
//                                System.out.println(t);
//                                break;
//                            }
//                            break;
//                        case 4:
//                            System.out.println("Внесите наличные:");
//                            int q = scanner.nextInt();
//                            System.out.println(r + q);
//                            break;
//                        case 5:
//                            System.out.println("Введите сумму кредита");
//                            ac = scanner.nextInt();
//                            System.out.println("На саколько вы хотите его оформить ? (3,5,7,12)");
//                            int sdf = scanner.nextInt();
//                            while (true) {
//                                if (sdf == 2 || sdf == 6 || sdf == 8 || sdf == 13) {
//                                    System.out.println("Mы не можем выдать вам кредит на столько месяцев");
//                                    break;
//                                } else if ((sdf == 3)) {
//                                    System.out.println("Процентная ставка:3%");
//                                    System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                    int ad = r + ac;
//                                    System.out.println("Ваш баланс: " + ad);
//                                    System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                    String dfr = scanner.next();
//                                    float dfe = r - ac * 0.03f;
//                                    if (dfr.equals("да")) {
//                                        if (dfe < 0) {
//                                            System.out.println("На вашем счёте недостаточно средств");
//                                            break;
//                                        } else
//                                            System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                        break;
//                                    } else
//                                        System.out.println(" ");
//                                    break;
//                                } else if ((sdf == 5)) {
//                                    System.out.println("Процентная ставка:3%");
//                                    System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                    int ad = r + ac;
//                                    System.out.println("Ваш баланс: " + ad);
//                                    System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                    String dfr = scanner.next();
//                                    float dfe = r - ac * 0.03f;
//                                    if (dfr.equals("да")) {
//                                        if (dfe < 0) {
//                                            System.out.println("На вашем счёте недостаточно средств");
//                                            break;
//                                        } else
//                                            System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                        break;
//                                    } else
//                                        System.out.println(" ");
//                                    break;
//                                } else if ((sdf == 7)) {
//                                    System.out.println("Процентная ставка:3%");
//                                    System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                    int ad = r + ac;
//                                    System.out.println("Ваш баланс: " + ad);
//                                    System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                    String dfr = scanner.next();
//                                    float dfe = r - ac * 0.03f;
//                                    if (dfr.equals("да")) {
//                                        if (dfe < 0) {
//                                            System.out.println("На вашем счёте недостаточно средств");
//                                            break;
//                                        } else
//                                            System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                        break;
//                                    } else
//                                        System.out.println(" ");
//                                    break;
//                                } else if ((sdf == 12)) {
//                                    System.out.println("Процентная ставка:3%");
//                                    System.out.println(ac * 0.03 + " - ежемесячная сумма оплаты");
//                                    int ad = r + ac;
//                                    System.out.println("Ваш баланс: " + ad);
//                                    System.out.println("(Прошёл месяц) Оплатить ежемесячный платёж ?");
//                                    String dfr = scanner.next();
//                                    float dfe = r - ac * 0.03f;
//                                    if (dfr.equals("да")) {
//                                        if (dfe < 0) {
//                                            System.out.println("На вашем счёте недостаточно средств");
//                                            break;
//                                        } else
//                                            System.out.println("Успешно\nВаш баланс:" + dfe + "сом");
//                                        break;
//                                    } else
//                                        System.out.println(" ");
//
//                                }
//                            }
//                            break;
//                        case 6:
//                            System.out.println("Укажите свою валюту, в которую хотите конвертировать деньги");
//                            System.out.println("""
//                                    1. Рубль
//                                    2. Доллар
//                                    3. Евро""");
//                            x = scanner.nextInt();
//                            switch (x) {
//                                case 1:
//                                    System.out.println("1. Рубль - 0.91");
//                                    float y = r * 0.91f;
//                                    System.out.println("На вашем балансе: " + y + " рублей");
//                                case 2:
//                                    System.out.println("2. Доллар - 89.25");
//                                    float z = r * 89.25f;
//                                    System.out.println("На вашем балансе: " + z + " долларов");
//                                case 3:
//                                    System.out.println("3. Евро - 94.0");
//                                    float ab = r * 94.0f;
//                                    System.out.println("На вашем балансе: " + ab + " евро");
//
//                            }
//                            break;
//                        case 7:
//                            System.out.println("Ваш баланс: " + r + ac);
//                            System.out.println("Ваш кредит: " + ac);
//                            if (x == 1)
//                                System.out.println("Ваша валюта: Рубль");
//                            else if (x == 2) {
//                                System.out.println("Ваша валюта: Доллар");
//                            } else if (x == 3) {
//                                System.out.println("Ваша валюта: Евро");
//                            }
//                            break;
//                        case 8:
//                            return;
//                    }
//                }
//
//
//            } else if (d.equals("2"))
//                System.out.println("Вы вышли из системы.\nВсего доброго");
//        }


//        String [] array = {"beka","nur","adyl"};
//        String [] array2 = {"adyl","nurik","tyoma","adyl"};
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array[i].equals(array2[i]))
//                {
//                    System.out.println(array[j]);
//                }
//                if (array2[i].contains("k"));
//                System.out.println(array2[j]);


//        String [] array = {"Maksat","Adyl","Nuraida"};
//        String [] array1 = {"Kalys","Bekzat","Bektur","Nuraida"};
//        String [] join = new String[array.length+array1.length];
//
//        int counter=0;
//        for (int i = 0; i < array.length; i++) {
//            join[i]=array[i];
//            counter++;
//        }
//        for (int i = 0; i <array1.length ; i++) {
//            join[counter++]=array1[i];
//        }
//        System.out.println(Arrays.toString(join));


//        Random random = new Random();
//        int [] a = new int[15];
//        int f = 0;
//        for (int i = 0; i < 15; i++) {
//            a[i]=random.nextInt(1,11);
//
//            if (a[i]%2==0){
//                f++;
//            }
//        }
//        System.out.println(f);
//        System.out.println(Arrays.toString(a));


//        int [] a = new int[50];
//
//        for (int i=a.length-1; i>=0; i--) {
//             a[i]=2*i+1;
//            System.out.print(a[i]+" ");
//        }


//        int [] a = new int[5];
//        int [] b = new int[5];
//
//        Random random = new Random();
//        for (int i=0; i<5; i++) {
//            a[i] = random.nextInt(0,6);
//            b[i] = random.nextInt(0,6);
//            System.out.print(a[i]+" ");
//            System.out.println(b[i]+" ");
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

//
//        int [] a = new int[11];
//        Random random = new Random();
//        for (int i=0; i<11; i++) {
//            a[i] = random.nextInt(-1,2);
//            if (a[i]==-1 && i>=5){
//                System.out.println("Чаще всего встречается: -1");
//            } else if (a[i]==0 && i>=5) {
//                System.out.println("Чаще всего встречается: 0");
//            } else if (a[i]==1 && i>=5) {
//                System.out.println("Чаще всего встречается: 1");
//            }
//
//        }
//        System.out.println(Arrays.toString(a));


        //  методы


//        Scanner scanner = new Scanner(System.in);
//        int d= scanner.nextInt();
//        if (d==1)
//            Hello();
//        else
//            Bye();
//
//    }
//
//    public static void Hello (){
//        System.out.println("Hi");
//    }
//       public static void Bye (){
//           System.out.println("Bye");


//        int [] array = {1,2,3,4,5,6,7,8,9,0};
//        ad(array);
//       }
//       public static void ad (int [] array){
//           for (int i = 0; i < array.length; i++) {
//               if (array[i]%2==0){
//                   System.out.println(array[i]+" ");
//               }
//           }

//        sddf("sdcdv","dfsf", 35);
//       }
//       public static void sddf(String name, String surname, int age){
//


//        sd("Twix");
//       }
//       public static void sd(String name){
//           System.out.println("Hi "+ name);


//        int [] array = {1,2,3,4,5,6,7,8};
//        massiv(array);
//       }
//       public static void massiv(int[] array){
//           for (int i = 0; i < array.length; i++) {
//               System.out.print(array[i] +" ");
//           }

//        calculate(1,2);
//
//       int [] aa = {calk(4,6),calk(5,7)};
//
//       }
//       public static void calculate(int a, int b){
//           System.out.println(a+b);
//       }
//       public static int calk(int a, int b){
//        return a+b;


//        Scanner scanner = new Scanner(System.in);
//        System.out.println(bruh(" rfaefer ").trim());
//    }
//    public static String bruh (String a) {
//        return a;
//    }
//
//    }
//        int[] array = {1, 3, 4, 5};
//        int[] array2 = {1, 3, 4, 5};
//        massiv(array);
//        System.out.println(Arrays.toString(massiv1(array2)));
//
//
//    }
//
//    public static void massiv(int[] array) {
//        System.out.println(Arrays.toString(array));
//    }
//
//    public static int[] massiv1(int[] array1) {
//
//       return array1;
//        int [] array = {1,2,3,4};
//        int [] array2 ={1,3,5,6};
//       massiv(array,array2);
//       int a= massiv2(array,array2);
//        System.out.println(a);
//
//    }
//    public static void  massiv (int [] array, int [] array2){
//        if (array.length!=array2.length){
//            System.out.println("у них разная длинна");
//            return;
//        }
//            int sum=0;
//            for (int i = 0; i < array2.length ; i++) {
//                sum +=array2[i]+array[i];
//            }
//        System.out.println(sum);
//    }
//
//    public static int massiv2 (int [] array,int[] array2){
//        if (array.length!=array2.length){
//            System.out.println("у них разная длинна");
//            return -1;
//        }
//        int sum=0;
//        for (int i = 0; i < array2.length ; i++) {
//            sum +=array2[i]+array[i];
//        }
//        return sum;


//    String [] array2 = {"dawefeyguyrv","escefae","dfvervre"};
//    massiv(array2);
//
//
//}
//    public static void  massiv (String [] array){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length()>11){
//            System.out.println(array[i]);
//            } else
//                System.out.println();
//
//
//        }
//        }
//
//
//    public static String [] massiv2 (String [] array){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length()>11)
//                return
//        }
//


//        int[][] matrix = {
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5}
//        };
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i<=j){
//                    matrix[i][j]= 0;
//                }
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] +" ");
//            }
//            System.out.println();
//        }


//        int [] matrix = {1,2,3,4,5,6,7,8};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < 8; j++){
//                System.out.print(matrix[j]+ " " );
//            }
//            System.out.println();
//            }


//        int [] massiv = {1,2,3,4,5};
//        int [] array = {6,7,8,9,10};
//        for (int i = 0; i < massiv.length && i< args.length; i++) {
//
//                System.out.print(massiv.length+ array.length);
//            }
//            System.out.println();


//        int [] array = {1,2,3,4,5};
//        int [] array1 = {6,7,8,9,10};
//        int [] join = new int[array.length+array1.length];
//
//        int counter=0;
//        for (int i = 0; i < array.length; i++) {
//            join[i]=array[i];
//            counter++;
//        }
//        for (int i = 0; i <array1.length ; i++) {
//            join[counter++]=array1[i];
//        }
//        System.out.println(Arrays.toString(join));


//        int [] array = {3,7,3,2,9,6};
//
//        int min = array[0];
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i+1321231321]<min){
//                min = array[i+1];
//
//            }
//        }
//        System.out.println(min);

//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int a = random.nextInt(10,100);
//        int b = random.nextInt(10,100);
//        int [] array = new int[]

//        System.out.println("""
//                1. Показать список контактов
//                2. Добавить контакты
//                3. Удалить контакты
//                4. Найти контакты""");
//        Scanner sc = new Scanner(System.in);
//        String [] products= {"Бека", "Муха", "Нурти"};
//        while (true){
//            System.out.println("Выбери операцию");
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    for (int i = 0; i < products.length; i++) {
//                        System.out.println(products[i]);
//                    }
//                    break;
//                case 2:
//                    System.out.println("Enter the name of new contact:");
//                    String newProduct = sc.next();
//                    String [] newMassiv ;
//                    newMassiv=Arrays.copyOf(products,products.length+1);
//                    newMassiv[newMassiv.length-1]=newProduct;
//                    System.out.println(Arrays.toString(newMassiv));
//                    products=Arrays.copyOf(newMassiv,newMassiv.length);
//                    break;
//                case 3:
//                    String [] newMassiv1 = new String[products.length-1];
//                    System.out.println("Введи название контакта, который ты хочешь удалить :");
//                    String name= sc.next();
//                    boolean exists=false;
//                    for (int i = 0; i < products.length; i++) {
//                        if(name.equalsIgnoreCase(products[i])){
//                            exists=true;
//                            break;
//                        }
//                    }
//                    if(exists){
//                        int count =0;
//                        for (int i = 0; i < products.length; i++) {
//                            if(!products[i].equalsIgnoreCase(name)){
//                                newMassiv1[count]=products[i];
//                                count++;
//                            }
//
//                        }
//                    }
//                    products=Arrays.copyOf(newMassiv1,newMassiv1.length);
//                    System.out.println(Arrays.toString(products));
//                    break;
//                case 4:
//                    System.out.println("Введите имя контакта:");
//                    String con = sc.next();
//                    boolean as = false;
//                    for (int i = 0; i < products.length; i++) {
//                        if (con.equalsIgnoreCase(products[i])) {
//                            System.out.println("Контакт найден: " + products[i]);
//                            as = true;
//                            break;
//                        }
//
//                    }
//                    if (!as) {
//                        System.out.println("Контакт с именем " + con + " не найден.");
//                    }
//                    break;
//
//
//
//
//            }
//
//        }


//        int[][] array = {{1, -2, 3, -4, 5, -6},
//                         {-1, 2, -3, 4, -5, 6},
//                         {1, -2, 3, -4, 5, -6}
//        };
//        int a = array.length;
//        int b = array[0].length;
//        double[] c = new double[b];
//        int[] d = new int[b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                if (array[i][j] > 0) {
//                    c[j] += array[i][j];
//                    d[j]++;
//                }
//            }
//        }
//        for (int i = 0; i < b; i++) {
//            if (d[i] > 0) {
//                double у = c[i] / d[i];
//                System.out.println("среднее ариф. " + i + ": " + у);
//            } else {
//                System.out.println("В столбце " + i + " нет положительных чисел");
//            }
//        }
//        17
//        int[][] matrix = {
//                {16,9,1,5},
//                {9,5,2,7},
//                {3,8,2,9},
//                {19,34,5,2}
//        };
//        int minVal = Integer.MIN_VALUE;
//        int ash = 0;
//        for (int i = 0; i < matrix.length ; i++) {
//            if (matrix[i][i] > minVal){
//                minVal = matrix [i][i];
//                ash = i;
//            }
//        }
//        for (int j = 0; j < matrix.length ; j++) {
//            System.out.print(matrix[ash][j]+ "  ");
//        }
//
//        6
//        int[] array = {19, 19, 56, 3};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[i+1]) {
//                i++;
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }break;
//        }
//
//        7
//        int[] a = {3, 4, 56, 7, 900, 84, 3, 4, 5,};
//        int b = a[0];
//        int c = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > b) {
//                b = a[i];
//                c = i;
//            }
//        }
//        int v = a[0];
//        a[0] = b;
//        a[c] = v;
//        for (int d : a) {
//            System.out.print(d + " ");
//
//        }


//     int a = 9;
//        String ee = String.valueOf(a); - из инта в стринг
//        a = Integer.parseInt(ee); - из стринга в инт
//        int d = 99;
//        float f = (float) d;

//        Random random = new Random();
//        String a= random.toString();
//        System.out.println(a);


        // Лабораторка


//        System.out.println("😊");
//}

//    static void asd (int ... varags){

//metod(2,2,3,4,5,6,7,8,8);
//    }
//public static void  metod ( int a, int ... args){
//    for (int i = 0; i < args.length; i++) {
//        args[i]*=a;
//    }
//    System.out.println(Arrays.toString(args));
//}


//         1 ЗАДАЧА
//
//        Вывести на печать первый отрицательный элемент массива и его
//        порядковый номер, полагая, что в массиве есть хотя бы один отрицательный
//        элемент.
//
//        int[] massiv = {1, 2, -5, 4, -5, 6,};
//
//        int a = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (massiv[i]<0){
//                a=i;
//                break;
//            }
//        }
//        if (a>=0){
//            System.out.println("Первый отрицательный элемент: " + masiv[a] + ", порядковый номер: " + a);
//        }else {
//            System.out.println("В массиве нет отрицательных элементов.");
//        }
//
//
//         2 ЗАДАЧА
//        Вывести на печать номера элементов массива, удовлетворяющих//        условию a[i]>10
//        int [] massiv = {1,2,33,66,8,90};
//        for (int i = 0; i < massiv.length; i++) {
//            if (massiv[i]>=10){
//                System.out.println( massiv[i]);
//            }
//        }
//
//
//             3
//        int[] array = {11,-7,4,2,-20,-18,1};
//        int a = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//            if (array[i] < 0) {
//                a++;
//            }
//        }
//        float b = sum / 7f;
//        System.out.println(a);
//        System.out.println(b);
//
//        4
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 1){
//                a++;
//            }
//        }
//        System.out.println("Кол-во: " + a);
//
//
// 5 ЗАДАЧА                                               ---------------------------------
//        Определить является ли данная последовательность убывающей (во//        избежание лишних проверок использовать оператор break)
//        int[] massiv = {10, 8, 6, 4, 2};
//        boolean a = true;
//        for (int i = 1; i < massiv.length; i++) {
//            if (massiv[i] >= massiv[i - 1]) {
//                a = false;
//                break;
//            }
//        }
//        if (a) {            System.out.println("Последовательность является убывающей.");
//        } else {            System.out.println("Последовательность является возрастающей.");
//        }
//
//        6
//        int[] array = {19, 19, 56, 3};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[i+1]) {
//                i++;
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }break;
//        }
//        7
//        int[] a = {3, 4, 56, 7, 900, 84, 3, 4, 5};
//        int b = a[0];
//        int c = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > b) {
//                b = a[i];
//                c = i;
//            }
//        }
//        int v = a[0];
//        a[0] = b;
//        a[c] = v;
//        for (int d : a) {
//            System.out.print(d + " ");
//    }
//
//           8.
//           int[][] massiv = {
//                 {34, 3, 2, 5},
//                {56, 7, 4, 35},
//                {1, 23, 78, 6 }};
//
//        int max = Integer.MIN_VALUE;
//        int stroka = 0;
//        int stolbec = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            for (int j = 0; j < massiv[i].length; j++) {
//                if (massiv[i][j] > max) {
//                    max = massiv[i][j];
//                    stroka = i;
//                    stolbec = j;
//                } }
//        }
//        System.out.println("Самое больше число: " + max);
//        System.out.println("Строка номера: " + stroka);
//        System.out.println("Номер столбца: " + stolbec);
//
//        9
//        int [][] massiv = {
//                {7,-2,-3,-4,-5,-6},
//                {-7,-8,-9,-7,-4,-22},
//                {-1,-2,-3,-5,12,-6}
//        };
//        int a = 0;
//        int sum = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            for (int j = 0; j < massiv[i].length; j++) {
//
//                if (massiv[i][j]>0){
//                sum += massiv[i][j];
//                }
//                if (massiv[i][j] > 0) {
//                    a++;
//                }
//            }
//        }
//
//        int b = sum/a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(sum);
//
//
//
//
//10
//        int a = 10;
//        int [] massiv = new int[a];
//        Random random = new Random();
//
//        for (int i = 0; i < massiv.length; i++) {
//            int b;
//            boolean c;
//
//            do {
//                c= true;
//                b = random.nextInt(11);
//
//                for (int j = 0; j < i; j++) {
//                    if (massiv[j]==b){
//                        c=false;
//                        break;
//                    }
//                }
//            }while (!c);
//
//            massiv[i]=b;
//        }
//        for (int d:massiv) {
//            System.out.print(d + " ");
//        }
//
//
//        11
//        int[][] matrix = {
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5}
//        };
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i<=j){
//                    matrix[i][j]= 0;
//                }
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] +" ");
//            }
//            System.out.println();
//        }
//
//         12
//        int [] matrix = {1,2,3,4,5,6,7,8};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < 8; j++){
//                System.out.print(matrix[j]+ " " );
//            }
//            System.out.println();
//        }
//
//        13
//        int[][] arr = {
//                {11, 7,34,21},
//                {7, 3,87,56},
//                {3, 23,75,5},
//
//        };
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j][2] > arr[j + 1][2]) {
//                    int[] temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int[] row : arr) {
//            System.out.print(row[2] + " ");
//        }
//
//
//        14
//        int[][] arr = {
//                {-11, 2,},
//                {7, 3,},
//                {3, 23,},
//                {25, 14,},
//                {13, 18,}
//        };
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j][1] > arr[j + 1][1]) {
//                    int[] temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int[] row : arr) {
//            System.out.print(row[1] + " ");
//        }
//
//        15 -
//        16 -
//
//                17
//        int[][] matrix = {
//                {16,9,1,5},
//                {9,5,2,7},
//                {3,8,2,9},
//                {19,34,5,2}
//        };
//        int minVal = Integer.MIN_VALUE;
//        int ash = 0;
//        for (int i = 0; i < matrix.length ; i++) {
//            if (matrix[i][i] > minVal){
//                minVal = matrix [i][i];
//                ash = i;
//            }
//        }
//        for (int j = 0; j < matrix.length ; j++) {
//            System.out.print(matrix[ash][j]+ "  ");
//        }
//
//         18-
//
//        19
//        Random random = new Random();
//        int[] massiv = new int[20];
//        for (int i = 0; i < 20; i++) {
//            massiv[i] = random.nextInt(0,99);
//        }
//        int a = random.nextInt(0,99);
//        System.out.println("рандомное число");
//        for (int b:massiv) {
//            if (b%a == 0) {
//                System.out.println(b );
//            }
//        }
//        System.out.println(Arrays.toString(massiv));
//
//
// int [] array ={23,345,67,5};
//        System.out.println(Arrays.toString(massiv(array)));
//    }
//    public static int [] massiv (int [] massiv1){
//
//        for (int i = 0; i < massiv1.length; i++) {
//            for (int j = i+1; j < massiv1.length; j++) {
//                if (massiv1[i]>massiv1[j]){
//                    int a = massiv1[i];
//                    massiv1[i]=massiv1[j];
//                    massiv1[j]=a;
//                }
//            }
//        }return massiv1;
//
//
//20
//                Random random = new Random();
//                int max = 50; // Устанавливаем начальное значение минимума на максимально возможное
//                int min = -50; // Устанавливаем начальное значение максимума на минимально возможное
//                for (int i = 0; i < 20; i++) {
//                    int randomNumber = random.nextInt(-50,51);
//                    System.out.println("Случайное число: " + randomNumber);
//                    if (randomNumber < max) {
//                        max = randomNumber;
//                    }
//                    if (randomNumber > min) {
//                        min = randomNumber;
//                    }
//                }
//                System.out.println("Наименьшее число: " + max);
//                System.out.println("Наибольшее число: " + min);
//            }
//
//
//
//        22
//        int [] massive = {1,2,3,4,5,6,7,8,9};int Max = massive[0];
//        for (int i = 0; i < massive.length-1; i++) {
//            if (massive[i] > Max){
//            Max = massive[i];
//            }
//        }
//        System.out.println("Наибольшой Элемент:"+Max);
//
//
//
//        23
//
//        int [] array = {1,2,3,4,5};
//        int [] array1 = {6,7,8,9,10};
//        int [] join = new int[array.length+array1.length];
//        int counter=0;
//        for (int i = 0; i < array.length; i++) {
//            join[i]=array[i];
//            counter++;
//        }
//        for (int i = 0; i <array1.length ; i++) {
//            join[counter++]=array1[i];
//        }
//        System.out.println(Arrays.toString(join));
//
//        24
//        int [] array = {3,7,3,2,9,6};
//
//        int min = array[0];
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i+1]<min){
//                min = array[i+1];
//
//            }
//        }
//        System.out.println(min);
//
//         25
//        Scanner sc = new Scanner(System.in);
//        int [] products= {5,6,7,8,9};
//                    System.out.println("Enter the name of new number:");
//                    int newProduct = sc.nextInt();
//                    int[] newMassiv;
//                    newMassiv = Arrays.copyOf(products, products.length + 1);
//                    newMassiv[newMassiv.length - 1] = newProduct;
//                    System.out.println(Arrays.toString(newMassiv));
//                    products = Arrays.copyOf(newMassiv, newMassiv.length);
//
//        String [] array = {"Maksat","Adyl","Nuraida"};
//        String [] array1 = {"Kalys","Bekzat","Bektur","Nuraida"};
//        String [] join = new String[array.length+array1.length];
//
//        int counter=0;
//        for (int i = 0; i < array.length; i++) {
//            join[i]=array[i];
//            counter++;
//        }
//        System.out.println(Arrays.toString(join));
//        System.out.println(counter);
//        for (int i = 0; i <array1.length ; i++) {
//            join[counter++]=array1[i];
//        }
//        System.out.println(Arrays.toString(join));


//int [] array ={23,345,67,5};
//        System.out.println(Arrays.toString(massiv(array)));
//}
//    public static int [] massiv (int [] massiv1){
//
//        for (int i = 0; i < massiv1.length; i++) {
//            for (int j = i+1; j < massiv1.length; j++) {
//                if (massiv1[i]>massiv1[j]){
//                    int a = massiv1[i];
//                    massiv1[i]=massiv1[j];
//                    massiv1[j]=a;
//                }
//            }
//        }return massiv1;


        //OOP


//        Phone phone1 = new Phone();
//        Scanner scanner = new Scanner(System.in);


//        scanner. сначала создаем класс а после используем
//        Moth.   можно сразу начать писать
//        int a = 6;

//        phone1.brand = "Samsung";
//        phone1.model = "23 Ultra";
//        phone1.price = 100000;
//        phone1.memory = 512;

//              System.out.println(phone1.toString());  /*или же*/
//        System.out.println(phone1);

//        Phone phone2 = new Phone();
//        phone2.brand = "Iphone";
//        phone2.model = "15 Pro Max";
//        phone2.price = 150000;
//        phone2.memory = 256;
//
//
//        Phone phone3 = new Phone();
//        phone3.brand = "Xiaomi";
//        phone3.model = "11T Pro";
//        phone3.price = 50000;
//        phone3.memory = 256;
//
//
//        Phone phone4 = new Phone();
//        phone4.brand = "Redmi";
//        phone4.model = "7";
//        phone4.price = 14000;
//        phone4.memory = 256;

//        phone1.call();
//        phone2.call();
//        phone3.call();


//        int[] massiv = new int[3];
//        Phone[] phones = new Phone[]{phone1, phone2, phone3, phone4};
//        arraySort(phones, "Samsung");
//        System.out.println(Arrays.toString(phones));   // или через
//
//        for (Phone phone : phones) {
        //   System.out.println(phone);
//        }


//    }

//    static void arraySort(Phone[] phones, String brand) {
//        for (Phone phone : phones) {
//            if (phone.brand.equals(brand)) {
//                System.out.println(phone);
//
//            }
//        }
//    }


        Person person1 = new Person();
        person1.floor = "Men";
        person1.age = 20;
        person1.colorSkin = "white";
        person1.placeOfBirth = "Canada";

        Person person2 = new Person();
        person2.floor = "Women";
        person2.age = 24;
        person2.colorSkin = "red";
        person2.placeOfBirth = "British";

        Person person3 = new Person();
        person3.floor = "Men";
        person3.age = 55;
        person3.colorSkin = "black";
        person3.placeOfBirth = "America";


        int [] massiv = new int[3];
        Person[] people = new Person[]{person1,person2,person3};
        for (Person people1:people) {
            System.out.println(people1);
        }


    }

}






















