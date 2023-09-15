/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 4:21 PM
*/
package lk.pmc.pojo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 4:21 PM
 */
@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("SpringBean : Initialised");
    }
}
