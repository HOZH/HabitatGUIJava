package sample.test;

import sample.core.Store;
import sample.core.User;
import sample.core.item;

import java.io.IOException;
import java.util.*;

public class addItemDemo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Store habitat = new Store();

        habitat = habitat.inputStreamHelper();

        User user = habitat.getUsers().get("user1");

        System.out.println(user.getPassword());
        System.out.println(habitat.getItems().get("baby powder"));
        item item = habitat.getItems().get("baby powder");
        System.out.println(item.getName());
        List<item> items = new List<sample.core.item>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<item> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(item item) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends item> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends item> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public item get(int index) {
                return null;
            }

            @Override
            public item set(int index, item element) {
                return null;
            }

            @Override
            public void add(int index, item element) {

            }

            @Override
            public item remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<item> listIterator() {
                return null;
            }

            @Override
            public ListIterator<item> listIterator(int index) {
                return null;
            }

            @Override
            public List<item> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        items.add(item);

        //System.out.println(items.iterator().next());
        HashSet<item> items1 = new HashSet<>();

        items1.add(item);

        System.out.println(items1.size());
        System.out.println(items1.iterator().next());


    }
}
