package designpattern.factory;

public class JpgReader implements Reader{
    @Override
    public void read() {
        System.out.println("JpgReadet..read");
    }
}
