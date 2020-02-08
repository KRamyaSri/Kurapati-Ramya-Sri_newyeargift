package com.epam.newyear;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class Sweet 
{   	 
    	    public static void main(String[] args){
    	         
    	        List<Sweets> sweet = new ArrayList<Sweets>();
    	        System.out.println("enter number of chocolates you want to add: ");
    	        Scanner sc=new Scanner(System.in);
    	        int i,totalSweet,sweetNumber,sweetWeight;
    	        String sweetName;
    	        totalSweet=sc.nextInt();
    	        int totalWeight=0;
    	        sc.nextLine();
    	        for(i=0;i<totalSweet;i++) {
    	        	System.out.println("enter name of sweet:");
    	        	sweetName=sc.nextLine();
    	        	System.out.println("enter serial number of sweet:");
    	        	sweetNumber=sc.nextInt();
    	        	System.out.println("enter weight of sweet:");
    	        	sweetWeight=sc.nextInt();
    	        	sc.nextLine();
    	        	Sweets s =new Sweets(sweetNumber, sweetName, sweetWeight);
    	        	sweet.add(s);
    	        	totalWeight=totalWeight+sweetWeight;
    	        }
    	        Sweets maxWeight = Collections.max(sweet);
    	        System.out.println("before sorting...");
    	        System.out.println(sweet);
    	        Collections.sort(sweet);
    	        System.out.println("after sorting...");
    	        System.out.println(sweet);
    	        System.out.println("chocolate with max weight: "+maxWeight);
    	        System.out.println("the total weight of chocolate is:"+totalWeight);
    	        sc.close();
    	    }
    	}
    	 
    	class Sweets implements Comparable<Sweets>{
    	     
    	    private int id;
    	    private String name;
    	    private Integer wt;
    	     
    	    public Sweets(int id, String name, Integer wt){
    	        this.id = id;
    	        this.name = name;
    	        this.wt = wt;
    	    }
    	     
    	    public int getId() {
    	        return id;
    	    }
    	    public void setId(int id) {
    	        this.id = id;
    	    }
    	    public String getName() {
    	        return name;
    	    }
    	    public void setName(String name) {
    	        this.name = name;
    	    }
    	    public Integer getWt() {
    	        return wt;
    	    }
    	    public void setWt(Integer Wt) {
    	        this.wt = Wt;
    	    }
    	    public int compareTo(Sweets s) {
    	         
    	        return this.wt.compareTo(s.getWt());
    	    }
    	    public String toString(){
    	        return id+"  "+name+"   "+wt;
    	    }
    	}
