public class SecondHome {
    public static void main(String[] args) {


        /*1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(arr.length);
        for (
                int i = 0;
                i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    /*2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr = new int[8];
        for (int i = 1, j = 0; i < arr.length; i++)
            arr[i] = j += 3;
        for (int x : arr)
            System.out.println(x + " ");
    }
}
    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
            System.out.print(arr2[i] + " ");
        }
    }
}

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами;
        int a = 0;
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                a++;
                arr4[i][j] = a;
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
     /*5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int arr[] = {5, 6, 15, 25, 2, 84, 13};
        int max = arr[0], a = 0;
        int min = arr[0], b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                a = max;
            }
            if (arr[i] < min) {
                min = arr[i];
                b = min;
            }
        }
        System.out.println("Max = " + a);
        System.out.println("Min = " + b);

    }
}
     /*6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве
     есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
     checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    static boolean sum(int[] arr) {
        int a, b;
        for (int i = 0; i < arr.length; i++) {
            a = 0;
            b = 0;
            for (int j = 0; j < i; j++) {
                a += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                b += arr[j];
            }
            if (a == b)
                ;
            return true;
        }
        return false;
    }
}