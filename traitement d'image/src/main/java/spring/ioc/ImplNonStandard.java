package spring.ioc;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("adapter")
public class ImplNonStandard implements ITraitement {

    TraitementImplAdapter adapter = new TraitementImplAdapter();

    public long traiter(int[][] image) {

        System.out.println("From : ImplNonStandard");
        System.out.println(Arrays.deepToString(image));

        int n = image.length;
        int m = image[0].length;

        int[] newImage = new int[n*m];

        for (int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                newImage[j+i*m]= image[i][j];
            }
        }
        char[] s = new char[40];
        Arrays.fill(s, '-');
        System.out.println(s);

        return adapter.traite(newImage);
    }
}
