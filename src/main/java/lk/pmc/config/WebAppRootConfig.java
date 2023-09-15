/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 4:07 PM
*/
package lk.pmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 4:07 PM
 */
@Configuration
public class WebAppRootConfig {
    public WebAppRootConfig(){
        System.out.println("WebAppRootConfig : Initialised");
    }
}
