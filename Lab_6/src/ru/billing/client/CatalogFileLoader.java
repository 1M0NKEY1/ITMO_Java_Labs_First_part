package ru.billing.client;

import ru.billing.exception.CatalogLoadException;
import ru.billing.exception.ItemAlreadyExistsException;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.ItemCatalog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class CatalogFileLoader extends ItemCatalog implements CatalogLoader
{
    private String _fileName;

    public CatalogFileLoader(String fileName)
    {
        this._fileName = fileName;
    }

    public void load(ItemCatalog cat) throws CatalogLoadException
    {
        File f = new File(_fileName);
        FileInputStream fis;
        String line;

        try
        {
            fis = new FileInputStream(f);
            var s = new Scanner(fis);

            while(s.hasNextLine())
            {
                line = s.nextLine();

                if(line.length()==0) break;

                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);

                FoodItem item = new FoodItem(name, price, null, new Date(), expires);

                cat.addItem(item);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            throw new CatalogLoadException(e.getMessage());
        }
    }
}
