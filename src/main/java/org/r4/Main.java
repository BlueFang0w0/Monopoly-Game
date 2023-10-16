package org.r4;

import org.r4.Fields.Deeds.PropertyDeed;
import org.r4.Fields.Deeds.RailwayDeed;
import org.r4.Fields.Field;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] improvedRent = new int[]{1,2,3,4};
        Field field = new RailwayDeed("Rail","Railway","/img","Bank","Red", 200,200,100, false, improvedRent);
        System.out.println(field);
    }
}