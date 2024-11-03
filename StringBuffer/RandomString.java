import java.util.Random;
class RandomString{
    static String gen(int size){
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            int randChar = (int)(rand.nextFloat() * 26) + 97;
            sb.append((char)randChar);
        }
        return sb.toString();
    } 
}
