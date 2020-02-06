package Outfits.function.Data;

import java.util.HashMap;
import java.util.Map;

public class OutfitsData
{
    private Map<String, String> OutfitsList = new HashMap<String, String>();

    private void Load()
    {
        //Winter : jacket, heavier clothing, and a coat
        //Spring : Lighter clothing, 
        //Summer : Lighter clothing, No Jackets
        //Fall : Long jeans
        OutfitsList.put("Winter", "jacket, heavier clothing, and a coat");
        OutfitsList.put("Spring", "Lighter clothing");
        OutfitsList.put("Summer", "Lighter clothing, No Jackets");
        OutfitsList.put("Fall", "Long jeans");
    }

    private String GetOutfits(Integer temperature)
    {
        if (temperature < 18)
        {
            return "Winter";
        }
        else if(temperature < 24)
        {
            return "Spring";
        }
        else if (temperature < 30)
        {
            return "Fall";
        }
        else
        {
            return "Summer";
        }
    } 

    public OutfitsData() {
        super();
        Load();
    }

    public String GetOutfitsByTemperature(Integer temperature)
    {
        return OutfitsList.get(GetOutfits(temperature));
    }
}