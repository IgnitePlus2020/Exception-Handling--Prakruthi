package com.tgt.igniteplus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SwiggyDelivery
{
    static List<Integer> zipCode = new ArrayList<Integer>();
    static int zip;
    static int count;
    public void main(String[] args)
    {
        zipCode.add(123);
        zipCode.add(456);
        zipCode.add(789);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Zip Code");
        zip = in.nextInt();
        try
        {
            checkZip(zip);
        }
        catch (Exception e)
        {
            System.out.println("Delivery not available in your area :(");
        }
    }
        static class NoDeliveryException extends Exception
        {
            NoDeliveryException(String str)
            {
                super(str);
            }
        }
    public static void checkZip(int zip) throws NoDeliveryException
    {

        for (int i = 0; i < zipCode.size(); i++) {
            if (zipCode.get(i) != zip)
                count = 1;
            else
                throw new NoDeliveryException("Not a valid Zip Code");
        }
        if (count == 1)
            System.out.println("Delivery available in your area :)");

    }


}


