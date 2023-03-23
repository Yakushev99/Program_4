package ru.ibs.program4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        //Ввод x, y, z с клавиатуры
        System.out.print("x=");
        String sx = reader.readLine();
        double x = Integer.parseInt(sx);

        System.out.print("y=");
        String sy = reader.readLine();
        double y = Integer.parseInt(sy);

        System.out.print("z=");
        String sz = reader.readLine();
        double z = Integer.parseInt(sz);

        //Считаем среднее арифметическое
        double avg = (x+y+z)/3;

        System.out.println("Среднее арифметическое x, y, z = "+ avg);

        //Делим на 2, округляем и проверяем условие
        double del = avg/2;

        int round = (int)del;
        System.out.println(avg + " / 2 = "+del);
        System.out.println("Округляем в меньшую сторону. Получаем : "+ round);

        if (round > 3) {
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Программа выполнена не корректно!");
        }

    }
}
