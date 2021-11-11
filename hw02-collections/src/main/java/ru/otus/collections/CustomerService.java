package ru.otus.collections;


import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CustomerService {

    private final Comparator<Customer> comparator = new ScoresComparator();
    private final TreeMap<Customer, String> customerServiceMap = new TreeMap<>(comparator);

    public Map.Entry<Customer, String> getSmallest() {
        return customerServiceMap.firstEntry();
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return customerServiceMap.higherEntry(customer);
    }

    public void add(Customer customer, String data) {
        customerServiceMap.put(customer, data);
    }

    public void printKeys() {
        Set<Customer> keys = customerServiceMap.keySet();
        for (Customer key : keys) {
            System.out.println(key + " --> " + customerServiceMap.get(key));
        }
    }

    private class ScoresComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {
            return Long.compare(o1.getScores(), o2.getScores());
        }
    }
}
