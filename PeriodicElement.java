/**
 * @author Norment, Daniel
 * Project: #4
 * Due: 12/8/16
 * Course: cs14002-f16
 *
 * Description:
 * Provides PeriodicElement which contains atomic number, abbreviation, name, and weight.
 */ 

public class PeriodicElement{
    private int atomicNumber;
    private String atomicAbbreviation;
    private String atomicName;
    private double atomicWeight;

    public PeriodicElement(int num, String abbr, String name, double weight){
        atomicNumber = num;
        atomicAbbreviation = abbr;
        atomicName = name;
        atomicWeight = weight;
    }
    
    public int getNumber(){
        return atomicNumber;
    }
    
    public String getAbbreviation(){
        return atomicAbbreviation;
    }
    
    public String getName(){
        return atomicName;
    }
    
    public double getWeight(){
        return atomicWeight;
    }
    
    public String toString(){
        return String.format("%3d %-3s %-20s %7.2f", atomicNumber, atomicAbbreviation, atomicName, atomicWeight);
    }
}
