/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3_PolymorphismDynamic;

/**
 *
 * @author Revskyyy
 */
class Bank {
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank{
    float sukuBunga(){
        return 5.5f;
    }
}

class BNI extends Bank{
    float sukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank{
    float sukuBunga(){
        return 9.4f;
    }
}
