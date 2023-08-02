package com.example.databaseproject;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

public class QueryBuilder {
    static String str="select * from table ";
    public static void main(String[]args){
        boolean flag=true;
        Scanner scanner=new Scanner(System.in);
        String isIncluded;
        System.out.println("is id included?");
        isIncluded=scanner.nextLine();

        if(isIncluded.equals("yes")){
            if (flag){
                str=str+"where ";
                str+="id=id_ ";
                flag=false;
            }else {
                str+=" and ";
                str+="id=id_ ";
            }
        }

        System.out.println("is name included?");
        isIncluded=scanner.nextLine();

        if(isIncluded.equals("yes")){
            if (flag){
                str=str+" where ";
                str+=" name=name_ ";
                flag=false;
            }else {
                str+=" and ";
                str+=" name=name_ ";
            }
        }

        System.out.println("is salary included?");
        isIncluded=scanner.nextLine();

        if(isIncluded.equals("yes")){
            if (flag){
                str=str+" where ";
                str+=" salary=salary_ ";
                flag=false;
            }else {
                str+=" and ";
                str+=" salary=salary_ ";
            }
        }

        System.out.println("is nickname included?");
        isIncluded=scanner.nextLine();

        if(isIncluded.equals("yes")){
            if (flag){
                str=str+" where ";
                str+=" nickname=nic_ ";
                flag=false;
            }else {
                str+=" and ";
                str+="nicname=nic_ ";
            }
        }


        LocalDate date=LocalDate.now();
        System.out.println(date.getDayOfMonth()+"|"+date.getMonthValue()+"|"+date.getYear());
        date.plus(2,ChronoUnit.WEEKS);
    }
}
