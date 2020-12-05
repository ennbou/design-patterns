package spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class TraitementImplAdapter {

    @Bean
    public long traite(int[] image){
        long r = 0;
        for(int i =0; i<image.length; i++){
            r+=image[i];
        }
        return r;
    }
}
