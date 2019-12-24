package lesson02.part01;

import java.util.Scanner;

/**
 * Вывести на экран дату своего рождения в виде: MAY 1 2012
 * <p>
 * <p>
 * Требования:
 * 1.	Выводимый текст должен содержать месяц, день и год, разделенные пробелом.
 * 2.	Название месяца должно выводиться на английском языке и заглавными буквами.
 * 3.	Год должен состоять из четырех цифр и быть не меньше 1900.
 * 4.	Дата рождения должна предшествовать текущей.
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        int day = in.nextInt();
        int year = in.nextInt();


        String mon;
        switch (month) {
            case "01":
                mon = "JANUARY";
                break;
            case "02":
                mon = "FEBRUARY";
                break;
            case "03":
                mon = "MARCH";
                break;
            case "04":
                mon = "APRIL";
                break;
            case "05":
                mon = "MAY";
                break;
            case "06":
                mon = "JUNE";
                break;
            case "07":
                mon = "JULY";
                break;
            case "08":
                mon = "AUGUST";
                break;
            case "09":
                mon = "SEPTEMBER";
                break;
            case "10":
                mon = "OCTOBER";
                break;
            case "11":
                mon = "NOVEMBER";
                break;
            case "12":
                mon = "DECEMBER";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
            //System.out.println(mon);
            if (year < 2019 && year > 1900){
                System.out.println("U was born " + mon + " " +day + " " +year);
            }
            else{
                System.out.println("U R too yang");
                }
            

            
    }
}

