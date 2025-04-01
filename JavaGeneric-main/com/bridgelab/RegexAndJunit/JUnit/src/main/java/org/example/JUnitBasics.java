package org.example;

import java.util.List;

public class JUnitBasics {


    public  int add(int a,int b){
        return  a + b;
    }

    public static class ListManager {

        public void addElement(List<Integer> list, int element) {
            list.add(element);
        }

        public boolean removeElement(List<Integer> list, int element) {
            return list.remove(Integer.valueOf(element)); // Ensures object removal, not index-based removal
        }

        public int getSize(List<Integer> list) {
            return list.size();
        }
    }
}
