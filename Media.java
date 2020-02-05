public class Media extends Abstract_record {
    private String media;

    @Override
    public void getBytes() {
        System.out.println(media.getBytes());
    }

    public void newMedia(String media) {
        System.out.println("This is Media:" + media);
    }
}
