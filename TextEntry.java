public class TextEntry extends Abstract_record implements Print {
    String text;

    @Override
    public void getBytes() {
        System.out.println(message.getBytes());
    }


    @Override
    public void toPrint() {
        System.out.println(super.message + "; " + "Contains: " + text);

    }

    public void newEntry() {
        System.out.println("This is TextEntry :" + text);
    }
}

