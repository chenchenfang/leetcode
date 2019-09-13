package designpattern.factory;

public class PngReader implements Reader{
    @Override
    public void read() {
        System.out.println("PngReader..read");
    }
}
