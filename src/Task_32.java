import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.9
Составьте программу к задаче
«Вводить числа с клавиатуры, пока не встретится число кратное 5. Сколько среди введенных чисел оканчивалось цифрой 2?».
 */
public class Task_32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = 0;
        while (i % 5 != 0)
        {
            i = sc.nextInt();
            String g = Integer.toString(i);
            if (g.endsWith("2"))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
