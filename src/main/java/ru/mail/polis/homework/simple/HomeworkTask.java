package ru.mail.polis.homework.simple;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        // function.applyAsDouble(4d);
        double x = a;
        double rectSquareSum = 0;

        while (x < b - delta) {
            rectSquareSum += function.applyAsDouble(x + delta / 2) * delta;
            x += delta;
        }

        return rectSquareSum;

        /*double res = 0;
        for (double step = a; step < b - delta; step += delta) {
            res += function.applyAsDouble(step + delta / 2);
        }
        res *= delta;
        return res;*/
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        long maxDigit = 0;
        byte indexFromEnd = 0;
        byte maxIndexFromEnd = 0;

        while (a > 0) {
            indexFromEnd++;
            if (a % 10 >= maxDigit) {
                maxDigit = a % 10;
                maxIndexFromEnd = indexFromEnd;
            }
            a = a / 10;
        }

        return (byte) (indexFromEnd - maxIndexFromEnd + 1);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return 0;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0;
    }

}
