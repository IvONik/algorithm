import java.util.Arrays;

/**
 * Реализовать сортировку подсчетом.
 * [1 2 3 2 1 2 3 4 4 4 2 3 3 1 2 3 4 4 2 1 3 4 2 1 1]
 * 1 -> 5 Единица встречается 5 раз (! ЧИСЛО ВЗЯТО С ПОТОЛКА!)
 * 2 -> 7 Двойка встречается 7 раз
 * 3 -> 3
 * 4 -> 5
 * Вставляем единицу 5 раз, потом двойку 7 раз, потом тройку 3 три раза, потом
 * четверку 5 раз
 */

public class HW_2 {

    public static void main(String[] args) {

        int[] array = new int[] { 1, 2, 3, 2, 1, 2, 3, 4, 4, 4, 2, 3, 3, 1, 2 };
        //tempSort(array);
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }


// сортировка подсчетом:
    static void countingSort(int[] array){

        int[] count = new int[array.length];
        int index=0;

        for (int i = 0; i < array.length; i++){
            count[array[i]]++;
            }
        for (int i = 0; i < count.length; i++){
            for (int j = 0; j < count[i]; j++){
                array[index]=i;
                index++;
            }
        }
    }


    // static void tempSort(int[] array) {
    //     for (int i = 0; i < array.length - 1; i++) {
    //         if (array[i + 1] < array[i]) {
    //             int tmp = array[i];
    //             array[i] = array[i + 1];
    //             array[i + 1] = tmp;
    //             i++;
    //             countingSort(array);
    //         } 
    //     }        
    // }    
}
