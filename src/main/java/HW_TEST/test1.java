package HW_TEST;

public class test1 {
   /* public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int array[] = new int[k];
        System.out.println("Введите цифры для заполнения массива");
        for (int i = 0; i < k; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int min = array[0];
        int max = array[0];
        int index_min=0;
        int index_max=0;

        for (int i=1 ; i < array.length ; i++){
            if (array[i] < min){
                min=array[i];
                index_min = i;
            }
            if (array[i] > max){
                max=array[i];
                index_max=i;
            }
        }
        //int count= Math.abs (index_max-index_min)-1;
        int count = index_max - index_min;
        if (count<0) {
            count=-count;
        }
        if (count!=0){
            count = count -1;
        }

        /*for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int s = array[i + 1];
                array[i + 1] = array[i];
                array[i] = s;
            }
        }*/
    //сравнивает первый миним с первым максималным
    //System.out.println("Min " + min + " Max " + max +" "+ index_min+" "+index_max + " Количество " + count );
    //}

   /* public static void main(String[] args) {
            int[] arr = makeRandomArr(10, 10);
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    evenSum += arr[i];
                } else {
                    oddSum += arr[i];
                }
            }

            System.out.println("array: " + Arrays.toString(arr));
            System.out.format("even sum: %d\n", evenSum);
            System.out.format("odd sum: %d\n", oddSum);
        }

        private static int[] makeRandomArr(int size, int bound) {
            int[] arr = new int[size];
            Random rnd = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(bound);
            }
            return arr;
        }}*/
//   public static void main(String[] args) {
//
//        int array[] = {1, 5, 7, 8, 5, 0};
//        int sum1 = 0;
//        int sum2 = 0;
//
//
//       for (int i = 0; i < array.length; i++) {
//                if (i % 2 == 0) {
//                    sum2 += array[i];
//                } else {
//                    sum1 += array[i];
//                }
//               // sum2 = sum2 + array[i];
//        }
//       System.out.println("array: " + Arrays.toString(array));
//       System.out.format("nechet sum: %d\n", sum2);
//       System.out.format("chet sum: %d\n", sum1);
//       System.out.println("Билет счасливый: " + (sum1==sum2));
//        //System.out.println("sum1 "+ sum1 + " sum2 " +sum2);
//      // if (sum1 == sum2)
//       //{

//    }
}
//      //  for(int i = 0;i<array.length;i++){
           // if(array[i]%2==0)
            //    System.out.print(array[i] + " ");
      //  }
        //sum1 = sum1 + array[i];
                //System.out.println("chet " + sum1);
          //  }
           // sum1 = sum1 + array[i];
      //  }
       /* for (int i = 0; i < 6; i++) {
       if ()

            sum2 = sum2 + array[i];
        }
        System.out.println("sum1 "+ sum1 + " sum2 " +sum2);
        if (sum1 == sum2) {
            System.out.println(" Lucky ");
        } else {
            System.out.println("Not lucky");
        }
        System.out.println("Билет счасливый: " + (sum1==sum2) );
    }*/
