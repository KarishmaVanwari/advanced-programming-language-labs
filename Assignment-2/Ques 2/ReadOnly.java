class Message{
    private String msg = "This is the read only text.";

    public String getMsg(){
        return msg;
    }
}


public class ReadOnly {

    public static void main(String[] args) {
        Message newMessage = new Message();
        System.out.println(newMessage.getMsg());
    }
}

