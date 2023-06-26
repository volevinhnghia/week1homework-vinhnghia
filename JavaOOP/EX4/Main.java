public class Main {
    public static void main(String[] args) {
        JPEGImage newImage = new JPEGImage(1920, 1080);

        newImage.display();
        newImage.resize();
        newImage.rotate();
        newImage.applyFilter();
    }
}