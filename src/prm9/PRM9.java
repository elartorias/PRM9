
package prm9;

import javax.swing.JOptionPane;


public class PRM9 {

   
    public static void main(String[] args) {
        
        
        int n;
        int m;
        
        do
        {
            n = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
            m = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
            
        }while(n<=0 && m<=0);
        
        double[][] matriz1 = new double[n][m];
        double[][] matriz2 = new double[n][m];
        double[][] matriz3 = new double[n][m];
        
        for(int i = 0;i<n; i++)
        {
            for(int j = 0;j<m; j++)
            {
               matriz1[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Dame un numeroide"));
               matriz2[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Dame un numeroide"));
               matriz3[i][j] = matriz1[i][j]+ matriz2[i][j];
            }

        for(int x = 0; x<m; x++)
        {
            for(int y = 0; y<n; y++)
            {
                matriz1[y][x] = matriz1[x][y]; 
            }
        }
            
        }
        
        
        
    }
    
}
