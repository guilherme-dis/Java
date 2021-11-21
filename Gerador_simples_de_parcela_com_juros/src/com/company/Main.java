package com.company;

import com.company.entities.Contract;
import com.company.services.ContractService;
import com.company.services.OnlinePaymentService;
import com.company.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner =new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.println("Number: ");

        Integer number = scanner.nextInt();
        System.out.println("Date (dd/MM/yyyy");

        Date date=sdf.parse(scanner.next());

        System.out.println("Contract value: ");

        double totalValue=scanner.nextDouble();

        Contract c1=new Contract(number,date,totalValue);

        ContractService cs=new ContractService(new PaypalService());

        System.out.println("Enter number of installments");
        int n=scanner.nextInt();
        cs.processContract(c1,n);

        c1.getIntallmentList().forEach(System.out::println);


        scanner.close();

    }
}
