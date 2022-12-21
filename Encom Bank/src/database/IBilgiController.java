
package database;

import database.transactions.HesapBilgileri;

public interface IBilgiController {
    
    public boolean bilgilergecerlimi();
    
    public HesapBilgileri gethesapBilgileri();
    
}
