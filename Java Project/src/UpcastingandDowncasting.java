class Phone{
    public void start(){
        System.out.println("Phone started");
    }
}
class Camera extends Phone{
    public void start(){
        System.out.println("Camera started");
    }
    public void snap(){
        System.out.println("Photo taken");
    }
}
public class UpcastingandDowncasting {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Camera camera1 = new Camera();

        phone1.start();
        camera1.start();
        camera1.snap();

        //Upcasting
//        Phone phone2 = new Camera();
        Phone phone2 = camera1;
        phone2.start();
        //error: phone2.snap();

        //Downcasting
        Phone phone3 = new Camera();
        Camera camera2 = (Camera) phone3;
        camera2.start();
        camera2.snap();

        //Doesn't work ---- runtime error.
//        Machine machine4 = new Machine();
//        Camera camera3 = (Camera)machine4;
//        camera3.start();
//        camera3.snap();
    }

}
