public class ok {


//    1 ЗАДАЧА
//
//
//
//         int[] massiv = {1, 2, -5, 4, -5, 6,};
//
//         int a = 0;
//
//         for (int i = 0; i < arr.length; i++) {
//        if (massiv[i]<0){
//        a=i;
//        break;
//        }
//        }
//        if (a>=0){
//        System.out.println("Первый отрицательный элемент: " + masiv[a] + ", порядковый номер: " + a);
//        }else {
//        System.out.println("В массиве нет отрицательных элементов.");
//        }
//
//
//        2 ЗАДАЧА
//
//        int [] massiv = {1,2,33,66,8,90};
//        for (int i = 0; i < massiv.length; i++) {
//        if (massiv[i]>=10){
//        System.out.println( massiv[i]);
//        }
//        }
//
//
//        3
//        int[] array = {11,-7,4,2,-20,-18,1};
//        int a = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//        sum += array[i];
//        if (array[i] < 0) {
//        a++;
//        }
//        }
//        float b = sum / 7f;
//        System.out.println(a);
//        System.out.println(b);
//
//        4
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//        if(array[i] % 2 == 1){
//        a++;
//        }
//        }
//        System.out.println("Кол-во: " + a);
//
//
//        5 ЗАДАЧА
//        int[] massiv = {10, 8, 6, 4, 2};
//        boolean a = true;
//        for (int i = 1; i < massiv.length; i++) {
//        if (massiv[i] >= massiv[i - 1]) {
//        a = false;
//        break;
//        }
//        }
//        if (a) {            System.out.println("Последовательность является убывающей.");
//        } else {            System.out.println("Последовательность является возрастающей.");
//        }
//
//        6
//        int[] array = {19, 19, 56, 3};
//        for (int i = 0; i < array.length; i++) {
//        if (array[i] == array[i+1]) {
//        i++;
//        System.out.println(true);
//        } else {
//        System.out.println(false);
//        }break;
//        }
//        7
//        int[] a = {3, 4, 56, 7, 900, 84, 3, 4, 5};
//        int b = a[0];
//        int c = 0;
//        for (int i = 0; i < a.length; i++) {
//        if (a[i] > b) {
//        b = a[i];
//        c = i;
//        }
//        }
//        int v = a[0];
//        a[0] = b;
//        a[c] = v;
//        for (int d : a) {
//        System.out.print(d + " ");
//        }
//
//        8.
//        int[][] massiv = {
//        {34, 3, 2, 5},
//        {56, 7, 4, 35},
//        {1, 23, 78, 6 }};
//
//        int max = Integer.MIN_VALUE;
//        int stroka = 0;
//        int stolbec = 0;
//        for (int i = 0; i < massiv.length; i++) {
//        for (int j = 0; j < massiv[i].length; j++) {
//        if (massiv[i][j] > max) {
//        max = massiv[i][j];
//        stroka = i;
//        stolbec = j;
//        } }
//        }
//        System.out.println("Самое больше число: " + max);
//        System.out.println("Строка номера: " + stroka);
//        System.out.println("Номер столбца: " + stolbec);
//
//        9
//        int [][] massiv = {
//        {7,-2,-3,-4,-5,-6},
//        {-7,-8,-9,-7,-4,-22},
//        {-1,-2,-3,-5,12,-6}
//        };
//        int a = 0;
//        int sum = 0;
//        for (int i = 0; i < massiv.length; i++) {
//        for (int j = 0; j < massiv[i].length; j++) {
//
//        if (massiv[i][j]>0){
//        sum += massiv[i][j];
//        }
//        if (massiv[i][j] > 0) {
//        a++;
//        }
//        }
//        }
//
//        int b = sum/a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(sum);
//
//
//
//
//        10
//        int a = 10;
//        int [] massiv = new int[a];
//        Random random = new Random();
//
//        for (int i = 0; i < massiv.length; i++) {
//        int b;
//        boolean c;
//
//        do {
//        c= true;
//        b = random.nextInt(11);
//
//        for (int j = 0; j < i; j++) {
//        if (massiv[j]==b){
//        c=false;
//        break;
//        }
//        }
//        }while (!c);
//
//        massiv[i]=b;
//        }
//        for (int d:massiv) {
//        System.out.print(d + " ");
//        }
//
//
//        11
//        int[][] matrix = {
//        {1,2,3,4,5},
//        {1,2,3,4,5},
//        {1,2,3,4,5},
//        {1,2,3,4,5},
//        {1,2,3,4,5}
//        };
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[i].length; j++) {
//        if (i<=j){
//        matrix[i][j]= 0;
//        }
//        }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[i].length; j++) {
//        System.out.print(matrix[i][j] +" ");
//        }
//        System.out.println();
//        }
//
//        12
//        int [] matrix = {1,2,3,4,5,6,7,8};
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < 8; j++){
//        System.out.print(matrix[j]+ " " );
//        }
//        System.out.println();
//        }
//
//        13
//        int[][] arr = {
//        {11, 7,34,21},
//        {7, 3,87,56},
//        {3, 23,75,5},
//
//        };
//        for (int i = 0; i < arr.length - 1; i++) {
//        for (int j = 0; j < arr.length - i - 1; j++) {
//        if (arr[j][2] > arr[j + 1][2]) {
//        int[] temp = arr[j];
//        arr[j] = arr[j + 1];
//        arr[j + 1] = temp;
//        }
//        }
//        }
//        for (int[] row : arr) {
//        System.out.print(row[2] + " ");
//        }
//
//
//        14
//        int[][] arr = {
//        {-11, 2,},
//        {7, 3,},
//        {3, 23,},
//        {25, 14,},
//        {13, 18,}
//        };
//        for (int i = 0; i < arr.length - 1; i++) {
//        for (int j = 0; j < arr.length - i - 1; j++) {
//        if (arr[j][1] > arr[j + 1][1]) {
//        int[] temp = arr[j];
//        arr[j] = arr[j + 1];
//        arr[j + 1] = temp;
//        }
//        }
//        }
//        for (int[] row : arr) {
//        System.out.print(row[1] + " ");
//        }
//
//        15 -
//        16 -
//
//        17
//        int[][] matrix = {
//        {16,9,1,5},
//        {9,5,2,7},
//        {3,8,2,9},
//        {19,34,5,2}
//        };
//        int minVal = Integer.MIN_VALUE;
//        int ash = 0;
//        for (int i = 0; i < matrix.length ; i++) {
//        if (matrix[i][i] > minVal){
//        minVal = matrix [i][i];
//        ash = i;
//        }
//        }
//        for (int j = 0; j < matrix.length ; j++) {
//        System.out.print(matrix[ash][j]+ "  ");
//        }
//
//        18-
//
//        19
//        Random random = new Random();
//        int[] massiv = new int[20];
//        for (int i = 0; i < 20; i++) {
//        massiv[i] = random.nextInt(0,99);
//        }
//        int a = random.nextInt(0,99);
//        System.out.println("рандомное число");
//        for (int b:massiv) {
//        if (b%a == 0) {
//        System.out.println(b );
//        }
//        }
//        System.out.println(Arrays.toString(massiv));
//
//
//
//        20
//        Random random = new Random();
//        int max = 50; // Устанавливаем начальное значение минимума на максимально возможное
//        int min = -50; // Устанавливаем начальное значение максимума на минимально возможное
//        for (int i = 0; i < 20; i++) {
//        int randomNumber = random.nextInt(-50,51);
//        System.out.println("Случайное число: " + randomNumber);
//        if (randomNumber < max) {
//        max = randomNumber;
//        }
//        if (randomNumber > min) {
//        min = randomNumber;
//        }
//        }
//        System.out.println("Наименьшее число: " + max);
//        System.out.println("Наибольшее число: " + min);
//        }
//
//
//
//        22
//        int [] massive = {1,2,3,4,5,6,7,8,9};int Max = massive[0];
//        for (int i = 0; i < massive.length-1; i++) {
//        if (massive[i] > Max){
//        Max = massive[i];
//        }
//        }
//        System.out.println("Наибольшой Элемент:"+Max);
//
//
//
//        23
//
//        int [] array = {1,2,3,4,5};
//        int [] array1 = {6,7,8,9,10};
//        int [] join = new int[array.length+array1.length];
//        int counter=0;
//        for (int i = 0; i < array.length; i++) {
//        join[i]=array[i];
//        counter++;
//        }
//        for (int i = 0; i <array1.length ; i++) {
//        join[counter++]=array1[i];
//        }
//        System.out.println(Arrays.toString(join));
//
//        24
//        int [] array = {3,7,3,2,9,6};
//
//        int min = array[0];
//        for (int i = 0; i < array.length-1; i++) {
//        if (array[i+1]<min){
//        min = array[i+1];
//
//        }
//        }
//        System.out.println(min);
//
//        25
//        Scanner sc = new Scanner(System.in);
//        int [] products= {5,6,7,8,9};
//        System.out.println("Enter the name of new number:");
//        int newProduct = sc.nextInt();
//        int[] newMassiv;
//        newMassiv = Arrays.copyOf(products, products.length + 1);
//        newMassiv[newMassiv.length - 1] = newProduct;
//        System.out.println(Arrays.toString(newMassiv));
//        products = Arrays.copyOf(newMassiv, newMassiv.length);
//
//        String [] array = {"Maksat","Adyl","Nuraida"};
//        String [] array1 = {"Kalys","Bekzat","Bektur","Nuraida"};
//        String [] join = new String[array.length+array1.length];
//
//        int counter=0;
//        for (int i = 0; i < array.length; i++) {
//        join[i]=array[i];
//        counter++;
//        }
//        System.out.println(Arrays.toString(join));
//        System.out.println(counter);
//        for (int i = 0; i <array1.length ; i++) {
//        join[counter++]=array1[i];
//        }
//        System.out.println(Arrays.toString(join));
//   }
}
