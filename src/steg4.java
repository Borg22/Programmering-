
public class steg4 {
    public static String sjorovare(String str) {
        
        String sjorovare = "";
        
        String vokaler = "aouåeiyäö";
        
        String konsonanter = "bcdfghjklmnpqrstvwz";
        
        String StoraVokaler = "AOUÅEIYÄÖ";
        
        String StoraKonsonanter = "BCDFGHJKLMNPQRSTVWZ";
        
        for(int i = 0; i < str.length(); i++) {
                            
                            for(int a = 0; a < vokaler.length(); a++) {
                                               
                                               if(str.charAt(i) == vokaler.charAt(a)) {
                                                                   sjorovare = sjorovare + str.charAt(i);
                                               }                  
                            }
                            
                            
                            for(int c = 0; c < StoraVokaler.length(); c++) {
                                               
                                               if(str.charAt(i) == StoraVokaler.charAt(c)) {
                                                                   sjorovare = sjorovare + str.charAt(i);
                                               }                  
                            }
                            
                            for(int b = 0; b < konsonanter.length(); b++) {
                                               
                                               if(str.charAt(i) == konsonanter.charAt(b)) {
                                                                   sjorovare = sjorovare + str.charAt(i) + 'o' + str.charAt(i);
                                               }                                                                             
                            }
                            
                            for(int d = 0; d < StoraKonsonanter.length(); d++) {
                                               
                                               if(str.charAt(i) == StoraKonsonanter.charAt(d)) {
                                                                   sjorovare = sjorovare + str.charAt(i) + 'o' + str.toLowerCase().charAt(i);
                                               }                                                                             
                            }
                            
                            if(str.charAt(i) == 'x') {
                                               sjorovare = sjorovare + "koksos";
                            }
                            
                            if(str.charAt(i) == 'X') {
                                               sjorovare = sjorovare + "Koksos";
                            }
                            
                            if(str.charAt(i) == ' ') {
                                               sjorovare = sjorovare + ' ';
                            }
                            
        }
        
        return sjorovare;
        
}

}



