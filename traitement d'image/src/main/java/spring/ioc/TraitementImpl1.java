package spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("impl1")
public class TraitementImpl1 implements ITraitement {

    public long traiter(int[][] image) {
        System.out.println("From : TraitementImpl1");
        System.out.println(Arrays.deepToString(image));
        long r = 0;
        for (int i = 0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                r+= image[i][j];
            }
        }

        char[] s = new char[40];
        Arrays.fill(s, '-');
        System.out.println(s);

        return r;
    }
}
