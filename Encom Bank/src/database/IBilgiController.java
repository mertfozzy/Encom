
package database;

import database.transactions.HesapBilgileri;

/**
 *
 * @author mert.altuntas
 */
public interface IBilgiController {
    
    public boolean bilgilerGecerliMi();
    public HesapBilgileri getHesapBilgileri();
   
    
}
