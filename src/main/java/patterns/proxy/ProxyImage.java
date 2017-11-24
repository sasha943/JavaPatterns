package patterns.proxy;

/*
* This proxy patter can be used when we want to catch some event
* Can be used for addition actions such as validation etc
*
* */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            System.out.println("add some validation");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
