package ru.courses.massive;

public class Massive {
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }


    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) count = (count + 1);
        }

        return count;
    }

    public static boolean palindrom(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static int maxAbs(int[] arr) {
        int maxValue = arr[0];
        int maxAbs = 0;
        for (int i = 0; i < arr.length; i++) {
            int abs;

            if (arr[i] < 0) {
                abs = -arr[i];
            } else {
                abs = arr[i];
            }

            if (abs > maxAbs) {
                maxAbs = abs;
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        int[] result = new int[count];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[pos++] = i;
            }
        }

        return result;
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] result = new int[count];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[pos++] = arr[i];
            }
        }

        return result;
    }

  /*  public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >=0) count++;
        }
        int[] result = new int[count];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[pos++] = i;
            }
        }

        return result;
    }*/

    public static int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }


    public static int[] add(int[] arr, int[] ins, int pos) {
        // Создаём новый массив увеличенного размера
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }

        return result;
    }
}

/*
    public static void main(String[] args) {
        int[] arr1 = {-90,17,59, -25, 5, 4, -5};
        int[] ins1 = {6, 7, 8};

        System.out.println(java.util.Arrays.toString(deleteNegative (arr1)));

        /* System.out.println("До:    " + java.util.Arrays.toString(arr1));
(
        int[] reversed = reverseBack(arr1);

        System.out.println("После: " + java.util.Arrays.toString(concat(arr1,arr2)));*/





    /*public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        // До
        System.out.print("До:    ");
        for (int v : arr1) {
            System.out.print(v + " ");
        }
        System.out.println();

        // Разворачиваем
        reverse(arr1);

        // После
        System.out.print("После: ");
        for (int v : arr1) {
            System.out.print(v + " ");
        }
        System.out.println();
    }*/

/*   public static void main(String[] args){
        int [] arr={0,1,-8,6,-7,1,0};
       System.out.println(maxAbs(arr));
    }
}
*/

