package edu.eci.bp;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        double[] data= {1.0,25.0,6.0,3.5,0.1,2.5,3.5,25.0};
        System.out.println( "La media de los datos es :"+StatisticsModule.mean(data) );
        System.out.println( "La desviacion estándar de los datos es :"+StatisticsModule.standardDeviation(data) );
        System.out.println( "La mediana de los datos es :"+StatisticsModule.mode(data) );
    }
}
