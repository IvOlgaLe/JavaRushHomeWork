package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Ольга on 21.04.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes par)
    {
           if(par==ImageTypes.BMP)
                    return new BmpReader();
            if(par==ImageTypes.JPG)
                return new JpgReader();
            if(par==ImageTypes.PNG)
                return new PngReader();
        else
                throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
