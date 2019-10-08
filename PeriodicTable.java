/**
 * @author Norment, Daniel
 * Project: #4
 * Due: 12/8/16
 * Course: cs14002-f16
 *
 * Description:
 * Imports PeriodicElements from periodictable.txt into an array and allows user to provide an atomic 
 * number or abbreviation to search the array, print the table of elements, or exit.
 */ 

import java.io.*;
import java.util.Scanner;

public class PeriodicTable{
    private PeriodicElement[] elementArray = new PeriodicElement[256];
    private int elements;
    
    public PeriodicTable(String filename) throws IOException{
        elements = readTable(filename);
    }
    
    public int readTable(String filename) throws IOException{
        Scanner input = new Scanner(new File(filename));
        int count = 0;
        for (int i = 0; input.hasNext() && i < elementArray.length; i++){
            elementArray[i] = new PeriodicElement(input.nextInt(), input.next(), input.next(), input.nextDouble());
            count++;
        }
        return count;
    }
    
    public int getNumberOfElements(){
        return elements;
    }
    
    public PeriodicElement findElement(int num){
        for (int i = 0; i < elements && i < elementArray.length; i++){
            if (elementArray[i].getNumber() == num){
                PeriodicElement e = elementArray[i];
                return new PeriodicElement(e.getNumber(), e.getAbbreviation(), e.getName(), e.getWeight());
            }
        }
        return null;
    }
    
    public PeriodicElement findAbbreviation(String abbr){
        for (int i = 0; i < elements && i < elementArray.length; i++){
            if (elementArray[i].getAbbreviation().equals(abbr)){
                PeriodicElement e = elementArray[i];
                return new PeriodicElement(e.getNumber(), e.getAbbreviation(), e.getName(), e.getWeight());
            }
        }
        return null;
    }
    
    public void printTable(){
        System.out.println("A#  Ab  Name                  Weight");
        System.out.println("--- --- -------------------- -------");
        for (int i = 0; i < elements-1; i++){
            System.out.println(elementArray[i]);
        }
    }
    
    public static void main(String[] args) throws IOException{
        PeriodicTable table = new PeriodicTable("periodictable.txt");
        
        System.out.println("Periodic Table by Daniel Norment");
        System.out.println();
        System.out.println("Number of elements: " + table.elements);
        System.out.println();
        
        Scanner kb = new Scanner(System.in);
        int choice = 0;
        do {
            if (choice == 1){
                System.out.print("Enter an atomic number: ");
                int atomicNum = kb.nextInt();
                System.out.println(table.findElement(atomicNum));
            }else if(choice == 2){
                System.out.print("Enter an abbreviation: ");
                String atomicAbbr = kb.next();
                System.out.println(table.findAbbreviation(atomicAbbr));
            }else if(choice == 3){
                table.printTable();
            }
            
            System.out.println("1. Search atomic number");
            System.out.println("2. Search abbreviation");
            System.out.println("3. Print table");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter a choice? ");
            
            choice = kb.nextInt();
        }while(choice != 4);
    }
}
