package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;

public class AT11_ArrayList {
    @Test
    public void ArrayList(){
        //syntax of arraylist
        ArrayList<String> ListOfCars = new ArrayList<String>();
        // let add items into arraylist
        ListOfCars.add("BMW");
        ListOfCars.add("Toyota");
        ListOfCars.add("Benz");
        ListOfCars.add("RangeRover");
        System.out.println("cars inside Array list are : "+ ListOfCars);
        //syntax of arraylist
        ArrayList<Integer> ListOfCars2 = new ArrayList<Integer>();
        // let add items into arraylist
        ListOfCars2.add(1);
        ListOfCars2.add(2);
        ListOfCars2.add(3);
        ListOfCars2.add(4);
        System.out.println("Numbers inside Array list are : "+ ListOfCars2);
        //count
        int CarsCount = ListOfCars.size();
        System.out.println("CarsCount : "+CarsCount); //4
        //for loop
        for(int i=0;i<CarsCount;i++){
            System.out.println("Array index : "+ i+" and its value is : "+ListOfCars.get(i));
        }
    }

}
