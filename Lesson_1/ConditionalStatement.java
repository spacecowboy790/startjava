public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("Пользователь старше 20 лет");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Пользователь мужского пола");
        }
        if (!isMale) {
            System.out.println("Пользователь жеского пола");
        }

        double height = 1.85;
        if (height < 1.80) {
            System.out.println("Пользователь ниже 1.80 м");
        } else {
            System.out.println("Пользователь выше 1.80 м");
        }

        char firstCharOfName = 'W';
        if (firstCharOfName == 'M') {
            System.out.println("Имя пользователя начинается с буквы M");
        } else if (firstCharOfName == 'I') {
            System.out.println("Имя пользователя начинается с буквы I");
        } else {
            System.out.println("Имя пользователя не начинается с букв M или I");
        }
    }
}