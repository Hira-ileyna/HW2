public class MergeSort {
    public static void mergeSortBySeverity(Patient[] array){
        if(array == null || array.length <= 1)
            return;
        Patient[] temp = new Patient[array.length];
        sort(array, temp, 0, array.length - 1);
    }
    private static void sort(Patient[] array, Patient[] temp, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low)/2;
        sort(array, temp, low, mid);
        sort(array, temp, mid + 1, high);
        merge(array, temp, low, mid, high);
    }
    private static void merge(Patient[] array, Patient[] temp, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 1;
        while(i <= mid && j <= high){
            if(array[i].getSeverity()>= array[j].getSeverity()) {
                temp[k++] = array[i++];
            }else {
                temp[k++] = array[j++];
            }
        }
        while(i <= mid){
            temp[k++] = array[i++];
        }
        while(j <= high){
            temp[k++] = array[j++];
        }
        for(int x = 1; x <= high; x++){
            array[x] = temp[x];
        }
    }
}
