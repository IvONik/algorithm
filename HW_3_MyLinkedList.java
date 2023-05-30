
public class HW_3_MyLinkedList {
        
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    // добавить значение в начало:
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            tail = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
            tail = new Node(value);
        }
    }

    public int getFirst() {
        return get(0);
    }

    // получение индекса:
    public int get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index && current != null) {
            return current.value;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public int popFirst() {
        return pop(0);
    }

    // удаление по индексу (и возврат значения удаленного эл-та):
    public int pop(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            int pop = head.value;
            head = head.next;
            return pop;
        }

        Node previous = head; // предыдущая от искомой
        int currentIndex = 1;
        while (previous.next != null) {
            if (currentIndex == index) {
                int pop = previous.next.value;
                previous.next = previous.next.next;
                return pop;
            }

            previous = previous.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException(index);
    }

    // public String reversed() {
    // throw new UnsupportedOperationException();
    // }

    private Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;

        }
        return current;
    }

    public int getSize() {

        Node current = head;
        int count = 0;
        if (head == null) {
            return count;
        } else {
            count = 1;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        }
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }

        int length = result.length();
        if (length > 4) {
            result.delete(length - 4, length); // удаляет последние элементы в срезе: length - 4, length (" -> ")
        }

        result.append("]");
        return result.toString();
    }

}