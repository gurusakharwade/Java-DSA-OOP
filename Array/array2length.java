public class array2length {
    public static void main(String[] args) {
        int[] array = new int[5];
                int length = 0;
        for (int i=0; i<3; i++){
            array[i] = i*i;
            length++;
        }
        System.out.println("the array has a length of " + length);
    }
}
