public class TraitementImplAdapter {
    public long traite(int[] image){
        long r = 0;
        for(int i =0; i<image.length; i++){
            r+=image[i];
        }
        return r;
    }
}
