// class Task_0{
//     private long[] a;                                   //ссылка на массив
//     private int elems;                                  //количество элементов в массиве

//     public Task_0(int max){                             //конструктор класса
//         a = new long[max];                              //создание массива размером max
//         elems = 0;                                      //при создании массив содержит 0 элементов
//     }

//     public void into(long value){                       //метод вставки элемента в массив
//         a[elems] = value;                               //вставка value в массив a
//         elems++;                                        //размер массива увеличивается
//     }

//     public void printer(){                               //метод вывода массива в консоль
//         for (int i = 0; i < elems; i++){                 //для каждого элемента в массиве
//             System.out.print(a[i] + " ");                //вывести в консоль
//             System.out.println("");                   //с новой строки
//         }                                              
//         System.out.println("----Окончание вывода массива----");
//     }

//     private void toSwap(int first, int second){         //метод меняет местами пару чисел массива
//         long dummy = a[first];                          //во временную переменную помещаем первый элемент
//         a[first] = a[second];                           //на место первого ставим второй элемент
//         a[second] = dummy;                              //вместо второго элемента пишем первый из временной памяти
//     }


//     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
//     public void bubbleSorter(){                         
//         for (int out = elems - 1; out >= 1; out--){     //Внешний цикл
//             for (int in = 0; in < out; in++){           //Внутренний цикл
//                 if(a[in] > a[in + 1])                   //Если порядок элементов нарушен
//                     toSwap(in, in + 1);                 //вызвать метод, меняющий местами
//             }
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Task_0 array = new Task_0(16);              //Создаем массив array на 16 элементов

//         array.into(2);                            //заполняем массив
//         array.into(3);
//         array.into(245);
//         array.into(91);
//         array.into(14);

//         array.printer();                                //выводим элементы до сортировки
//         array.bubbleSorter();                           //ИСПОЛЬЗУЕМ ПУЗЫРЬКОВУЮ СОРТИРОВКУ
//         array.printer();                                //снова выводим отсортированный список
//     }
// }
