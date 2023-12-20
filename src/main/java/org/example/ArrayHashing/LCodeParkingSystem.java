package org.example.ArrayHashing;

/*
https://leetcode.com/problems/design-parking-system/ (SLOLVED)

Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

Implement the ParkingSystem class:

ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot.
carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
A car can only park in a parking space of its carType.
If there is no space available, return false, else park the car in that size space and return true.
 */
public class LCodeParkingSystem {
    //adapted by: https://leetcode.com/problems/design-parking-system/solutions/910746/simple-java-solution-with-explaination-o-1-time-o-1-space-99-74-faster/
    private int [] parkingCapacity;
    public LCodeParkingSystem(int  big, int medium, int small){
        parkingCapacity = new int[]{big, medium, small};
    }
    public boolean addCar(int carType){
        int index = carType - 1;
        if(parkingCapacity[index] > 0){
            --parkingCapacity[index];
            return true;
        } else {
            return false;
        }
    }
}
