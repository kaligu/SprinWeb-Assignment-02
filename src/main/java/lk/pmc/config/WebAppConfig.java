/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 4:06 PM
*/
package lk.pmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 4:06 PM
 */

@Configuration
@ComponentScan(basePackages = "lk.pmc")
@EnableWebMvc
public class WebAppConfig {

    public WebAppConfig(){
        System.out.println("WebAppConfig : Initialised");
    }

}
