public class StringBufferDemo {
    public static void main(String[] args) {
        String str = "Hello StringBuffer"; 
        StringBuffer sBuffer = new StringBuffer(str);
        sBuffer.append(", How are you?");
        System.out.println(sBuffer.reverse().reverse());
        System.out.println(sBuffer.delete(18,32));
        System.out.println(sBuffer.insert(5, 123));
        System.out.println(sBuffer.replace(5, 8, "456"));
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.length());
    }
}
