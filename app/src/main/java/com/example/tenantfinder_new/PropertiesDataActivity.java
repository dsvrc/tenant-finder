package com.example.tenantfinder_new;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PropertiesDataActivity  {
    public static List<List<String>> method(){
    List<List<String>> lists = new ArrayList<>();
    ArrayList<String> list=new ArrayList<String>();
        list.add("Rs 1,00,000 / Month");
        list.add("Semi Furnished, 1BHK Flat, 1200 sqft.");
        list.add("Flat no:402, 4th Floor, 5th X roads, infront of Forum Mall, HSR Layout, Bengaluru.");
        list.add("Owner: Mr. Venkatraya");

        lists.add(list);
    ArrayList<String> list2=new ArrayList<String>();
        list2.add("Rs 15,000 / Month");
        list2.add("Fully Furnished, 3BHK Flat, 2500 sqft.");
        list2.add("Flat no:500, 5th Floor, RTX cross roads, infront of My friend house, Madhapur, Hyderabad.");
        list2.add("Owner: Mr. Satya Sai");

        lists.add(list2);
    ArrayList<String> list3=new ArrayList<String>();
        list3.add("Rs 1,20,000 / Month");
        list3.add("Fully Furnished, 6BHK Duplex, 3000 sqft.");
        list3.add("Door no:76/15/34, Main Road currency naga, infront of lalita jewllers, Nallamalla forest, AP.");
        list3.add("Owner: Mr. happy");

        lists.add(list3);

        ArrayList<String> list4=new ArrayList<String>();
        list4.add("Rs 20,000 / Month");
        list4.add("Not Furnished, 2 BHK Flat, 900 sqft.");
        list4.add("Flat no:1, First Floor, Mussoorie, infront of starbucks dosas, forest road, Mussoorie.");
        list4.add("Owner: Mr. Tony Stark");

        lists.add(list4);
        ArrayList<String> list5=new ArrayList<String>();
        list5.add("Rs 98,876 / Month");
        list5.add("Fully Furnished, 5BHK Duplex, 2000 sqft.");
        list5.add("Door no:1/2/3, FDS nagar, Beside Trendfet Mall, Top of Hill, Delhi.");
        list5.add("Owner: Mr. Ned Stark");

        lists.add(list5);
        ArrayList<String> list6=new ArrayList<String>();
        list6.add("Rs 50,900 / Month");
        list6.add("Semi Furnished, 3BHK Appartment, 2800 sqft.");
        list6.add("Door:56-56-78, Beverly Road, Beside tony stark house, jubliee hills, Hyderabad.");
        list6.add("Owner: Mr. Chris Evans");

        lists.add(list6);
        ArrayList<String> list7=new ArrayList<String>();
        list7.add("Rs 10,000 / Week");
        list7.add("Not Furnished, 1BHK Appartment, 1800 sqft.");
        list7.add("Flat No:1/3, 4th cross road, Electricity colony, Mega town ship road, inside lake, kerala.");
        list7.add("Owner: Mr. Ken kaneki");

        lists.add(list7);

        ArrayList<String> list8=new ArrayList<String>();
        list8.add("Rs 16,000 / Week");
        list8.add("Semi Furnished, 3BHK Appartment, 700 sqft.");
        list8.add("Flat No:5/67/89, Waterfall street, Ayyappa nagar town ship, kondareddy burj centre, Chittoor.");
        list8.add("Owner: Mr. Shoto Todoroki");

        lists.add(list8);
        return lists;
}
}

