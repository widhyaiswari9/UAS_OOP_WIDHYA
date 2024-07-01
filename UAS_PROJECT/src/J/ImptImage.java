
package J;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author LENOVO
 */
public class ImptImage {
     public static BufferedImage InputImage(String urlGambar){
        BufferedImage bimg =null;
        try{
            bimg = ImageIO.read(new File(urlGambar));
        }catch(IOException e){
            System.out.println("Gagal load gambar; "+e.getMessage());
        }
        return bimg;
    }
}
