//package KForce;
//
//import java.io.BufferedWriter;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Solution {
//
//    private static List<Customer> customerList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        customerList.add(new Customer("Mark", "Abr", "Fairfield", 200));
//        customerList.add(new Customer("Mark", "Abr", "Fairfield", 200));
//        customerList.add(new Customer("Mark", "Abr", "Fairfield", 2020));
//        customerList.add(new Customer("Mark", "Abr", "Fairfield", 200));
//        customerList.add(new Customer("Mark", "Abr", "Fairfield", 200));
//        customerList.add(new Customer("Mark", "Abr", "New York", 2));
//        customerList.add(new Customer("Mark", "Abr", "Oakland", 15));
//        customerList.add(new Customer("Mark", "Abr", "Columbus", 23));
//        customerList.add(new Customer("Mark", "Abr", "Chicago", 2));
//        customerList.add(new Customer("Brook", "Abr", "Chicago", 25));
//        customerList.add(new Customer("Elias", "Abr", "Chicago", 4));
//        customerList.add(new Customer("Felix", "Abr", "Chicago", 52));
//        customerList.add(new Customer("Yodit", "Abr", "Chicago", 1));
//        customerList.add(new Customer("Mark", "Abr", "Chicago", 20));
//        Collections.sort(customerList, (Comparator.comparing(Customer::getCity)));
//        for(Map.Entry<String, Long> entry : getNumberOfPeopleInCity().entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        System.out.println(customerList.size());
//
////        int maxCont = Integer.MIN_VALUE;
////        String maxName = "";
////        for(Map.Entry<String, Integer> entry : getNumberOfContractsSignedInCity().entrySet()) {
////            if(maxCont < entry.getValue()) {
////                maxCont = entry.getValue();
////                maxName = entry.getKey();
////            }
//////            System.out.println(entry.getKey() + " : " + entry.getValue());
////        }
////        System.out.println(maxName + " : " + maxCont);
//
//
//        System.out.println(getUniqueCustomers());
//    }
//
//    private static Long getUniqueCustomers() {
//        return customerList.stream().map(Customer::getCity).distinct().count();
//    }
//
//    private static Map<String, Integer> getNumberOfContractsSignedInCity() {
//        return customerList.stream().map(Customer::getCity).distinct().collect(Collectors.toMap(e -> e, e1 ->
//            customerList.stream().filter(e2 -> e2.getCity().equals(e1)).mapToInt(Customer::getCONTRCNT).sum()
//        ));
//    }
//
//    private static Map<String, Long> getNumberOfPeopleInCity() {
//        return customerList.stream().map(Customer::getCity).distinct().collect(Collectors.toMap(e -> e, e1 ->
//            customerList.stream().map(Customer::getCity).filter(e2 -> e2.equals(e1)).count()
//        )).entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
////                .entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
////                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//    }
//    Array [] a = new Array[];
//
//
//
//
//
//
//}
