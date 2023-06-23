
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sumArrayList sAL = new sumArrayList();
        AListToHSet toHashSet = new AListToHSet();
        reverseLinkedList reList = new reverseLinkedList();
        maxValueAList max = new maxValueAList();
        hmapStudentsInfo stdInfo = new hmapStudentsInfo();
        findValue search = new findValue();
        freqCheck freq = new freqCheck();
        IsArrayListEmpty check = new IsArrayListEmpty();
        insertAtPosAList insert = new insertAtPosAList();
        SortArray sArray = new SortArray();
        AListToTreeList atotree = new AListToTreeList();
        removeDuplicate rmvDup = new removeDuplicate();
        copyArrayList copy = new copyArrayList();
        CheckFreqOnLinkedList checkList = new CheckFreqOnLinkedList();
        AListToPQueue aPQueue = new AListToPQueue();
        checkList isContain = new checkList();
        List<Integer> arr01 = new ArrayList<Integer>(List.of(2, 4, 5, 54, 12, 65, 12, 4, 2));
        ArrayList<String> arr = new ArrayList<String>(List.of("gseg", "t34", "gfsdh", "gseg"));
        List<String> unSortArr = new ArrayList<String>(List.of("g", "g", "y", "k", "l", "B", "a", "a"));
        List<String> copiedArrayList = new ArrayList<String>();
        LinkedList<String[]> list = new LinkedList<String[]>(List.of(new String[] { "Rohan", "Ritik", "Prerit" },
                new String[] { "23", "20" }, new String[] { "Lucknow", "Delhi", "Jaipur" }));
        LinkedList<String> checkFreqList = new LinkedList<String>(List.of("g", "g", "y", "k", "l", "B", "a", "a"));
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        List<Integer> checkArraList = new ArrayList<Integer>(List.of(2,  5, 54, 65, 12));
        String[] name = { "gfs", "fsgbsv", "hgb" };
        String essay = "The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs. The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators. The treemap implementation is not synchronized in the sense that if a map is accessed by multiple threads, concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally. ";
        int[] id = { 1001, 1002, 1003 };
        System.out.println("\n Select a Menu Option: ");
        System.out.println("1 - Sum an array list");
        System.out.println("2 - ArrayList to HashSet");
        System.out.println("3 - Reverse linked list");
        System.out.println("4 - Max value");
        System.out.println("5 - Students Info");
        System.out.println("6 - Search a value");
        System.out.println("7 - Sort array follow alphabet");
        System.out.println("8 - ArrayList to TreeSet");
        System.out.println("10 - Remove all duplicate characters");
        System.out.println("11 - Copy array list");
        System.out.println("12 - Frequency check in Paragraph");
        System.out.println("13 - Frequency check on LinkedList");
        System.out.println("14 - Is array list empty");
        System.out.println("15 - Insert value at position");
        System.out.println("16 - Array List to Priority Queue");
        System.out.println("17 - Check is list contain all elements on Arraylist");

        do {

            try {
                int myInput = input.nextInt();

                switch (myInput) {
                    case 1:
                        System.out.println("1 - Sum an array list");
                        System.out.println(sAL.sumArray(arr01));
                        break;
                    case 2:
                        System.out.println("2 - ArrayList to HashSet");
                        System.out.println(toHashSet.toHashSet(arr));
                        break;
                    case 3:
                        System.out.println("3 - Reverse linked list");
                        list = reList.reverse(list);
                        for (String[] string : list) {
                            System.out.println(Arrays.toString(string));
                        }
                        break;
                    case 4:
                        System.out.println("4 - Max value");
                        System.out.println(max.maxValue(arr01));
                        break;
                    case 5:
                        System.out.println("5 - Students Info");
                        System.out.println(stdInfo.studentID(name, id));
                        break;
                    case 6:
                        System.out.println("6 - Search a value");
                        System.out.println(search.findValueArray(arr01, 4));
                        break;
                    case 7:
                        System.out.println("7 - Sort array follow alphabet");
                        sArray.sortArrayAlphabet(unSortArr);
                        System.out.println(unSortArr);
                        break;
                    case 8:
                        System.out.println("8 - ArrayList to TreeSet");
                        System.out.println(atotree.AListToTree(arr01));
                        break;
                    case 10:
                        System.out.println("10 - Remove all duplicate characters");
                        rmvDup.removeDup(unSortArr);
                        System.out.println(unSortArr);
                        break;
                    case 11:
                        System.out.println("11 - Copy array list");
                        copy.copyAList(unSortArr, copiedArrayList);
                        System.out.println(copiedArrayList);
                        break;
                    case 12:
                        System.out.println("12 - Frequency check in Paragraph");
                        for (Map.Entry<String, Integer> entry : freq.checkFreq(essay).entrySet()) {
                            System.out.println("Word: " + entry.getKey() + "|| Freq: " + entry.getValue());
                            System.out.println();
                        }
                        break;
                    case 13:
                        System.out.println("13 - Frequency check on LinkedList");
                        checkList.CheckFreq(checkFreqList);
                        break;
                    case 14:
                        System.out.println("14 - Is array list empty");
                        System.out.println("Is this arraylist empty: " + check.isListEmpty(arr01));
                        break;
                    case 15:
                        System.out.println("15 - Insert value at position");
                        insert.insertAt(arr01, 69, 4);
                        System.out.println("After insert: " + arr01);
                        break;
                    case 16:
                        System.out.println("16 - Array List to Priority Queue");
                        pQueue = aPQueue.toPQueue(unSortArr);
                        System.out.println("Priority queue: " + pQueue);
                        System.out.println("Array list: " + unSortArr);
                        break;
                    case 17:
                        System.out.println("17 - Check is list contain all elements on Arraylist");
                        System.out.println("Is list contains all elements on arraylist: "
                                + isContain.isContain(arr01, checkArraList));
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input" + e.getMessage());
            }
        } while (true);
    }
}