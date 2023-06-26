public class JPEGImage extends Image implements Filter {
    

    public JPEGImage(double width, double height){
        super(width, height);
    }


    @Override
    void display() {
        System.out.println("Display image");

    }

    @Override
    void resize() {
        
        System.out.println("Resize Image ");

    }

    @Override
    void rotate() {
        System.out.println("Rotate Image");

    }

    @Override
    public void applyFilter() {
        System.out.println("Apply Filter for Image");

    }

}
