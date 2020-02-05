public class Video extends Media implements Play {
    private String format;

    public String getFormat() {
        return format;
    }

    public void comparableToPlayer() {
        switch (format) {
            case "avi":
                System.out.println("Video will be played fullscreen in a second");
            case "mp4":
                System.out.println("Unfortunately, the wrong format");
            case "mov":
                System.out.println("Video will be played, but not fullscreen");
        }
    }

    @Override
    public void toPlay() {
        if (format != "mp4"){
            System.out.println("3...2...1...");
        }

    }
}

