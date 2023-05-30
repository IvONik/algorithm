/**
     * Реализовать следующие методы
     * 1. public int size() - получить размер списка
     * 2. public boolean contains(int value) - проверить наличие элемента в списке
     * 3.* public MyLinkedList reversed() - создать НОВЫЙ список с обратным порядком
     * 4.** Заменить все int значения на дженерик T
     * 5.* Любые другие доработки, которые захотите для тренировки
     */

     public class HW_3 {

        public static void main(String[] args) {
       
            HW_3_MyLinkedList myLinkedList = new HW_3_MyLinkedList();
    
            myLinkedList.add(1);
            myLinkedList.add(2);        
            myLinkedList.add(3);
            myLinkedList.add(4);
            System.out.println(myLinkedList);
            System.out.print("значение по индексу: ");
            System.out.println(myLinkedList.get(0)); // 1
            System.out.print("размер списка: ");
            System.out.println(myLinkedList.getSize());
            System.out.print("содержится ли элемент: ");
            System.out.println(myLinkedList.contains(4));
            // System.out.println("удаление элемента: ");
            // System.out.println(myLinkedList.pop(-1)); // IndexOutOfBounds
           
        }
    
    }
