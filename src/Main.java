public class Main {
    public static void main(String[] args) {

        System.out.println("___Вызов первый___");
        int age = 21, temp = -1;
        System.out.println(AgeTemp(RandomAge(), temp));

        System.out.println("___Вызов второй___");
        int age1 = 10, temp1 = 20;
        System.out.println(AgeTemp(RandomAge(), temp1));

        System.out.println("___Вызов третий___");
        int age2 = 40, temp2 = 15;
        System.out.println(AgeTemp(RandomAge(), temp2));

        System.out.println("___Вызов четвертый___");
        int age3 = 50, temp3 = -3;
        System.out.println(AgeTemp(RandomAge(), temp3));

        System.out.println("___Вызов пятый___");
        int age4 = 0, temp4 = 0;
        System.out.println(AgeTemp(RandomAge(), temp4));

    }

    public static String AgeTemp(int age, int temp) {

        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            return "Можно идти гулять №1\n";
        } else if (age < 20 && (temp > 0 && temp < 28)) {
            return "Можно идти гулять №2\n";
        } else if (age > 45 && (temp > -10 && temp < 25)) {
            return "Можно идти гулять №3\n";
        } else {
            return "Оставайтесь дома\n";
        }
    }

    public static int RandomAge(){
        int age = (int) (Math.random() * 60);
        return age;
    }



}