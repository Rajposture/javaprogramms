import  shape;
class rectanglebox{
    float height;
    float width;
    float lenght;
rectanglebox(float x,float y,float z){
height = x;
width = y;
lenght = z;
}
rectanglebox(float x){
lenght = width = x;
}
float volume(){
    return height * lenght * width;
}
}

public class methodoverloading {
    public static void main(String[] args) {
          rectanglebox rect1 = new rectanglebox(13);
    rectanglebox rect2 = new rectanglebox(12,13,14);
    System.out.println(rect2.volume());
    System.out.println(rect1.volume());
    }
  
}
