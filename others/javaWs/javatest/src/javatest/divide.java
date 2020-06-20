package javatest;

public class divide {
public static void main(String[] args) {
    int divident=17*23*11;
    int divisor=2;
    // do{
    //     // System.out.println("trying divide divident "+divident);
    //     if(divident%divisor!=0){
    //         divisor++;
    //         // System.out.println("not complete divide so increase divisor"+divisor);
    //         continue;
    //     }else{
    //         System.out.println(" can divide with divsor"+ divisor);
    //         divident=divident/divisor;
    //         System.out.println(divident+"  "+divisor);
    //     }
    // } while (divident>1&&divisor<=divident);   

    // while (divident>1&&divisor<=divident){
    //     if(divident%divisor!=0){
    //         divisor++;
    //         continue;
    //     }else{
    //         divident=divident/divisor;
    //         System.out.println(divident+"  "+divisor);
    //     } 
    // }
    for(;divident>1&&divisor<=divident;){
        if(divident%divisor!=0){
            divisor++;
            continue;
        }else{
            divident=divident/divisor;
            System.out.println(divident+"  "+divisor);
        } 
    }
    System.out.println(0%2);
    // for (int i=1;i<100;i++){
    //     if(i%2==0){
    //         System.out.println(i);
    //     }
    // }
    int i=1;
    while(i<100){
       if(i%2==0){
           System.out.println(i);
       }
       i++ ;
    }
    do{
        if(i%2==0){
            System.out.println(i);
        }
        i++ ;
    }while(i<100);
}
}