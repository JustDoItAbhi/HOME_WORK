package lld1.DSA.strings.index_of;

public class IndexOf {
    public static void findPositions(String s,String b){
        int firstIndex = s.indexOf(b);
        int lastIndex = s.lastIndexOf(b);

        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);

        if (firstIndex == -1) {
            System.out.println("Not Found");
            System.out.println("Count: 0");
        } else {
            System.out.println("Found");

            int count = 0;
            int position = 0;
            while (position != -1) {
                position = s.indexOf(b, position);
                if (position != -1) {
                    count++;
                    position++;
                }
            }
            System.out.println("Count: " + count);
        }
        System.out.println(); // Empty line between test cases
    }
    public static void main(String[] args) {

        findPositions("the cat and the dog and the bird", "the");
        findPositions("banana","an");
        // Output:
// First occurrence: 4
// Last occurrence: 22
// Found
// Count: 3
//        System.out.println("\n");
//        findPositions("hello world hello java hello", "hello");
//        System.out.println("\n");
//        findPositions("I like apples and apples", "apples");
//        System.out.println("\n");
//        findPositions("one two three", "four");
    }
}
