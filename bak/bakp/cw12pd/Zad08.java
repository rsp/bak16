
class ListElement {

    int v;
    ListElement next;

    ListElement(int v) {
        this.v = v;
    }

}

class List {

    private ListElement first;

    int getLength() {
        int l = 0;
        ListElement el = first;
        while (el != null) {
            el = el.next;
            l++;
        }
        return l;
    }
    void addElement(int n) {
        if (first == null)
            first = new ListElement(n);
        else {
            ListElement el = first;
            while (el.next != null)
                el = el.next;
            el.next = new ListElement(n);
        }
    }
    void addElement(int n, int p) throws Exception {
        ListElement ne = new ListElement(n);
        if (p == 0) {
            ne.next = first;
            first = ne;
        } else {
            ListElement el = first;
            for (int i = 0; i < p-1; i++) {
                if (el.next == null)
                    throw new Exception("cannot add element " + p);
                el = el.next;
            }
            ne.next = el.next;
            el.next = ne;
        }
    }
    int getElement(int p) throws Exception {
        if (first == null)
            throw new Exception("empty list");
        ListElement el = first;
        for (int i = 0; i < p; i++) {
            if (el.next == null)
                throw new Exception("cannot get element " + p);
            el = el.next;
        }
        return el.v;

    }
    void removeElement(int p) throws Exception {
        if (p == 0) {
            if (first == null)
                throw new Exception("cannot remove element " + p);
            first = first.next;
        } else {
            ListElement el = first;
            for (int i = 0; i < p-1; i++) {
                if (el.next == null || el.next.next == null)
                    throw new Exception("cannot remove element " + p);
                el = el.next;
            }
            el.next = el.next.next;
        }
    }
    void print() {
        System.out.print("List (");
        ListElement el = first;
        while (el != null) {
            System.out.print(" " + el.v);
            el = el.next;
        }
        System.out.println(" )");
    }

}

public class Zad08 {

    public static void main(String[] args) throws Exception {

        List l = new List();

        l.print();
        try { l.getElement(0); } catch (Exception e) {
            System.out.println("Element 0: " + e);
        }
        l.addElement(1);
        l.addElement(2);
        l.addElement(3);
        l.print();
        System.out.println("Element 0: " + l.getElement(0));
        System.out.println("Element 2: " + l.getElement(2));
        try { l.getElement(3); } catch (Exception e) {
            System.out.println("Element 3: " + e);
        }
        l.addElement(10,1);
        l.print();
        l.addElement(10,4);
        l.print();
        try { l.addElement(10,6); } catch (Exception e) {
            System.out.println(e);
        }
        l.removeElement(0);
        l.print();
        l.removeElement(3);
        l.print();
        try { l.removeElement(0); } catch (Exception e) {
            System.out.println(e);
        }
        l.print();

    }

}
