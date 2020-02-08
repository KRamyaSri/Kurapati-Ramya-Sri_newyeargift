package com.epam.newyear;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class Chocolateclass 
{   	 
    	    public static void main(String[] args){
    	         
    	        List<Chocolate> choco = new ArrayList<Chocolate>();
    	        System.out.println("enter number of chocolates you want to add: ");
    	        Scanner sc=new Scanner(System.in);
    	        int i,totalChocolates,chocolateNumber,chocolateWeight;
    	        String chocolateName;
    	        totalChocolates=sc.nextInt();
    	        int totalWeight=0;
    	        sc.nextLine();
    	        for(i=0;i<totalChocolates;i++) {
    	        	System.out.println("enter name of chocolate:");
    	        	chocolateName=sc.nextLine();
    	        	System.out.println("enter serial number of chocolate:");
    	        	chocolateNumber=sc.nextInt();
    	        	System.out.println("enter weight of chocolate:");
    	        	chocolateWeight=sc.nextInt();
    	        	sc.nextLine();
    	        	Chocolate c = new Chocolate(chocolateNumber, chocolateName, chocolateWeight);
    	        	choco.add(c);
    	        	totalWeight=totalWeight+chocolateWeight;
    	        }
    	        Chocolate maxWeight = Collections.max(choco);
    	        System.out.println("before sorting...");
    	        System.out.println(choco);
    	        Collections.sort(choco);
    	        System.out.println("after sorting...");
    	        System.out.println(choco);
    	        System.out.println("chocolate with max weight: "+maxWeight);
    	        System.out.println("the total weight of chocolate is:"+totalWeight);
    	        sc.close();
    	    }
    	}
    	 
    	class Chocolate implements Comparable<Chocolate>{
    	     
    	    private int id;
    	    private String name;
    	    private Integer wt;
    	     
    	    public Chocolate(int id, String name, Integer wt){
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
    	    public int compareTo(Chocolate c) {
    	         
    	        return this.wt.compareTo(c.getWt());
    	    }
    	    public String toString(){
    	        return id+"  "+name+"   "+wt;
    	    }
    	}
