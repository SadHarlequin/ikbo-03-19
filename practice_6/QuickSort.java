package practice_6;

class QuickSort {
    Students[] listStudents;

    int partition(Students[] listStudents, int low, int high) {
        Students pivot = listStudents[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (listStudents[j].compareTo(pivot) < 0) {
                i++;
                Students temp = listStudents[i];
                listStudents[i] = listStudents[j];
                listStudents[j] = temp;
            }
        }
        Students temp = listStudents[i + 1];
        listStudents[i + 1] = listStudents[high];
        listStudents[high] = temp;
        return i + 1;
    }

    void sort(Students[] listStudents, int low, int high) {
        if (low < high) {
            int pi = partition(listStudents, low, high);
            sort(listStudents, low, pi - 1);
            sort(listStudents, pi + 1, high);
        }
    }

    static void printArray(Students[] listStudents) {
        int n = listStudents.length;
        for(int i=n-1; i>-1; i--){
            System.out.println(listStudents[i].toString());
        }
    }
}