public class Pic extends Media implements Print {
    private int picSize;

    @Override
    public void toPrint() {
        System.out.println(super.message + "; " + "Picture size: " + picSize);

    }
}
