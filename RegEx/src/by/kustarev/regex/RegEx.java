package by.kustarev.regex;

import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

//        String regex = "java";  // шаблон строки "java"
//        regex = "\\d{3}";       // шаблон строки из трех цифровых символов
//        String string = "Игорь Ваня Даша Алла Алексей";
//        Pattern pattern = Pattern.compile("^[a-z]+$", Pattern.CASE_INSENSITIVE);
//
//        String example = "А.+а"; // жадный режим
//        example = "А.++а";       // сверхжадный режим
//        example = "А.+?а";       // ленивый режим
//
//        String text = "Егор Алла Александр";
//        pattern = Pattern.compile("А.+а");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find())
//            System.out.println(text.substring(matcher.start(), matcher.end()));

//        String s = "The root directory is \nWindows"; // перенос Windows на новую строку
//        System.out.println(s);
//        s = "The root directory is \u00A7Windows";    // вставка символа параграфа перед Windows
//
//        System.out.println(s);

//
//        regex = "\\s9299809qw((((()";         // шаблон для поиска символов пробела
//        Pattern.compile(regex);
//        regex = "\"Windows\""; // шаблон для поиска строки "Windows"
//        Pattern.compile(regex);


//        pattern = Pattern.compile("[asd]$");
//        System.out.println(pattern.pattern());


//        System.out.println(Pattern.matches("^А.+[ег]$", "Андре"));
//        System.out.println("Андре".matches("^А.+[ег]$"));

//
//        regex = "How\\?"; // шаблон для поиска строки “How?"
//
//        // Методы класса Pattern
//        pattern = Pattern.compile("abc");
//        System.out.println(pattern.pattern()); // "abc"
//
//        System.out.println(Pattern.matches("А.+а","Алла")); // true
//        System.out.println(Pattern.matches("А.+а","Егор Алла Александр")); // false


//
//        pattern = Pattern.compile("abc");
//        System.out.println(pattern.flags()); // 0
//
//        pattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
//        System.out.println(pattern.flags()); // 2
//
        // TODO !!!!
//        text = "Егор Алла Анна";
//        pattern = Pattern.compile("\\s");
//        String[] strings = pattern.split(text,2);
//        for (String str : strings) {
//            System.out.println(str);
//        }
//        System.out.println("---------");
//        String[] strings1 = pattern.split(text);
//        for (String str : strings1) {
//            System.out.println(str);
//        }
//
        // Методы класса Matcher
//        Pattern p = Pattern.compile("a*b");    // скомпилировали регулярное выражение в представление
//        Matcher m = p.matcher("aaaab");  // создали поисковик в тексте “aaaaab” по шаблону "a*b"
//        System.out.println(m.matches());



//
//
//        text = "Егор Алла Анна";
//        pattern = Pattern.compile("А.+?а");
//
//        matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            int start = matcher.start();
//            int end = matcher.end();
//            System.out.println("Найдено совпадение " + text.substring(start, end) + " с " + start + " по " + (end-1) + " позицию");
//        }
//        System.out.println(matcher.replaceFirst("Ира"));
//        System.out.println(matcher.replaceAll("Ольга"));
//        System.out.println(text);


//        String testStr = "Привет, как      тебя    зовут    ?";
//
//        System.out.println(testStr.replaceAll("\\s", ""));
    }

}
