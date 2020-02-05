import java.util.Date;

abstract class Abstract_record {
    String author;
    Date date;
    String message;
    Message_Type messageType;

    public abstract void getBytes();

    public void content() {
        System.out.println(author + " " + date + " " + message + " " + messageType);

    }

}



