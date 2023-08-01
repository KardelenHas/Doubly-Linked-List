import proje1.DoublyLinkedList;
public class test {
public static void main(String[] args) {
       // Let's create a new list called "list".
       DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        
        // Add numbers to the list and print list.
        list.add(99);
        list.add(98);
        list.add(97);
        list.add(96);
        list.print();
        
        // Added the string to index 3 and print list.
        list.add(3,95);
        list.print();
        
        // Removing second index of the list and print again.
        list.remove(2);
        list.print();
        
        // Rewrites the list in its new form.
        System.out.println(list.get(1));
        
        // Let's create a new list called "liste".
        DoublyLinkedList<Integer> liste = new DoublyLinkedList<Integer>();
        
        // Added some numbers to "liste" and printing "liste".
        liste.add(94);
        liste.add(93);
        liste.add(92);
        liste.print();
        
        // Adds the list we just created at the end of the previous list and print new list.
        list.addAll(liste);
        list.print();
        // If it is return true, if not return false 
        System.out.println(list.contains(94));
        
        // Again creating a new list which name is "liste".
        DoublyLinkedList<Integer> liste1 = new DoublyLinkedList<Integer>();
        
        // Added some numbers to "liste1".
        liste1.add(91);
        liste1.add(90);
       
        // It puts the last list we created in the first index of the first list we created.
        list.addAll(4, liste1);
        // Prints the final version.
        list.print();
        
        // Printing size of "list".
        System.out.println(list.size());
       
        // Clears "list" and prints again and so the file is empty.
        list.clear();
        list.print();
      
        // if empty return true but if not return false.
        System.out.println(list.isEmpty()); 
      
}
}