package designpattern.factory;

/**
 * 工厂模式
 */
public class Main {
    public static void main(String[] args) {
        JpgReaderFactory jpgReaderFactory = new JpgReaderFactory();
        Reader jpgReader = jpgReaderFactory.getReader();
        jpgReader.read();

        PngReaderFactory pngReaderFactory = new PngReaderFactory();
        Reader pngReader = pngReaderFactory.getReader();
        pngReader.read();
    }
}
