import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.7
Составьте программу к задаче
«Вводить числа с клавиатуры и выводить ответ на вопрос: «является ли число четным?», пока не будет введен ноль».
 */
public class Task_30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i != 0)
        {
            if (i % 2 == 0)
            {
                System.out.println("Число четное");
            }
            else
            {
                System.out.println("Число нечетное");
            }
            i = sc.nextInt();

        }
    }
}
